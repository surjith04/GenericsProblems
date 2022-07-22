package com.genericmethod;


/*
Generic Class Created to Refactor take in 3 variables of
Generic Type
 */


import java.util.List;

class GenericClass extends MaxMethod
{
    /*
    NoArgsConstructor
    */
    GenericClass() {}

    /*
    Parameterized Constructor with three Generic Arguments
     */
    <E extends Comparable> GenericClass(E a , E b , E c)
    {
         testMaximum(a,b,c);
    }
    <E extends Comparable> GenericClass(List<E> array)
    {
        E number = findMax(array);
        printMaxVal(number);
    }
    /*
    TestMaximum Function to calculate the Maximum Value of a Selected Dataype
     */
    static <E extends Comparable> E testMaximum(E a, E b , E c)
    {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
        {
            return printMax(a);
        }
        else if (b.compareTo(c) > 0 && b.compareTo(a) > 0)
        {
            return printMax(b);
        }
        else if (c.compareTo(a) > 0 && c.compareTo(b) > 0)
        {
            return printMax(c);
        }
        else
        {
            return null;
        }
    }

    /*
    Generic Function to Print the Maximum Values
     */
    static <E> E printMax(E num)
    {
        System.out.println("The Maximum Value is " + num);
        return null;
    }

     /*
    Generic Function to Print the Maximum Values with more than 3 parameters
     */

    static <E> E printMaxVal(E number)
    {
        System.out.println("The Maximum Value Of the Case -[More than 3 Parameters]- " + number);
        return null;
    }
}
