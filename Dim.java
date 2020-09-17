
import java.util.*;

class Dimensions{
    double lenght, height, breadth;
    
    Dimensions(){
        lenght = 0;
        height = 0;
        breadth = 0;
    }
    
    Scanner sc = new Scanner(System.in);
    
    double getLength(){
        System.out.println("Enter Length: ");
        lenght = sc.nextDouble();
        return lenght;
    }
    
    double getBreadth(){
        System.out.println("Enter Length: ");
        breadth = sc.nextDouble();
        return breadth;
    }
    
    double getHeight(){
        System.out.println("Enter Length: ");
        height = sc.nextDouble();
        return height;
    }
}
