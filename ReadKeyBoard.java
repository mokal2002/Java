package com.ReadKeyBoard;

// i am going to show you how to scanner read keywords form keyboard
// write a program to read keywords from keyboard using scanner

//import modules
import java.util.Scanner;



public class ReadKeyBoard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //The nextInt() method of Java Scanner class is used to scan the next token of the input as an int.
        
        int x=sc.nextInt();    //Note only 1 time 1 veriable can define i just write only
        //float x=sc.nextInt();
        //double x=sc.nextInt();
        System.out.println("You Enter" + x);

    }
}

//////////Output///////////
// int condition..       //
//  41                   //
//  You Enter: 41        //
///////////////////////////

//////////Output///////////
// float condition..     //
//  41                   //
//  You Enter: 41.00     //
///////////////////////////

//////////Output////////////
//  doublecondition..    //
//  41                   //
//  You Enter: 41.0      //
///////////////////////////

//Thanks you
//bye
