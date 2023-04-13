 class Frequency {
  public static void main(String args[]) 
   {
    String str= "hello world"; 
     int count=1;
       for (int i = 0; i < str.length; i++) 
       {
      for (int j = i + 1; j < str.length; j++) {
        if (str[i] == str[j]) {
          count++;
          str[j] = -1;
        }
      }
      if (str[i] != -1) {
        System.out.println(str[i] + "frequency is: " + count);
      }
      count = 1;
       }
   }
 }
   