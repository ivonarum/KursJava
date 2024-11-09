package Petle;

public class petleZadaniaChoinki {
    public static void main(String[] args) {

         //7. Napisz program, w którym po podaniu liczby n narysujesz
        // za pomocą * (gwiazdki) trójkąt prostokątny o przyprostokątnych
        // składających się z n-razy * (gwiazdki) ;)
        //np. podając n = 5 powinniśmy otrzymać taki trójkąt:
//        *
//        **
//        ***
//        ****
//        *****
//        int nn = 5;
//        for(int i = 1; i <= nn; i++) {
//            for(int j = 1; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

        //zadanie8, przy n = 5:
//            *
//           **
//          ***
//         ****
//        *****
        System.out.println("Zadanie 8 - choinka lustrzana");
        int n = 7;
//        int liczbaGwiazdLustrz = 1;
//        int liczbaSpacjiLustrz = n - 1;
        for (int i = 1; i <= n; i++)
        {
            // Rysowanie spacji
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Rysowanie gwiazdek
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //zadanie9

//        int poziomy = 5;
//        for (int i = 1; i <= poziomy; i++) {
//            // Rysowanie spacji
//            for (int j = 0; j < poziomy - i; j++) {
//                System.out.print(" ");
//            }
//            // Rysowanie gwiazdek
//            for (int k = 0; k < (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        }
    }


