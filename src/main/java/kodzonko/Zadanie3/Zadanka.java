package kodzonko.Zadanie3;

import java.util.Scanner;

public class Zadanka {
    public static void main(String[] args) {
        count();
    }
    public static void count() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String cc = scan.nextLine();

        int counter = 0;
        int count = 0;
        for (int i = 0; i < cc.length(); i++ ) {
            char c = cc.charAt(i);
            if (c ==','){
                counter++;
            }else if (c == '.'){
                count++;
            }
        }
        System.out.println("," + counter);
        System.out.println("." + count);

    }
}
