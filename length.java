class Example1 {
 
  public static void main(String args[]) {
 
    String str = "hi hello welcome to bitLabs hello welcome to Java";
 
    String words[] = str.split(" ");
 
    System.out.println(words[0] + " :  " + words[0].length());
    System.out.println(words[words.length - 1] + "  :  " + words[words.length - 1].length());
 
  }
}