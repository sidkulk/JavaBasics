import java.util.*;
import java.io.*;
import java.net.*;


class shaGen{
     double x, y, res;
     public static void main(String args[])throws Exception{
          Scanner sin = new Scanner(System.in);
          int ch, c;
          ch = 1;
          do{
               System.out.println("Calculator menu: ");
               System.out.println("*************************");
               System.out.println("1)Addition");
               System.out.println("2)Subtraction");
               System.out.println("3)Multiplication");
               System.out.println("4)Division");
               System.out.println("5)Exit");
               System.out.println("*************************");
               System.out.print("choice: ");
               c = sin.nextInt();
               System.out.println();
               switch(c){
                    case 1:{
                         Operation op = new Operation();
                         shaGen s1 = new shaGen();
                         System.out.println("Enter any 2 numbers: ");
                         s1.x = sin.nextDouble();
                         s1.y = sin.nextDouble();
                         op.Add(s1.x, s1.y);
                         //op.res = op.Add(s1.x, s1.y);
                         //System.out.println("The Addition is: "+op.res);
                    }
                    break;

                    case 2:{
                         Operation op = new Operation();
                         shaGen s1 = new shaGen();
                         System.out.println("Enter any 2 numbers: ");
                         s1.x = sin.nextDouble();
                         s1.y = sin.nextDouble();
                         op.Sub(s1.x, s1.y);
                        /* op.res = op.Sub(s1.x, s1.y);
                         System.out.println("The Difference is: "+op.res);*/
                    }
                    break;

                    case 3:{
                         Operation op = new Operation();
                         shaGen s1 = new shaGen();
                         System.out.println("Enter any 2 numbers: ");
                         s1.x = sin.nextDouble();
                         s1.y = sin.nextDouble();
                         op.Mul(s1.x, s1.y);
                         /*op.res = op.Mul(s1.x, s1.y);
                         System.out.println("The Product is: "+op.res);*/
                    }
                    break;

                    case 4:{
                         Operation op = new Operation();
                         shaGen s1 = new shaGen();
                         System.out.println("Enter any 2 numbers: ");
                         s1.x = sin.nextDouble();
                         s1.y = sin.nextDouble();
                         op.Div(s1.x, s1.y);
                        /* op.res = op.Div(s1.x, s1.y);
                         System.out.println("The Division is: "+op.res);*/
                    }
                    break;

                    case 5:{
                         System.exit(0);
                    }
               }
               System.out.println("Do you want to repeat the program?(1/0): ");
               ch = sin.nextInt();
          }while(ch==1);
     }
}

class Operation{
     double res;
     void Add(double a, double b){
          Operation op = new Operation();
          op.res = a + b;
          System.out.println("Addition is: "+op.res);
          //return op.res;
     }

     void Sub(double a, double b){
          Operation op = new Operation();
          op.res = a - b;
          System.out.println("Difference is: "+op.res);
          //return op.res;
     }

     void Mul(double a, double b){
          Operation op = new Operation();
          op.res = a * b;
          System.out.println("Multiplication is: "+op.res);
          //return op.res;
     }

     void Div(double a, double b){
          Operation op = new Operation();
          try{
          op.res = a / b;
          System.out.println("Division is: "+op.res);
          }catch(ArithmeticException exe){
               System.out.println("An "+exe+" was caught");
          }
          //return op.res;
     }
}
