import java.util.Scanner;
 
public class SecondExample {
  public static void main(String[] args) {
 
    // int arr[]= {1,2};//1 dimensional array
    int arr[][] = { { 2,3,4},{5,6,7},{8,9,10}};// 2 dimensional array
 
    // arr[0][2]=10;
    // arr[1][1]=15;
    int sum=0;
    for (int i = 0; i < arr.length; i++)
      {
      for (int j = 0; j < arr[i].length; j++)     
       // sum=sum+arr[i][j];
        if(i==j){
          //System.out.println(arr[i][j]);
          sum=sum+arr[i][j];
        }
                   
      }
    System.out.println("trace of the matrix is:"+sum);
    
      
  }
}
 