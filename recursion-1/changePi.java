/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14". 

changePi("xpix") � "x3.14x"
changePi("pipi") � "3.143.14"
changePi("pip") � "3.14p"
*/

public String changePi(String str) {
  
  if(str.length() < 2) 
    return "";
    
  if(str.charAt(0)=='p' && str.charAt(1)=='i')
    return "3.14"+ changePi(str.substring(2)); 
  else
    return Character.toString(str.charAt(0))+changePi(str.substring(1));
}