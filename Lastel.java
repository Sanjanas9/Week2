import java.util.Scanner;
  class Lastel{
 Scanner s = new Scanner(System.in);
    int arr[]=new int[100];
    int numele=0;
    public void Lastinsert(){
      System.out.println("Enter your value to insert in Last index value");
      int num=s.nextInt();
       if(numele==0)
       {
         arr[0]=num;
         numele++;
       }
      else{
     
   arr[0]=num;
      numele++;
    }
    }
public void display()
    {
      for(int i=0;i<numele;i++)

        {
          System.out.print(arr[i]+" "); 
        }
    }
    public void viewoptions(){
      int option=0;
      do{
         System.out.println("1.insert an elemet in last index position");
        System.out.println("choose your option");
        option=s.nextInt();
        switch (option){
          case 1:
           Lastinsert();
            display();
           
        }
      }
        while(option!=0);
    }
    public static void main(String agrs[]){
     Lastel obj=new Lastel();
      obj.viewoptions();
    }
  }
  
