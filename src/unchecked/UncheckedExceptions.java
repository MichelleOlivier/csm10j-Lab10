/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchecked;

/**
 *
 * @author Michelle
 */
import java.io.*;

public class UncheckedExceptions 
{
    public static void ThrowIndexOutOfBounds()
    {
        int[] intArray = new int[10];
        System.out.print(intArray[10]);
    }
    
    public static void CatchIndexOutOfBounds()
    {
        try
        {             
            int[] intArray = new int[10];
            System.out.print(intArray[10]);
        }         
        catch(ArrayIndexOutOfBoundsException aex)
        {
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
   
    }
    
    public static void CatchIndexOutOfBoundsFinally()
    {
         try
        {             
            int[] intArray = new int[10];
            System.out.println(intArray[9]);
        }         
        catch(ArrayIndexOutOfBoundsException aex)
        {
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
        finally 
        {
             System.out.println("Finally statement executed");
        }
    }
      
    public static void OpenFileChecked()throws IOException
    {
        try
        {
              FileReader textReader = new FileReader("nofile.txt");
        }
        catch(IOException ioex)
        {
            throw ioex;
        }    
    }
}
