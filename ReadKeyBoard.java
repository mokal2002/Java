package com.Java;

// i am going to show you how to scanner read keywords form keyboard
// write a program to read keywords from keyboard using scanner

//import modules
import java.util.Scanner;



public class ReadKeyBoard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //The nextInt() method of Java Scanner class is used to scan the next token of the input as an int.
        int x=sc.nextInt();
        System.out.println(x);

    }
}
