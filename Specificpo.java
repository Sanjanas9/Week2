import java.util.Scanner;
class Example1 {  
  Scanner s = new Scanner(System.in); 
  int arr[] = new int[100]; 
  int no_elements = 0;  
  public void display()
  {   
    for(int i=0;i<no_elements;i++)
    {    
      System.out.print(arr[i]+" "); 
    }   
  } 
 
  public void insertSpecific()
  {    
    System.out.println("Enter your new value"); 
    int value=s.nextInt();  //78    
     System.out.println("Enter index value ");    
                               int index=s.nextInt();   //3    
                               if(index<=no_elements)
                               {  
                               if(no_elements==0)
                               {        
                                 arr[index]=value;     
                                 no_elements++;   
                               }     
                               else{ 
                                 for(int i=no_elements;i>index;i--)
                                 {                
                                   arr[i]=arr[i-1]; 
                                 }          
                                 arr[index]=value;              
                                 no_elements++;  
                               }         
                               }  
                               else{      
                                 System.out.println("invalid index,index value should be less than "+no_elements); 
                               }     
  } 
 public void viewOptions() {
  int option=0;   
  do
  {    
    System.out.println("3. Insert an element in specific index position");       
    System.out.println("choose your option");   
                               case 1:{        
                               insertSpecific();        
                               display();         
                               break;      
                              }
    {    
                               while(option!=0);     
                              } 
      public static void main(String args[]) {  
                               Example1 obj = new Example1();    
                               obj.viewOptions(); 
                              }
}