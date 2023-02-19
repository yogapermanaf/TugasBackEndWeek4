package arraylist;

import java.util.ArrayList;

public class D_BahasaProgram {
    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<String>();

        // Menambahkan nama-nama bahasa pemrograman ke dalam ArrayList
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Swift");
        programmingLanguages.add("Go");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Perl");
        programmingLanguages.add("R");
        programmingLanguages.add("Scala");

        // Menghapus 5 data yang berbeda dari ArrayList
        programmingLanguages.remove("Python");
        programmingLanguages.remove("JavaScript");
        programmingLanguages.remove("Ruby");
        programmingLanguages.remove("Kotlin");
        programmingLanguages.remove("R");

        // Menampilkan nama-nama bahasa pemrograman yang tersisa di ArrayList
        System.out.println("Nama-nama bahasa pemrograman yang tersisa di ArrayList:");
        for (String programming : programmingLanguages) {
            System.out.println(programming);
        }
    }
}
