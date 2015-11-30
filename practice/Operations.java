
import java.util.Arrays;
/**
 * Write a description of class Operations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Operations
{
    public static void x()
    {
        int[] values = {8,4,5,21,7,9,18,2,100};
        int i = 0;

        while (i<values.length)
        {
            i++;
        }
        System.out.println(i-1);
        System.out.println(values);
        System.out.println(Arrays.toString(values));
        System.out.println(values[0]);
        System.out.println(values[8]);
        //System.out.println(values[values.length – 1]);
        System.out.println(" ");
        for ( int e = 0;
        e < values.length;
        e++)
        {
            System.out.println(values[e]);
        }
        i = i-1;
        int first = values[0]; 
        values[0] = values[i];
        values[i] = first;
        System.out.println(values);
        
        
    }
      
        
        
        
    }
    
    

