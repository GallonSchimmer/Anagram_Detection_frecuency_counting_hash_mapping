import java.util.HashMap;

public class Kata {
  public static boolean isAnagram(String test, String original) {
  
    //to lowerCase and trim white space
    test = test.toLowerCase().trim();
    original = original.toLowerCase().trim();
       
    char letterOriginal;
    char letterTest;
    boolean isAnagram = false;
    
        //check if lengths are equal, if not return false
        int originalLength = original.length();
        int testLength = test.length();
          
          if(originalLength != testLength){
             isAnagram = false;
          }
    
    //for doubled characters, do not increment the counter and compare them in the end
    int countCharacter1 = 0;
    int countCharacter2 = 0;
    
    HashMap<Integer, Character> map1 = new HashMap<Integer, Character>();
    HashMap<Integer, Character> map2 = new HashMap<Integer, Character>();
    
      //for loop through string original to establish a counter using the HashMap
      for(int i = 0; i < original.length(); i++){
        letterOriginal = original.charAt(i);
          
           if(map1.containsValue(letterOriginal)){
          
             countCharacter1 = countCharacter1 - 1; //if map contains character decrement count
          
           }else{
             map1.put(i, letterOriginal);
           
             countCharacter1++;  
           }  
      }
      
      //the same for the test string to then compare the counters and check if same number characters used           
      for(int j = 0; j < test.length(); j++){
        letterTest = test.charAt(j);
         
           if(map2.containsValue(letterTest)){ //to avoid repeated characters
          
             countCharacter2 = countCharacter2 - 1; 
          
           }else{
             map2.put(j, letterTest);
          
             countCharacter2++;
          
           } 
      }
    
      if(countCharacter1 == countCharacter2){
        System.out.println("counter1 : " + countCharacter1 + " " + "counter2: "+ countCharacter2);
          isAnagram = true;
           
        }else{
        System.out.println("counter1 : " + countCharacter1 + " " + "counter2: "+ countCharacter2);
          isAnagram = false;
      }
    
    System.out.println("isAnagram: " + isAnagram);
    return isAnagram;
    
  }
}