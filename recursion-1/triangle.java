Task:

We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, 
the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows. 

triangle(0) � 0
triangle(1) � 1
triangle(2) � 3

Solution:

public int triangle(int rows) {
 if(rows == 0) return 0;
 return triangle(rows-1)+rows;
}

/*
   example:   
   triangle(4) = triangle(3) + 4
   = triangle(2) + 3 + 4 
   = triangle(1) + 2 + 3 + 4
   = triangle(0) + 1 + 2 + 3 + 4
   = 0 + 1 + 2 + 3 + 4  = 10
*/
