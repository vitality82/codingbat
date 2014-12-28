/*
We have a number of bunnies and each bunny has two big floppy ears. 
We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication). 
bunnyEars(0) › 0
bunnyEars(1) › 2
bunnyEars(2) › 4
*/

public int bunnyEars(int bunnies) {
  if(bunnies == 0) 
    return 0;
    
  return 2+bunnyEars(bunnies-1);
}

/*
   Example: 
   bunnyEars(4) = 2+bunnyEars(3)
   = 2 + 2 + bunnyEars(2)
   = 2 + 2 + 2 + bunnyEars(1)
   = 2 + 2 + 2 + 2 + bunnyEars(0)
   = 8 + 0 = 8
*/
