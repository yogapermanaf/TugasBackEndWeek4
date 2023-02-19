package arraylist;
import java.util.ArrayList;

public class B_TahunPildun {
    public static void main(String[] args) {
        ArrayList<Integer> worldCupYears = new ArrayList<Integer>();

        // Menambahkan tahun-tahun Piala Dunia ke dalam ArrayList
        worldCupYears.add(1930);
        worldCupYears.add(1950);
        worldCupYears.add(1970);
        worldCupYears.add(1990);
        worldCupYears.add(2010);

        // Menampilkan tahun-tahun Piala Dunia dari ArrayList
        System.out.println("Tahun-tahun Piala Dunia:");
        for (int year : worldCupYears) {
            System.out.println(year);
        }
    }
}

