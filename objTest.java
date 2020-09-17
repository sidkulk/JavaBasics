import java.util.*;


class Box{
    public static void main(String args[])throws Exception{
        
        Box myBox = new Box();
        Scanner sc = new Scanner(System.in);
        
        Dimensions dim = new Dimensions();
        double len = dim.getLength();
        double bre = dim.getBreadth();
        double hgt = dim.getHeight();
        
        int ch = 0;
        do{
            System.out.println("Press 1, 2 or 3 to: ");
            System.out.println("1) Calculate Total Surface Area of the box");
            System.out.println("2) Calculate Total Volume of the box");
            System.out.println("3) Enter new dimensions of the box");
            System.out.println("4) Exit");
            ch = sc.nextInt();
            
            switch(ch){
                case 1:{
                    double res = myBox.getTotalSurfaceArea(len, bre, hgt);
                    System.out.printf("The total surface area of the box is: %.2f",res);
                }
                break;
                
                case 2:{
                    double res = myBox.getVolume(dim.lenght, dim.breadth, dim.height);
                    System.out.printf("The total volume of the box is: %.2f",res);
                }
                break;
                
                case 3:{
                    len = dim.getLength();
                    bre = dim.getBreadth();
                    hgt = dim.getHeight();
                }
                break;
                
                case 4:{
                    System.exit(0);
                }
                
                default :{
                    System.out.println("Enter a valid option ");
                }
            }
            System.out.println();
            System.out.println("Do you want to continue?[y/n]");
            String c = sc.next();
            if(c.equals("n")){
                ch = 0;
            }
        }while(ch!=0);
               
    }
    double getTotalSurfaceArea(double lenght, double breadth, double height){
        return (2*((lenght*breadth)+(lenght*height)+(breadth*height)));
    }
    
    double getVolume(double lenght, double breadth, double height){
        return (lenght*breadth*height);
    }
}
