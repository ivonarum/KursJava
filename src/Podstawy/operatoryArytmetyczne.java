package Podstawy;

public class operatoryArytmetyczne {
    public static void main(String[] args) {
        // ang. arithmetic operators

        System.out.println(3 + 5);
        System.out.println(5 - 3);
        System.out.println(2 * 4);
        System.out.println(4 / 2);
        System.out.println(10 % 3); //10-9

        double a = 9;
        double b = 2;

        a += b; // inaczej: a = a + b;
        System.out.println("a = a + b: " + a);
        a -= b; // czyli a = a - b;
        System.out.println("a: " + a);
        a *= b; // czyli a = a * b;
        System.out.println("a: " + a);

        //zwiekszanie wartosci o 1
        a += 1; // czyli: a = a + 1;
        System.out.println(a);
        a++; // INKREMENTACJA - zwiększ o 1
        System.out.println(a);
        a--; // deKREMENTACJA
        System.out.println(a);

        ++a; //najpierw jest zwiekszenie wartosci a o 1
        // a dopiero pozniej pobieramy wartosc a
        System.out.println(a);
        --a;
        System.out.println(a);
    }
}
