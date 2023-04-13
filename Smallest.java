class Example1 {
 
  public static void main(String args[]) {
 
    String str = "hidgdfgdf hello welcome to bitLabs kjshfkjhhsk";
 
      String words[]=str.split(" ");
      int wordLength=0;
       String smallestWord=null;
          int min=words[0].length();
    for(int i=0;i<words.length;i++){
    
          wordLength=words[i].length();  // hi-5
              if(min>=wordLength){       // 2<5
                min=wordLength;          // max=5
                 smallestWord=words[i];     //hello    
              }
        
    }
    System.out.println("Smallest word: "+smallestWord);
 
  }
}