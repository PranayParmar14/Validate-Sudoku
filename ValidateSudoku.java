//---------------------------------------------------------------------
//--	This is what a comment header should look like.
//--
//--	Pranay Parmar
//--    This program takes a Sudoku board and validates it 
//---------------------------------------------------------------------


public class ValidateSudoku
{
    public static void main (String[] args)
    {
        int [][] sudo = 
        {
        { 6, 3, 9, 5, 7, 4, 1, 8, 2},
        { 5, 4, 1, 8, 2, 9, 3, 7, 6},
        { 7, 8, 2, 6, 1, 3, 9, 5, 4},
        { 1, 9, 8, 4, 6, 7, 5, 2, 3},
        { 3, 6, 5, 9, 8, 2, 4, 1, 7},
        { 4, 2, 7, 1, 3, 5, 8, 6, 9},
        { 9, 5, 6, 7, 4, 8, 2, 3, 1},
        { 8, 1, 3, 2, 9, 6, 7, 4, 5},
        { 2, 7, 4, 3, 5, 1, 6, 9, 8},
        };
        int c, r;
        boolean valid = true;
        for (int i = 0; i < sudo.length; i++) 
        {
            for (int j = 0; j < sudo[i].length; j++) 
            {
                System.out.print(sudo[i][j] + " ");
            }
            System.out.println();
        }

        for (c = 0; c < sudo.length; c = c + 3)
        {
            for (r = 0; r < sudo.length; r = r + 3)
            {
                for (int i = 0; i < sudo.length; i++)
                {
                    {
                        int j = i + 1;
                        while(j < sudo.length)
                        {
                            if(sudo[r + i/3][c + i%3] == sudo[r + j/3][c + j%3])
                            {
                                System.out.println("This section is incorrect because there is a duplicate");
                                valid = false;
                            }
                            j++;
                        }
                    }
                
                    if (sudo[c + i%3][r + i/3] < 1 || sudo[c + i%3][r + i/3]  > 9 )
                    {   
                        System.out.println("This section is incorrect because the numbers are not in the range of 1 and 9");
                        valid = false;
                        
                    }
                }
            }
        }


        if(valid)
        {
            System.out.println("The section is correct.");
        }



        for (c = 0; c < sudo.length; c++)
        {
            for (r = 0; r < sudo.length; r++)
            {
                int r2 = r + 1;
                while (r2 < sudo.length)
	            {
                    if(sudo[r][c] == sudo[r2][c])
                    {
                            System.out.println("This column is incorrect because there is a duplicate");
                            valid = false;
                    }
	                r2++;
	            }
                {
                    if (sudo[c][r] < 1 || sudo[c][r] > 9 )
                    {   
                        System.out.println("This column is incorrect because the numbers are not in the range of 1 and 9");
                        valid = false;
                        
                    }
                }
            }
        }
        if(valid)
        {
            System.out.println("The columns are correct.");
        }


        for (r = 0; r < sudo.length; r++)
        {
            for (c = 0; c < sudo.length; c++)
            {

                int c2 = c + 1;
                while (c2 < sudo.length)
                {
                    if(sudo[c][r] == sudo[c2][r])
                        {
                            System.out.println("This row is incorrect because there is a duplicate");
                            valid = false;
                        }
                    c2++;
                }
                {
                    if (sudo[c][r] < 1 || sudo[c][r] > 9 )
                    {   
                        System.out.println("This row is incorrect because the numbers are not in the range of 1 and 9");
                        valid = false;
                    }
                }
            }
        }
        if(valid)
        {
            System.out.println("The rows are correct.");
        }
    }
}