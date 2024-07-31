import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        double km, per_price = 0.1, price;
        int age, flightType; // 1 = one way | 2 = round trip

        System.out.print("Your age: ");
        age = inp.nextInt();
        System.out.print("Flight distance: ");
        km = inp.nextDouble();
        System.out.print("Flight Type | 1 -> One way Ticket | 2 -> Round Trip | (1) (2) : ");
        flightType = inp.nextInt();


        if (age < 0 && km < 0){
            if (flightType == 1 || flightType == 2){
                System.out.println("Your age and distance information is invalid");
            }
            else {
                System.out.println("You entered invalid informations.");
            }
        }
        else if (age > 0 && km < 0){
            if (flightType == 1 || flightType == 2){
                System.out.println("Your distance information is invalid.");
            }
            else{
                System.out.println("Your flight type and distance information is invalid.");
            }
        }
        else if (age > 0 && km > 0){
            if (flightType == 1 || flightType == 2){
                System.out.println("...the transaction is being performed...");
                price = per_price * km;
                double age_discount = 0, flightType_discount = 0;

                if (age < 12) age_discount = price / 2;
                if (age > 12 && age < 24) age_discount = price / 10;
                if (age > 65) age_discount = (price * 3) / 10;

                System.out.println("Price without discount: "+ price);
                System.out.println("Age discount: " +age_discount);
                price -= age_discount;
                System.out.println("Price with age discount: "+price);
                if(flightType == 2) flightType_discount = price / 5;
                System.out.println("Flight type discount: "+flightType_discount);
                price -= flightType_discount;
                if(flightType == 2) price = price * 2;
                System.out.println("Net amount you need to pay: " +price);
            }
            else{
                System.out.println("Your flight type information is invalid.");
            }
        }
    }
}