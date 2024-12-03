package TypWyliczeniowyEnum;

public class MainEnum {
    public static void main(String[] args) {
Pizza pizza = Pizza.XXL;
        System.out.println("Zamowileś pizzę: " + pizza + " " + pizza.getRozmiar() + " cena: " + pizza.getCena());

        Pizza pizzaDruga = Pizza.DUZA;
        System.out.println("Zamowileś pizzę: " + pizzaDruga + " " + pizzaDruga.getRozmiar() + " cena: " + pizzaDruga.getCena());

        float kosztRazem = pizza.getCena() + pizzaDruga.getCena();
        System.out.println("Koszt razem: " + kosztRazem);
    }
}