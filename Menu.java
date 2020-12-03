package budget;

import java.io.IOException;
import java.util.*;

public class Menu {

    private static double income;
    private static String purchase;
    private static double balance;
    private static List arrayList = new ArrayList();
    private static double purchaseTotalPrice;
    private static double foodPurchaseTotalPrice;
    private static List foodArrayList = new ArrayList();
    private static List clothesArrayList = new ArrayList();
    private static double clothesPurchaseTotalPrice;
    private static List entertainmentArrayList = new ArrayList();
    private static double entertainmentPurchaseTotalPrice;
    private static List otherArrayList = new ArrayList();
    private static double otherPurchaseTotalPrice;

    public static void menu() throws IOException {

        boolean flag = true;

        System.out.println("Choose your action: \n" +
                "1) Add income \n" +
                "2) Add purchase \n" +
                "3) Show list of purchases \n" +
                "4) Balance \n" +
                "5) Save \n" +
                "6) Load \n" +
                "0) Exit \n");
        Scanner scanner = new Scanner(System.in);

        int action = scanner.nextInt();

        while (flag) {


            switch (action) {
                case 0:

                    System.out.println("Bye!");
                    System.exit(0);
                    break;


                case 1 :

                    System.out.println();
                    System.out.println("Enter income: ");
                    int amount = scanner.nextInt();
                    Income.addIncome(amount);
                    System.out.println("Income was added!");
                    System.out.println();
                    menu();
                        break;

                case 2:

                    System.out.println();
                    typeOfPurchase();


                case 3:

                    System.out.println();
                    if (arrayList.isEmpty()) {
                        System.out.println("Purchase list is empty!");
                        System.out.println();
                        menu();
                    } else {
                            System.out.println();
                            listOfPurchase();
                    }

                    System.out.println();


                    break;

                case 4:
                    System.out.println();
                    System.out.println("Balance : $" + String.format("%.2f", Income.getAmount()));
                    System.out.println();
                    menu();

                    break;

                case 5:
                    System.out.println();
                    SaveAndLoadPurchases.savePurchases();
                    menu();
                    break;

                case 6:
                    System.out.println();

                    SaveAndLoadPurchases.balanceBefore();
                    //balance = SaveAndLoadPurchases.balanceBefore();
//                    SaveAndLoadPurchases.loadPurchases();
                    arrayList = SaveAndLoadPurchases.loadPurchases();
                    purchaseTotalPrice = SaveAndLoadPurchases.test();
                    menu();
                    break;


                default:
                    System.out.println();
                    listOfPurchase();
                    System.out.println();
                   //System.exit(1);
            }
        }
    }

    public static void typeOfPurchase() throws IOException {

        boolean flag = true;

        System.out.println("Choose the type of purchase: \n" +
                "1) Food \n" +
                "2) Clothes \n" +
                "3) Entertainment \n" +
                "4) Other \n" +
                "5) Back \n");

        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();

        while (flag) {

            switch (action) {
                case 5:
                    System.out.println();
                    menu();
                    break;

                case 1:

                    System.out.println();
                    purchase = Purchases.readPurchase();

                    income = Purchases.readPrice();

                    balance = Income.subtractionIncome(income);

                    if (balance < 0) {
                        System.out.println("You don't have enough money");
                    } else {
                        System.out.println("Purchase was added!");
                        arrayList = Purchases.getArrayList(Purchases.processText(purchase, income));
                        purchaseTotalPrice = Purchases.totalPrice(income);
                        foodArrayList = Purchases.getFood(Purchases.processText(purchase, income));
                        foodPurchaseTotalPrice = Purchases.getFoodPrice(income);
                    }
                    System.out.println();
                    typeOfPurchase();

                    break;

                case 2:

                    System.out.println();
                    purchase = Purchases.readPurchase();

                    income = Purchases.readPrice();

                    balance = Income.subtractionIncome(income);
                    if (balance < 0) {
                        System.out.println("You don't have enough money");
                    } else {
                        System.out.println("Purchase was added!");
                        arrayList = Purchases.getArrayList(Purchases.processText(purchase, income));
                        purchaseTotalPrice = Purchases.totalPrice(income);
                        clothesArrayList = Purchases.getClothes(Purchases.processText(purchase, income));
                        clothesPurchaseTotalPrice = Purchases.getClothesPrice(income);
                    }
                    System.out.println();
                    typeOfPurchase();
                    break;

                case 3:
                    System.out.println();
                    purchase = Purchases.readPurchase();

                    income = Purchases.readPrice();

                    balance = Income.subtractionIncome(income);
                    if (balance <0 ) {
                        System.out.println("You don't have enough money");
                    } else {
                        System.out.println("Purchase was added!");
                        arrayList = Purchases.getArrayList(Purchases.processText(purchase, income));
                        purchaseTotalPrice = Purchases.totalPrice(income);
                        entertainmentArrayList = Purchases.getEntertainment(Purchases.processText(purchase, income));
                        entertainmentPurchaseTotalPrice = Purchases.getEntertainmentPrice(income);
                    }
                    System.out.println();
                    typeOfPurchase();
                    break;
                case 4:
                    System.out.println();
                    purchase = Purchases.readPurchase();

                    income = Purchases.readPrice();

                    balance = Income.subtractionIncome(income);
                    if (balance <0) {
                        System.out.println("You don't have enough money");
                    } else {
                        System.out.println("Purchase was added!");
                        arrayList = Purchases.getArrayList(Purchases.processText(purchase, income));
                        purchaseTotalPrice = Purchases.totalPrice(income);
                        otherArrayList = Purchases.getOther(Purchases.processText(purchase, income));
                        otherPurchaseTotalPrice = Purchases.getOtherPrice(income);
                    }
                    System.out.println();
                    typeOfPurchase();
                    break;
                default:

                    System.out.println();
                    System.out.println("Bye");
                    System.exit(0);

                break;
            }
        }
    }

