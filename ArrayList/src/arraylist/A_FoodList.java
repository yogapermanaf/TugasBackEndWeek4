package arraylist;
import java.util.ArrayList;

public class A_FoodList {
    public static void main(String[] args) {
        ArrayList<String> foodList = new ArrayList<String>();

        // Menambahkan nama makanan ke dalam ArrayList
        foodList.add("Nasi Goreng");
        foodList.add("Sate Ayam");
        foodList.add("Gado-gado");
        foodList.add("Bakso");
        foodList.add("Soto Ayam");
        foodList.add("Mie Goreng");
        foodList.add("Ayam Goreng");
        foodList.add("Rendang");
        foodList.add("Nasi Padang");
        foodList.add("Nasi Uduk");

        // Menampilkan nama makanan dari ArrayList
        for (String food : foodList) {
            System.out.println(food);
        }
    }
}

