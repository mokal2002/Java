//Write a program to input from user and display eg.Welcome to you on my github page

//Import module util
import java.util.*;

//give a class name
public class welcome {

    public static void main(String[] args) {
        //String function can contain keyword
        String name;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("May I know your Name: ");
        
        //The nextLine() method of java.util.Scanner class advances this scanner past the current line and returns the input that was skipped.
        name=sc.nextLine();
        
        System.out.println("Welcome "+name);
    }
    
}
//Thanks you
//bye
