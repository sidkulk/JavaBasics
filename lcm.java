import java.util.*;
class lcm{
     public static void main(String[] args)throws Exception{
          funLcm ob1 = new funLcm();
          Scanner sin = new Scanner(System.in);
          int a, b, c;
          System.out.println("Enter any 3 integers: ");
          a = sin.nextInt();
          b = sin.nextInt();
          c = sin.nextInt();
          int lcm = ob1.lcmCalc(a, b, c);
          System.out.println("lcm is: "+lcm);
     }
}

class funLcm{
     public static void main(String[] args){
          funLcm fo = new funLcm();
          int ch = fo.lcmCalc(10, 12, 15);
          System.out.println("local class data's lcm: "+ch);
     }
     int lcmCalc(int x, int y, int z){
          int lcm = (x>y) ? ((x>z) ? x : z) : ((y>z) ? y : z);
          while(true){
               if(lcm%x==0 && lcm%y==0 && lcm%z==0){
                    break;
               }
               else{
                    lcm++;
               }
          }
          return lcm;
     }
}
