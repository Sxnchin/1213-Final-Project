import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bakery bakery = new Bakery();

        try {
        Bread bread1 = new Bread("Italian Bread", 3.5, "Spaghetti flavor");
        Cake cake1 = new Cake("Chocolate Cake", 31.0, "Chocolate");
        Cookies cookie1 = new Cookies("Oatmeal Raisin",15.0,12);

        bakery.addBakedItem(bread1);
        bakery.addBakedItem(cake1);
        bakery.addBakedItem(cookie1);

        System.out.println("Welcome to the Bakery! \n\nIf you would like to see the menu, enter 1\n\nIf you would like to exit the Bakery, enter 2\n");
        
        while(true) {
        int inp1 = scanner.nextInt();
        if (inp1 == 1){
            bakery.displayMenu();
            System.out.println("Enter the number of the item you want to buy, or 0 to go back:");
            int itemNumber = scanner.nextInt();
            if (itemNumber != 0) {
                bakery.buyItem(itemNumber);
                break;
                }
        } else if (inp1 == 2){
            break;
        } else {
            System.out.println("Please enter a valid input!");
        }
        }

        

        } catch (InvalidPriceException e) {
    System.out.println("Error ");
    } 

    }
    }
