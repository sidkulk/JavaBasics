import java.util.*;

class sortAlgo{
     public static void main(String args[])throws Exception{
          int size;
          Scanner sin = new Scanner(System.in);
          System.out.println("Enter the size of array: ");
          size = sin.nextInt();
          int[] arr = new int[size];
          System.out.println("Enter the array elements: ");
          for(int i=0;i<size;i++){
               arr[i] = sin.nextInt();
          }
          
          System.out.println("Array before sort: ");
          System.out.print("[ ");
          for(int i=0;i<size;i++){
               System.out.print(arr[i]+" ");
          }
          System.out.print("]");
          System.out.println();
          sortClass s = new sortClass();
          int[] Sarr = new int[size];
          Sarr = s.AscendSort(arr);
          System.out.println("Array after sorting: ");
          for(int i=0;i<size;i++){
               System.out.print(Sarr[i]+" ");
          }
     }
}


class sortClass{
     Swap s = new Swap();
     int[] AscendSort(int[] arr){
          for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                         s.swap(arr[j], arr[j+1]);     
                    }
               }
          }
          return arr;
     }
}

class Swap{
     void swap(int i, int j){
          int temp;
          temp = i;
          i = j;
          j = temp;
     }
}
