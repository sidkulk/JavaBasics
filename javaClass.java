import java.util.*;

class javaClass{
     public static void main(String args[])throws Exception{
          Scanner sin = new Scanner(System.in);
          String name;
          System.out.print("Enter your name: ");
          name = sin.nextLine();
          System.out.println(" Welcome "+name+" to the world of java in Linux environment");
     }
}


class AddClass{
     double res;
     double Addoper(){
          res = x+y;
          return res;
     }
}

class SubClass extends AddClass{
     
}

class DivClass extends AddClass{

}

class MulClass extends AddClass{

}
