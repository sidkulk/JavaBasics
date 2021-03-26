package myPack;

import java.util.Scanner;
import static java.lang.System.out;
/**
 *  This is a Java source file to demonstrate 
 *  various methods to add data into an array
 *  along with their complexities
 */
class ArrayDatastruct {
    static int count;
    public static void main(String[] args) throws Exception {
        //an array of size 40 bytes.
        int arr[] = new int[10];

        insert(arr, 34);
        insert(arr, 56);

        show(arr);
        out.println("=======================");
        addAtBeg(arr, 99);
        out.println("=======================");
        show(arr);
        out.println("=======================");
        addAtBeg(arr, 10);
        show(arr);
        addAtIndex(arr, 2, 821);
        out.println("=======================");
        show(arr);
     // addAtIndex(arr, 11, 65); this will throw a runtime exception.
    }

    //method to insert element at end
    //Complexity: O(1) 
    public static void insert(int[] arr, int value) {
        arr[count++] = value;
    }

    public static void show(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            out.println("arr["+i+"] = "+arr[i]);
        }
    }
    
    //method to add an element at the beginning index.
    //Complexity: O(n)
    public static void addAtBeg(int[] arr, int val) {
        for(int i=count;i>0;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = val;
        count += 1;
    }
    
    //method to add element at a given index
    //Complexity: O(n)
    public static void addAtIndex(int[] arr, int index, int value) {
        if(index > arr.length-1) {
            throw new RuntimeException("Array index exceeded the limit");
        } else {
            for(int i=count;i>=index;i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = value;
        }
    }
}
