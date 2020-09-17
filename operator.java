import java.util.*;
import java.io.*;

class Sol{
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        String[] strSplit = s.split("\\|", -1);
        for(int i=0;i<strSplit.length;i++){
            System.out.print(strSplit[i]);
        }
    }
}
