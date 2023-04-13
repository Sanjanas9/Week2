class Example1 {
 
  public static void main(String args[]) {
 
    String str = "hi hello welcome to bitLabs";
 
    char ch[] = new char[str.length()];
 
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    int count = 1;
    for (int i = 0; i < ch.length; i++) {
      for (int j = i + 1; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
          count++;
          ch[j] = ' ';
        }
      }
      if (ch[i] != ' ') {
        System.out.println(ch[i] + " : " + count);
      }
      count = 1;
    }
 
  }
}