/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checked;

/**
 *
 * @author Michelle
 */
import java.io.*;

public class CheckedExceptions 
{
    public static void OpenFileChecked() throws IOException
    {
        try
        {
            FileReader fr = new FileReader("nofile.txt");
        }
        catch (IOException ex)
        {
            throw ex;
        }
    }
}
