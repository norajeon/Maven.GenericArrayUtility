package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;

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
        return (T[]) mergedArray.toArray();
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }
}
