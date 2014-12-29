/*
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length. 

strDist("catcowcat", "cat") › 9
strDist("catcowcat", "cow") › 3
strDist("cccatcowcatxx", "cat") › 9
*/

public int strDist(String str, String sub) {
  
  int strLen = str.length();
  int subLen = sub.length();
  
  if( strLen  < subLen )
    return 0;
  
  // largest in str boundaries
  if(str.substring(0,subLen).equals(sub) &&
     str.substring(strLen-subLen).equals(sub))
  {
    return strLen;
  }
  
  // shift one position if sub not detected
  if(!str.substring(0, subLen).equals(sub))
    return strDist(str.substring(1), sub);
  
  // str starts with sub, no look for ending sub..
  else
    return strDist(str.substring(0, strLen-1), sub);
}

