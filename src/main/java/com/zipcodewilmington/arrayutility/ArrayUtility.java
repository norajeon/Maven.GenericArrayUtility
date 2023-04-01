package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] inputArray;
    ArrayList<T> mergedArray;
    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
        this.mergedArray = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            mergedArray.add(inputArray[i]);
        }
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        for(int i = 0; i < arrayToMerge.length; i++) {
            mergedArray.add(arrayToMerge[i]);
        }
        Integer count = 0;
        for(T ans : mergedArray) {
            if(ans == valueToEvaluate) {
                count++;
            }

        }
        return count;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for (T ans : mergedArray) {
            if (ans.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        for(int i = 0; i < mergedArray.size(); i++) {
            if(mergedArray.get(i).equals(valueToRemove)) {
                mergedArray.remove(mergedArray.get(i));
            }
        }
//        for(int j = 0; j < mergedArray.size(); j++) {
//
//        }
//new instance creates new array
        T[] items = (T[]) Array.newInstance(mergedArray.get(0).getClass(), mergedArray.size());

        for (int j = 0; j <mergedArray.size(); j++) {
            items[j] = mergedArray.get(j);
        }


        return items;

//        return (T[]) Arrays.copyOf(mergedArray);

//        return (T[]) mergedArray.toArray();
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {

        for(T ans : arrayToMerge) {
            mergedArray.add(ans);
        }
        int count = 1, tempC;
        T frequent = mergedArray.get(0);
        T temp;

        for (int i = 0; i < mergedArray.size()-1; i++) {
            temp = mergedArray.get(i);
            tempC = 0;
            for (int j = 1; j < mergedArray.size(); j++) {
                if (temp == mergedArray.get(j)) {
                    tempC++;
                }
            }
            if (tempC > count) {
                frequent = temp;
                count = tempC;
            }

        }    return frequent;

//    Map<T, Integer> map = new HashMap<>();
//        for (T a : arrayToMerge) {
//            if (map.containsKey(a)) {
//                map.put(a, map.get(a) + 1);
//            }
//            else {
//                map.put(a, 1);
//            }
//        }


    }
}