    public static void listOfPurchase() throws IOException {
        boolean flag = true;

        System.out.println("Choose the type of purchase: \n" +
                "1) Food \n" +
                "2) Clothes \n" +
                "3) Entertainment \n" +
                "4) Other \n" +
                "5) All \n" +
                "6) Back \n");

        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();

        while (flag) {

            switch (action) {
                case 6:
                    System.out.println();
                    typeOfPurchase();
                    System.out.println();
                    break;

                case 1:
                    System.out.println();
                    Optional<List> check = Optional.ofNullable(foodArrayList);
                    System.out.println("Food: ");
                    if (check.isEmpty() || foodArrayList.isEmpty()) {
                        System.out.println("Purchase list is empty!");
                        System.out.println();
                        listOfPurchase();
                    } else {
                        for (int i = 0; i < foodArrayList.size(); i++) {
                            System.out.println(foodArrayList.get(i));
                        }
                        System.out.println("Total sum: $" + String.format("%.2f", foodPurchaseTotalPrice));
                    }
                    System.out.println();
                    listOfPurchase();
                    break;

                case 2:
                    System.out.println();
                    Optional<List> check2 = Optional.ofNullable(clothesArrayList);
                    System.out.println("Clothes: ");
                    if (check2.isEmpty() || clothesArrayList.isEmpty()) {
                        System.out.println("Purchase list is empty!");
                        System.out.println();
                        listOfPurchase();
                    } else {
                        for (int i = 0; i < clothesArrayList.size(); i++) {
                            System.out.println(clothesArrayList.get(i));
                        }
                        System.out.println("Total sum: $" + String.format("%.2f", clothesPurchaseTotalPrice));
                    }
                    System.out.println();
                    listOfPurchase();
                    break;

                case 3:
                    System.out.println();
                    Optional<List> check1 = Optional.ofNullable(entertainmentArrayList);
                    System.out.println("Entertainment: ");
                    if (check1.isEmpty() || entertainmentArrayList.isEmpty()) {
                        System.out.println("Purchase list is empty!");
                        System.out.println();
                        listOfPurchase();
                    } else {
                        for (int i = 0; i < entertainmentArrayList.size(); i++) {
                            System.out.println(entertainmentArrayList.get(i));
                        }
                        System.out.println("Total sum: $" + String.format("%.2f", entertainmentPurchaseTotalPrice));
                    }
                    System.out.println();
                    listOfPurchase();
                    break;
                case 4:
                    System.out.println();
                    Optional<List> check3 = Optional.ofNullable(otherArrayList);
                    System.out.println("Other: ");
                    if (check3.isEmpty() || otherArrayList.isEmpty()) {
                        System.out.println("Purchase list is empty!");
                        System.out.println();
                        listOfPurchase();
                    } else {
                        for (int i = 0; i < otherArrayList.size(); i++) {
                            System.out.println(otherArrayList.get(i));
                        }
                        System.out.println("Total sum: $" + String.format("%.2f", otherPurchaseTotalPrice));
                    }
                    System.out.println();
                    listOfPurchase();
                    break;

                case 5:
                    System.out.println();
                    Optional<List> check4 = Optional.ofNullable(arrayList);
                    System.out.println("All: ");
                    if (check4.isEmpty()) {
                        System.out.println("Purchase list is empty!");
                        System.out.println();
                        listOfPurchase();
                    } else {
                        for (int i = 0; i < arrayList.size(); i++) {
                            System.out.println(arrayList.get(i));
                        }
                        System.out.println("Total sum: $" + String.format("%.2f", purchaseTotalPrice));
                    }
                    System.out.println();
                    listOfPurchase();
                    break;

                default:
                    System.out.println();
                    menu();
            }
        }
    }

    public static List returnTotalListOfPurchases() {

        return arrayList;
    }
    public static double returnTotalAmountSpent() {

        return purchaseTotalPrice;
    }


}
