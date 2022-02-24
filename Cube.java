//write a code to display area and volume

//Imports modules
import java.lang.*;
import java.util.*;


public class Cube {

    
    public static void main(String[] args) 
    {
        Scanner sc=new  Scanner(System.in);
        int length,breadth,height;    
        int totalArea,volume;
        
        System.out.println("Enter length, breadth and height: "); //Input from user 
		//The nextInt() method of Java Scanner class is used to scan the next token of the input as an int.?
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        
        totalArea=2*(length*breadth+length*height+breadth*height); // Formula for calculating Area of cube
        
        volume=length*breadth*height; //Formula for calculat volume
        
        System.out.println("Total Area: "+totalArea);
        System.out.println("Volume: "+volume);
        
        
    }
    
}

//                     ________________________
//                    /|                      /|
//                   / |                     / |
//                  /__|___________________ /  |                        
//                 |   |                   |   |
//                 |   |                   |   | 
//                 |   |___________________|___|               
//  Hight  -       |   /                   |   /
//                 |  /                    |  /-Breath
//                 | /                     | /
//                 |/______________________|/
//                           Length
//
///////////////////Output//////////////////
// Enter length, breadth and height:     //
// 5                                     //
// 6                                     //
// 8                                     //
// Total Area: 236                       //
// Volume: 240                           //
///////////////////////////////////////////

//Thanks You
//Bye
