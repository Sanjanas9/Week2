  case 6:{        
                               deleteSpecific();          
                               display();         
                               break; 
public void deleteSpecific()
{   
  if(no_elements==0)
  {    
    System.out.println("Array is empty");   
  }  
  else{  
    System.out.println("Enter index value");     
    int index=s.nextInt();    
    if(index<no_elements)   
    {         
      for(int i=index;i<no_elements;i++){             
        arr[i]=arr[i+1];       
                                        }               
      no_elements--;    
    }     
  } 
} 
