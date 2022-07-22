package com.genericmethod;

import java.util.*;

public class MaximumNumber extends GenericClass
{
    /*
    Main Function to Get Values from User and to pass to the respective Function using Objects...
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Finding Maximum Number Using Generics");
        System.out.println("-------------------------------------\n");
        /*
        Code for Asking User to find Max value of a Specific Data Type
         */
        while (true) {
            System.out.println("Enter 1 for INTEGER");
            System.out.println("Enter 2 for FLOAT");
            System.out.println("Enter 3 for STRING");
            System.out.println("Enter 4 to give More than 3 Parameters");
            System.out.println("Enter 5 for EXIT");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Enter three Value of Integer to Find Max Value");
                    //calling CalculateMax generic funtion to calculate the maximum value
                    GenericClass integerValue = new GenericClass(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Enter three Value of Float to Find Max Value");
                    //calling CalculateMax generic funtion to calculate the maximum value
                    GenericClass floatValue = new GenericClass(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Enter three Value of String to Find Max Value");
                    //calling CalculateMax generic funtion to calculate the maximum value
                    GenericClass stringValue =  new GenericClass(scanner.next(), scanner.next(), scanner.next());
                    System.out.println("\n");
                    break;
                case 4:
                    /*
                    Case to give more than 3 values and find which Number is Maximum
                     */
                    while (true)
                    {
                        System.out.println("Enter 1 for INTEGER");
                        System.out.println("Enter 2 for FLOAT");
                        System.out.println("Enter 3 for STRING");
                        input = scanner.nextInt();
                        switch (input)
                        {
                            case 1:
                                System.out.println("Enter No of Parameters");
                                int size = scanner.nextInt();
                                List<Integer> arrayInt = new ArrayList<Integer>(size);
                                for(int i = 0 ; i < size ; i++)
                                {
                                    Integer n = scanner.nextInt();
                                    arrayInt.add(n);
                                }
                                GenericClass integerVal = new GenericClass(arrayInt);
                                break;
                            case 2:
                                System.out.println("Enter No of Parameters");
                                size = scanner.nextInt();
                                System.out.println("Enter the Values");
                                List<String> arrayFloat = new ArrayList<String>(size);
                                //calling CalculateMax generic funtion to calculate the maximum value
                                for(int i = 0 ; i < size ; i++)
                                {
                                    String n = scanner.next();
                                    arrayFloat.add(n);
                                }
                                GenericClass floatVal = new GenericClass(arrayFloat);
                                break;
                            case 3 :
                                System.out.println("Enter No of Parameters");
                                size = scanner.nextInt();
                                List<String> arrayString = new ArrayList<String>(size);
                                System.out.println("Enter the Values");
                                for(int i = 0 ; i < size ; i++)
                                {
                                    String n = scanner.next();
                                    arrayString.add(n);
                                }
                                GenericClass stringVal = new GenericClass(arrayString);
                                break;
                            default:
                                break;
                        }
                        break;
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
