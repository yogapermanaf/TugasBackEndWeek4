package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class C_ProvinsiDesc {
    public static void main(String[] args) {
        ArrayList<String> provinceList = new ArrayList<String>();

        // Menambahkan nama-nama provinsi ke dalam ArrayList
        provinceList.add("Aceh");
        provinceList.add("Bali");
        provinceList.add("Jawa Barat");
        provinceList.add("Sulawesi Utara");
        provinceList.add("Sumatera Utara");
        provinceList.add("Papua");
        provinceList.add("Kalimantan Timur");
        provinceList.add("Jambi");
        provinceList.add("Nusa Tenggara Barat");
        provinceList.add("Maluku");

        // Mengurutkan nama-nama provinsi secara descending
        Collections.sort(provinceList, Collections.reverseOrder());

        // Menampilkan nama-nama provinsi yang sudah diurutkan
        System.out.println("Nama-nama provinsi yang sudah diurutkan secara descending:");
        for (String province : provinceList) {
            System.out.println(province);
        }
    }
}
