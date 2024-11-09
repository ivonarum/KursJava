package com.nazwa.app;

public class MainPolaStaticFinal {
    public static void main(String[] args) {
        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 11;

        KlasaStaticFinal.poleStatic = 56;

        System.out.println(KlasaStaticFinal.poleStatic);
    }

}
