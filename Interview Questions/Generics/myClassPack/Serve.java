package myClassPack;

import java.util.Scanner;

public class Serve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double volume = 0.0;
        String liq = "";
        System.out.print("What do you want? Water OR Juice?: ");
        liq = sc.nextLine();

        if (liq.equals("juice") || liq.equals("Juice")) {
            System.out.print("\nHow much juice(ml)?: ");
            volume = sc.nextDouble();
            Glass<Juice> glass = new Glass<Juice>(new Juice(volume, 997));
            System.out.println(glass.getLiquid());
        } else if (liq.equals("water") || liq.equals("Water")) {
            System.out.print("\nHow much Water(ml)?: ");
            volume = sc.nextDouble();
            Glass<Water> glass = new Glass<Water>(new Water(volume, 997));
            System.out.println(glass.getLiquid());
        } else{
            System.err.println("Incorrect option! You service will now terminate");
        }

        sc.close();
    }
}
