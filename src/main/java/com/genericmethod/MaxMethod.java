package com.genericmethod;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MaxMethod
{
    /*
    Generic Method to find the maximum Value and sorted Values
     */
    <E extends Comparable> E findMax(List<E> array)
    {
            System.out.println("The Max value is "+ Collections.max(array));
            Collections.sort(array);
            System.out.println("The Sorted Array " + array);
            return (E) Collections.max(array);
    }
}
