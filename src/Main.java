

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InterFacefunction as = (x, y) -> {
            if (x.length()== y.length()){
                System.out.println("True");
            } else {
                throw new RuntimeException("False");
            }

//            else if (x.length() == y.length()) {
//                System.out.println("True");
            };
//

        String x = in.nextLine();
        String y = in.nextLine();
        as.calculater(x, y);


    }
}