
/**
 * Write a description of class PartialArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PartialArray
{
    private int[] values;
    private int currentSize;

    public PartialArray()
    {
        this.values = new int[100];

        for(this.currentSize = 0;
        this.currentSize <10;
        this.currentSize++)
        {
            this.values[this.currentSize] = 
            this.currentSize * this.currentSize;
        }

    }

    public void remove(int pos)
    {
        for(int i = pos+1;
        i<currentSize;
        i++)
        {
            values[i-1]=values[i];
        }
        currentSize--
    }
    
    public void insert (int newValue)
    if(this.currentSize < this.values.length)
    {this.currentSize++;
        for (int i = this.currentSize - 1 ;
        i > pos;
        i--)
        {
            this.values[pos]=newValue;
        }
    }
    
    public void swap(int pos1, int pos2)
    {
        if(pos1<this.currentSize&&POS2<this.currentsize)
        {
            int temp = this.valaues[pos1];
            this.values[pos1] = this.values[pos2];
            this.values[pos2]=temp;
            } 
    } 
    
    
    
    
    
        
}