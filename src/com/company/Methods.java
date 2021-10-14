package com.company;

public class Methods {

    //in: int[]; out: int
    //Computes maximum from a given array
    public int max_nr(int[] array){
        int max = 0;
        for(int i=0; i<array.length; i++)
            if(array[i] > max)
                max = array[i];
        return max;
    }

    //in: int[]; out: int
    //Computes minimum from a given array
    public int min_nr(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++)
            if(array[i] < min)
                min = array[i];
        return min;
    }

    //in: int[]; out: int
    //Computes maximum sum with n-1 elements from a given array
    //where n = array.length()
    public int max_sum(int[] array){
        int min = min_nr(array), sum=0;
        for(int i=0; i<array.length; i++)
            if(array[i] != min)
                sum+=array[i];

        return sum;
    }

    //in: int[]; out: int
    //Computes minimum sum with n-1 elements from a given array
    //where n = array.length()
    public int min_sum(int[] array){
        int max = max_nr(array), sum=0;
        for(int i=0; i<array.length; i++)
            if(array[i] != max)
                sum+=array[i];

        return sum;
    }

}
