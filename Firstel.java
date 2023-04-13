import java.util.Scanner;
  class Firstel{
 Scanner s = new Scanner(System.in);
    int arr[]=new int[100];
    int numele=0;
    public void insert(){
      System.out.println("Enter your value to insert in first value");
      int num=s.nextInt();
       if(numele==0)
       {
         arr[0]=num;
         numele++;
       }
      else{
      for(int i=numele;i>0;i--)
        {
          arr[i]=arr[i-1];
        }    
   arr[0]=num;
      numele++;
    }
    }
     public void deleteFirst(){ 
  if(no_elements==0){     
System.out.println("Array is empty");  
 }  
  else
  {   
 for(int i=0;i<no_elements;i++){    
  arr[i]=arr[i+1];  
  }   
 no_elements--;  
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
         System.out.println("1.insert an elemet in first index position");
         System.out.println("4. Delete an element in first index ");
        System.out.println("choose your option");
        option=s.nextInt();
        switch (option){
          case 1:
            insert();
            display();
        }
        case 2:     
     {         
deleteFirst();       
   display();         
 break;        
}  
   case 0:{    
    System.out.println("Thank you");
        break;      }     
      }
      
        while(option!=0);
    }
    public static void main(String agrs[]){
      Firstel obj=new Firstel();
      obj.viewoptions();
    }
  }
  