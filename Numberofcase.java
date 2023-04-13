class Example1 {
 
    public static void main(String args[]){
      String str="hi hello 123 ^&&3 welcome 923%$# to bitLabs";
      int uppercase=0;
      int lowercase=0;
 
      for(int i=0;i<str.length();i++){
 
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
              uppercase++;
      }
      else if (str.charAt(i)>='a'&& str.charAt(i)<='z'){
       lowercase++;
      }
      }
       System.out.println("number of uppercase" +uppercase);
        System.out.println("number of lowercase" +lowercase);
        
}
      }
  
  
    
