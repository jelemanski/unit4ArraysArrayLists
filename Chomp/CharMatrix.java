// Implements a 2-D array of characters

public class CharMatrix
{
    // Instance variables:
    char[][] grid;
    // Constructor: creates a grid with dimensions rows, cols,
    // and fills it with spaces
    public CharMatrix(int rows, int cols)
    {
        char[][] grid = new char[rows][cols];

        for(int i=0; i<rows ;i++)
        {
            for(int e = 0; e<cols;e++)
            {
                grid[i][e] = ' ';
            }

        }

    }
    // Constructor: creates a grid with dimensions rows , cols ,
    // and fills it with the fill  character
    public CharMatrix(int rows, int cols, char fill)
    {
        char[][] grid = new char[rows][cols];
        for(int i=0; i<rows ;i++)
        {
            for(int e = 0; e<cols;e++)
            {
                grid[i][e] = fill;
            }

        }
    }

    // Returns the number of rows in grid
    public int numRows()
    {
        return grid.length;
    }

    // Returns the number of columns in grid
    public int numCols()
    {
        return grid[0].length;
    }

    // Returns the character at row, col location
    public char charAt(int row, int col)
    {
        return grid[row][col];
    }

    // Sets the character at row, col location to ch
    public void setCharAt(int row, int col, char ch)
    {
        ch = grid[row][col];
    }

    // Returns true if the character at row, col is a space,
    // false otherwise
    public boolean isEmpty(int row, int col)
    {
        if (grid[row][col] == ' ')
        { 
            return true;
        }
        else
        {
            return false;
        }
    }

    // Fills the given rectangle with fill  characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        for( int i=row0; i<=row1; i++)
        {
            for(int e=col0; e<=col1; e++)
            {

                grid[i][e] = fill;

            }
        }

    }
    // Fills the given rectangle with SPACE characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void clearRect(int row0, int col0, int row1, int col1)
    {
        for(int i=row0; i<=row1; i++)
        {
            for(int e=col0; e<=col1; e++)
            {

                grid[i][e] = ' ';

            }
        }
        
    }

    // Returns the count of all non-space characters in row 
    public int countInRow(int row)
    {
        int e = 0;
       for(int i = 0; i<=row;i++)
       {
           if (row[i] == ' ')
           { e++
            }
        }
    }

    // Returns the count of all non-space characters in col 
    public int countInCol(int col)
    {
         for(int i=0; i<=col.length();i++)
       {
           return i;
    }
    }
}
