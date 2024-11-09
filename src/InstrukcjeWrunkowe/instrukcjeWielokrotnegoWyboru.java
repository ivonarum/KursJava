package InstrukcjeWrunkowe;

public class instrukcjeWielokrotnegoWyboru {
    public static void main(String[] args) {
        // switch

        int zmienna = 5;
        switch (zmienna) {
            case 1:
                System.out.println("jeden");
                break; // bez break uruchamiają sie wszystkie casy
            case 2:
                System.out.println("dwa");
                break;
            case 9:
                System.out.println("dziewięć");
                break;
            default:
                System.out.println("nie spełniono żadnego warunku");
                break;
        }

        System.out.println("Kalendarz:");
        int miesiac = 2;

        switch (miesiac) {
            case 1:
                System.out.println("styczen");
            case 2:
                System.out.println("luty");
            case 3:
                System.out.println("marzec");
            case 4:
                System.out.println("kwiecien");
            case 5:
                System.out.println("maj");
            case 6:
                System.out.println("czerwiec");
                break;
            default:
                System.out.println("podaj liczbe od 1 do 12");
        }
    }

    }
