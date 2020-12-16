package budget;

import java.util.*;

public class Purchases {

    private static List arrayList = new ArrayList();
    private static List food = new ArrayList();
    private static List clothes = new ArrayList();
    private static List entertainment = new ArrayList();
    private static List other = new ArrayList();
    private static double totalPrice = 0;
    private static double foodPrice = 0;
    private static double clothesPrice = 0;
    private static double entertainmentPrice = 0;
    private static double otherPrice = 0;



    public static List getFood(String word) {

        food.add(word);
        return food;
    }

    public static List getClothes(String word) {

        clothes.add(word);
        return clothes;
    }

    public static List getEntertainment(String word) {

        entertainment.add(word);
        return entertainment;
    }

    public static List getOther(String word) {

        other.add(word);
        return other;
    }

    public static List getArrayList(String word) {

        arrayList.add(word);
        return arrayList;
    }

    public static double getFoodPrice(double amount) {
        foodPrice += amount;
        return foodPrice;
    }

    public static double getClothesPrice(double amount) {
        clothesPrice += amount;
        return clothesPrice;
    }
    public static double getEntertainmentPrice(double amount) {
        entertainmentPrice+=amount;
        return entertainmentPrice;
    }
    public static double getOtherPrice(double amount) {
        otherPrice+=amount;
        return otherPrice;

    }
    public static double totalPrice(double amount){
        totalPrice += amount;
        return totalPrice;
    }
    public static String processText(String purchaseName, double amount) {

        String words = purchaseName + " $" + String.format("%.2f", amount);
        return words;

    }
    public static String readPurchase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter purchase name: ");
        String purchaseName = scanner.nextLine();
        return purchaseName;
    }
    public static double readPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter its price:");
        double price = scanner.nextDouble();
        return price;
    }


}
