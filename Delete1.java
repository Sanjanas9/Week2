import java.util.Scanner;
 class Example1 {  
 Scanner s = new Scanner(System.in); 
 int arr[] = new int[100];  
int no_elements = 0;  
 public void display(){  
 for(int i=0;i<no_elements;i++){  
   System.out.print(arr[i]+" ");  
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
  public void viewOptions() { 
  int option=0;   
 do{ 
     System.out.println("4. Delete an element in first index ");
   System.out.println("0. EXIT");       
  System.out.println("choose your option");  
  option=s.nextInt();  
  switch(option){      
case 1:      
  {         
deleteFirst();       
   display();         
 break;        
}  
   case 0:{    
    System.out.println("Thank you");
        break;      }    }    }    
  while(option!=0);      
  }  
 public static void main(String args[]) {     
Example1 obj = new Example1();   
 obj.viewOptions();   }}