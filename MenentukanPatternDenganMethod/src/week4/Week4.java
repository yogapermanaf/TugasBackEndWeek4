package week4;
import java.util.regex.*;
import java.util.Scanner;
public class Week4 {
    public static boolean isEmail(String str) {
        // Pola regex untuk email
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static boolean isDate(String str) {
        // Pola regex untuk tanggal dd-MM-yyyy atau dddd, MMMM yy
        String datePattern = "^\\d{1,2}-\\d{1,2}-\\d{4}|^\\w+,\\s\\w+\\s\\d{2}";

        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static boolean isIPAddress(String str) {
        // Pola regex untuk alamat IP
        String ipAddressPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        Pattern pattern = Pattern.compile(ipAddressPattern);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static void main(String[] args) {
              
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah string: ");
        String inputString = scanner.nextLine();

        System.out.println("Is " + inputString + " a valid email? " + isEmail(inputString));
        System.out.println("Is " + inputString + " a valid date? " + isDate(inputString));
        System.out.println("Is " + inputString + " a valid IP address? " + isIPAddress(inputString));
    }
}