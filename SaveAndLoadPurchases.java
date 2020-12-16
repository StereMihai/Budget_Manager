package budget;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveAndLoadPurchases {

    public static void balanceBefore () throws IOException {
        String path1 = "D:\\balance.txt";
        double balance = Double.parseDouble(readFileAsString(path1));
       Income.addIncome(balance);
        //return balance;

    }

    public static List loadClothes() throws FileNotFoundException{
        List <String> list = new ArrayList<>();
        String path = "D:\\clothes.txt";
        FileInputStream fis=new FileInputStream(path);
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        return list;
    }
    public static List loadEntertainment() throws FileNotFoundException{
        List <String> list = new ArrayList<>();
        String path = "D:\\entertainment.txt";
        FileInputStream fis=new FileInputStream(path);
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        return list;
    }
    public static List loadOther() throws FileNotFoundException{
        List <String> list = new ArrayList<>();
        String path = "D:\\other.txt";
        FileInputStream fis=new FileInputStream(path);
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        return list;
    }


    public static List loadFood() throws FileNotFoundException {
        List <String> list = new ArrayList<>();

        String path = "D:\\food.txt";
        FileInputStream fis=new FileInputStream(path);
        Scanner scanner = new Scanner(fis);
        File file = new File(path);
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        return list;

    }
    public static List loadPurchases() throws IOException {

        List <String> list = new ArrayList<>();

        String path = "D:\\purchases.txt";
//        String path1 = "D:\\balance.txt";
        FileInputStream fis=new FileInputStream(path);
        Scanner scanner = new Scanner(fis);
        File file = new File(path);
//        File file1 = new File(path1);
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        if (file.exists()) {
            System.out.println("Purchases were loaded!");
            System.out.println();

        }

        return list;

    }
    public static double otherPrice() throws IOException{
        String path = "D:\\other.txt";

        String word = readFileAsString(path);

        String[] words = word.split("\\s+");

        double sum = 0;

        for (int i=0; i<words.length; i++) {

            if (words[i].charAt(0) == '$'){
                words[i] = words[i].substring(1);
                sum += Double.parseDouble(words[i]);

            }
        }

        return sum;
    }
    public static double entertainmentPrice() throws IOException{
        String path = "D:\\entertainment.txt";

        String word = readFileAsString(path);

        String[] words = word.split("\\s+");

        double sum = 0;

        for (int i=0; i<words.length; i++) {

            if (words[i].charAt(0) == '$'){
                words[i] = words[i].substring(1);
                sum += Double.parseDouble(words[i]);

            }
        }

        return sum;
    }
    public static double clothesPrice() throws IOException{
        String path = "D:\\clothes.txt";

        String word = readFileAsString(path);

        String[] words = word.split("\\s+");

        double sum = 0;

        for (int i=0; i<words.length; i++) {

            if (words[i].charAt(0) == '$'){
                words[i] = words[i].substring(1);
                sum += Double.parseDouble(words[i]);

            }
        }

        return sum;
    }
    public static double foodPrice() throws IOException {
        String path = "D:\\food.txt";

        String word = readFileAsString(path);

        String[] words = word.split("\\s+");

        double sum = 0;

        for (int i=0; i<words.length; i++) {

            if (words[i].charAt(0) == '$'){
                words[i] = words[i].substring(1);
                sum += Double.parseDouble(words[i]);

            }
        }

        return sum;
    }
    public static double test() throws IOException {


        String path = "D:\\purchases.txt";

        String word = readFileAsString(path);

        String[] words = word.split("\\s+");

        double sum = 0;

        for (int i=0; i<words.length; i++) {

            if (words[i].charAt(0) == '$'){
                words[i] = words[i].substring(1);
                sum += Double.parseDouble(words[i]);
            }
        }
        //System.out.println(sum);
       // Income.addIncome(sum);
        return sum-10;
    }
    public static void saveOthers() {
        List<String> list4 = Menu.returnTotalOther();
        String path4 = "D:\\other.txt";
        try {
            File file = new File(path4);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                FileWriter fw = new FileWriter(path4);
                for (String item : list4) {
                    fw.write(item + "\n");
                }
                fw.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveEntertainment() {
        List<String> list4 = Menu.returnTotalEntertainment();
        String path4 = "D:\\entertainment.txt";
        try {
            File file = new File(path4);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                FileWriter fw = new FileWriter(path4);
                for (String item : list4) {
                    fw.write(item + "\n");
                }
                fw.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveClothes() {
        List<String> list3 = Menu.returnTotalClothes();
        String path3 = "D:\\clothes.txt";
        try {
            File file = new File(path3);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                FileWriter fw = new FileWriter(path3);
                for (String item : list3) {
                    fw.write(item + "\n");
                }
                fw.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveFood() {
        List<String> list3 = Menu.returnTotalFood();
        String path2 = "D:\\food.txt";
        try {
            File file = new File(path2);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                FileWriter fw = new FileWriter(path2);
                for (String item : list3) {
                    fw.write(item + "\n");
                }
                fw.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void savePurchases(){

        List <String> list = Menu.returnTotalListOfPurchases();

        String path = "D:\\purchases.txt";
        String path1 = "D:\\balance.txt";

        try{
            File file = new File(path);
            boolean createNewFile= file.createNewFile();
            if (createNewFile) {
                FileWriter fw = new FileWriter(path);
                for(String item : list) {
                    fw.write(item + "\n");
                }
//                double amount = Income.getAmount();
//                fw.write("&" + String.format("%.2f", amount));
                fw.close();
                System.out.println("Purchases were saved!");
            } else {
                System.out.println("The file already exists");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            File file = new File(path1);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                FileWriter fw = new FileWriter(path1);
                double amount = Income.getAmount();
                fw.write(String.format("%.2f", amount));
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
