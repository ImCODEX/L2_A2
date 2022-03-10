package com.company;

public class Methods {

    /**
     * Computes maximum from a given array
     * @param array: array of numbers
     * @return: maximum
     */
    public int maxNr(int[] array){
        int max = 0;
        for (int j : array)
            if (j > max)
                max = j;
        return max;
    }

    /**
     * Computes minimum from a given array
     * @param array: array of numbers
     * @return: minimum
     */
    public int minNr(int[] array){
        int min = Integer.MAX_VALUE;
        for (int j : array)
            if (j < min)
                min = j;
        return min;
    }

    /**
     * Computes maximum sum with n-1 elements from a given array
     * @param array: array of numbers
     * @return: maximum sum
     */
    public int maxSum(int[] array){
        int min = minNr(array), sum=0;
        for (int j : array)
            if (j != min)
                sum += j;

        return sum;
    }

    /**
     * Computes minimum sum with n-1 elements from a given array
     * @param array: array of numbers
     * @return: minimum sum
     */
    public int minSum(int[] array){
        int max = maxNr(array), sum=0;
        for (int j : array)
            if (j != max)
                sum += j;

        return sum;
    }

}
