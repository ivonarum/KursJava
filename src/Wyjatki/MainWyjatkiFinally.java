package Wyjatki;

public class MainWyjatkiFinally {
    static String str = "str";
    public static void main(String[] args) {


        try {
            System.out.println("WSZYSTKO WIELKĄ LITERĄ: " + str.toUpperCase());
            System.out.println("Znak na miejscu 99: " + str.charAt(99));
        }
//        catch(NullPointerException e) {
//            System.out.println("Poszedł null");
//        } catch(StringIndexOutOfBoundsException e) {
//            System.out.println("Wyszedl poza zakres");
//        }
        finally {
            System.out.println("Ja i tak zawsze sie wykonam");
        }
    }
    }
