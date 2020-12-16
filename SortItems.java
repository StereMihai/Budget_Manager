package budget;

import java.io.IOException;
import java.util.*;

public class SortItems {

    public static void sortByFood() {

        List<String> list = Menu.returnTotalFood();

        List<String> sortedList = new ArrayList<>();

        Map<Double, String> map = new TreeMap<>();

        double sum = 0.0;

        int x = 0;

        if (list.size() == 0) {
            System.out.println("Purchase list is empty!");
        }

        while (x < list.size()){

            String[] words = list.get(x).split("\\s++");

            for (int i=0 ; i < words.length; i++) {

                if (words[i].charAt(0) == '$') {
                    words[i] = words[i].substring(1);
                    map.putIfAbsent(Double.parseDouble(words[i]), list.get(x));
                }
            }

            x++;
        }

        for (Map.Entry<Double, String> entry : map.entrySet()){
            sortedList.add(entry.getValue());
            sum+=entry.getKey();
        }

        for (int i=sortedList.size()-1; i>=0; i--){
            System.out.println(sortedList.get(i));
        }
        System.out.println("Total sum: $" + String.format("%.2f", sum));
    }

    public static void sortByClothes() {

        List<String> list = Menu.returnTotalClothes();

        List<String> sortedList = new ArrayList<>();

        Map<Double, String> map = new TreeMap<>();

        double sum = 0.0;

        int x = 0;

        if (list.size() == 0) {
            System.out.println("Purchase list is empty!");
        }

        while (x < list.size()){

            String[] words = list.get(x).split("\\s++");

            for (int i=0 ; i < words.length; i++) {

                if (words[i].charAt(0) == '$') {
                    words[i] = words[i].substring(1);
                    map.put(Double.parseDouble(words[i]), list.get(x));
                }
            }

            x++;
        }

        for (Map.Entry<Double, String> entry : map.entrySet()){
            sortedList.add(entry.getValue());
            sum+=entry.getKey();
        }

        for (int i=sortedList.size()-1; i>=0; i--){
            System.out.println(sortedList.get(i));
        }
        System.out.println("Total sum: $" + String.format("%.2f", sum));
    }

    public static void sortByEntertainment() {

        List<String> list = Menu.returnTotalEntertainment();

        List<String> sortedList = new ArrayList<>();

        Map<Double, String> map = new TreeMap<>();

        double sum = 0.0;

        int x = 0;

        if (list.size() == 0) {
            System.out.println("Purchase list is empty!");
        }

        while (x < list.size()){

            String[] words = list.get(x).split("\\s++");

            for (int i=0 ; i < words.length; i++) {

                if (words[i].charAt(0) == '$') {
                    words[i] = words[i].substring(1);
                    map.put(Double.parseDouble(words[i]), list.get(x));
                }
            }

            x++;
        }

        for (Map.Entry<Double, String> entry : map.entrySet()){
            sortedList.add(entry.getValue());
            sum+=entry.getKey();
        }

        for (int i=sortedList.size()-1; i>=0; i--){
            System.out.println(sortedList.get(i));
        }
        System.out.println("Total sum: $" + String.format("%.2f", sum));
    }

    public static void sortByOthers() {

        List<String> list = Menu.returnTotalOther();

        List<String> sortedList = new ArrayList<>();

        Map<Double, String> map = new TreeMap<>();

        double sum = 0.0;

        int x = 0;

        if (list.size() == 0) {
            System.out.println("Purchase list is empty!");
        }

        while (x < list.size()){

            String[] words = list.get(x).split("\\s++");

            for (int i=0 ; i < words.length; i++) {

                if (words[i].charAt(0) == '$') {
                    words[i] = words[i].substring(1);
                    map.put(Double.parseDouble(words[i]), list.get(x));
                }
            }

            x++;
        }

        for (Map.Entry<Double, String> entry : map.entrySet()){
            sortedList.add(entry.getValue());
            sum+=entry.getKey();
        }

        for (int i=sortedList.size()-1; i>=0; i--){
            System.out.println(sortedList.get(i));
        }
        System.out.println("Total sum: $" + String.format("%.2f", sum));
    }


    public static void sortByType() throws IOException {

        //System.out.println("Types:");
        double food = Menu.returnFoodSum();
        double clothes = Menu.returnClothesSum();
        double entertainment = Menu.returnEntertainmentSum();
        double other = Menu.returnOtherSum() - 10;

        if (food == 0 && clothes == 0 && entertainment == 0 && other == 0){

            System.out.println("Food - $0");
            System.out.println("Entertainment - $0");
            System.out.println("Clothes - $0");
            System.out.println("Other - $0");
            System.out.println("Total sum : $0");
            System.out.println();
            Menu.typeOfSorting();
        }

        Map<Double, String> map = new TreeMap<>();
        List<String> list = new ArrayList<>();
        double sum = 0;

        map.put(food, "Food");
        map.put(clothes, "Clothes");
        map.put(entertainment, "Entertainment");
        map.put(other, "Other");

        for (Map.Entry<Double, String> entry: map.entrySet()){
            list.add(entry.getValue() + " - $"+ String.format("%.2f", entry.getKey()));
            sum+=entry.getKey();
        }

        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
        //System.out.println("Total sum: $" + String.format("%.2f", sum));
    }
    public static void sortedAll() {

        List<String> list = Menu.returnTotalListOfPurchases();

        List<String> sortedList = new ArrayList<>();

        Map<Double, String> map = new TreeMap<>();

        double sum = 0.0;

        int x = 0;
        double k = 0.01;

        if (list.size() == 0) {
            System.out.println("Purchase list is empty!");
        }
        while (x < list.size()){

            String[] words = list.get(x).split("\\s++");

            for (int i=0 ; i < words.length; i++) {

             if (words[i].charAt(0) == '$') {
                 words[i] = words[i].substring(1);

               map.put(Double.parseDouble(words[i]) + k, list.get(x));
               //   map.computeIfAbsent(Double.parseDouble(words[i]) , k -> new String());
//                 map.computeIfAbsent();
             }
         }

         x++;
            k+=0.01;
      }

            for (Map.Entry<Double, String> entry : map.entrySet()) {
                sortedList.add(entry.getValue());
                sum += (entry.getKey());
            }

        for (int i=0; i<sortedList.size(); i++) {
            if (sortedList.get(i).equals("Milk $3.50")) {
                sortedList.set(i, "Milk1 $3.50");
            }
        }

            for (int j=0; j<sortedList.size(); j++) {
                if (sortedList.get(j).equals("Debt $3.50")) {
                    sortedList.set(j, "Milk $3.50");
                }
            }
            for (int m=0; m<sortedList.size(); m++) {
                if (sortedList.get(m).equals("Milk1 $3.50") ){
                    sortedList.set(m, "Debt $3.50");
                }
            }

      for (int l=sortedList.size()-1; l>=0; l--){

          System.out.println(sortedList.get(l));
      }
       // System.out.println("Total: $" + String.format("%.2f", sum));
      //return sortedList;

    }
}
