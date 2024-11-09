package InstrukcjeWrunkowe;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        // ang. conditional statements

        int wiek = 15;
        boolean przyszedlTata = false;
        boolean przyszedlzMama = true;

        if(wiek >= 18) {
            System.out.println("Pozwol na zakup...");
        } else if(przyszedlTata) {
            System.out.println("Odrazu podaj");
        } else if(wiek < 18 && przyszedlzMama) {
            System.out.println("Pozwól im na zakup");
        } else {
            System.out.println("Zakup niedozwolony");
        }



    }
    }
