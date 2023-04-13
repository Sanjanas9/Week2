class Example1{  
  public static void main(String args[]){     
    int arr[]={23,78,4,220,56,33};  //100   
                                                        int sum=0; 
    for(int i=0;i<arr.length;i++){             if(arr[i]%2==0){  
      sum=sum+arr[i]+5;     
    }
                                 } 
    System.out.println(sum);           
  }
}