package datasizerange;

//Write a program to display range of Data types int,Float,double
//public class
public class DataSizeRange {

    public static void main(String[] args) {
        //.MIN_VALUE is a constant in the  class of java.lang package that specifies that stores the minimum possible value for any  variable in Java.
        System.out.println("Int Min: "+Integer.MIN_VALUE);
        
        //.MAX_VALUE is a constant in the I class of java.lang package that specifies that stores the maximum possible value for any  variable in Java.
        System.out.println("Int Max: "+Integer.MAX_VALUE);
        
        //.BYTES is a constant in the  class of java.lang package that specifies that stores the possible value for any variable in Java.
        System.out.println("Int Bytes: "+Integer.BYTES);
        
        // System.out.println("Byte Min: "+Byte.MIN_VALUE);
        // System.out.println("Byte Max: "+Byte.MAX_VALUE);
        // System.out.println("Byte Bytes: "+Byte.BYTES);
        
        // System.out.println("FLoat Min: "+Float.MIN_VALUE);
        // System.out.println("Float Max: "+Float.MAX_VALUE);
        // System.out.println("Float Bytes: "+Float.BYTES);
    }
    
}

//Integer Data Range
///////////Output////////////
// Int Min: -2147483648Int //
// Int Max: 2147483647     //
// Int Bytes: 4            //
/////////////////////////////


//Byte Data Range
///////////Output////////////
// Byte Min: -128          //
// Byte Max: 127           //
// Byte Bytes: 1           //
/////////////////////////////



//Float Data Range
///////////Output///////////////
// FLoat Min: 1.4E-45         //
// Float Max: 3.4028235E38    //
// Float Bytes: 4             //
////////////////////////////////


//Thanks you
//bye
