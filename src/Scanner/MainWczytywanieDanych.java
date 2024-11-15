package Scanner;

import java.util.Scanner;

public class MainWczytywanieDanych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linia;

     //   ---------------WHILE------------------------------
//        while (true) {
//            String linia = scanner.nextLine();
//            System.out.println("Wprowadziłem: " + linia);
//
//            if(linia.equals("KONIEC")) {
//                System.out.println("No to kończę działanie");
//                break;
//            }
//        }

      //--------------DO WHILE-------------------------------
//        do {
//            linia = scanner.nextLine();
//            System.out.println("Wprowadzilem w do while " + linia);
//        } while(!linia.equals("KONIEC"));

        //------------WHILE INNY SPOSÓB---------------------------
        while(!(linia = scanner.nextLine()).equals("KONIEC")) {
            System.out.println("Wprowadzilem w while innym " + linia);
        }

        System.out.println("Zakonczylem dzialanie");
    }
}