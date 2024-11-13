package Watki.Zadania;

public class MainWatkiZadania {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
//        Przećwicz tworzenie wątku poprzez klasę anonimową:
//        - niech metoda “run” wypisze na ekran “Ta informacja została wypisana z klasy anonimowej i z mojego wątku”
//        - wystartuj wątek pamiętając o odpowiednich czynnościach
//                - dopisz, aby informacja została wyświetlona z 3 sekundowym opóźnieniem

        // tworzenie klasy anonimowej z wątkiem:
        Runnable runnableAnonimowe = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {

                }
                System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku");
            }
        };
//        WatekZadanie1 watekZadanie1 = new WatekZadanie1();
        Thread thread1 = new Thread(runnableAnonimowe);
        thread1.start();

        System.out.println("Zadanie 2");
//        Stwórz nową klasę o nazwie “Czasoodmierzacz” implementująca
//        interfejs Runnable. Stwórz tzw. “timer”, który będzie co 1 sekundę
//        wypisywał na ekran informację o tym jak długo (ile sekund)
//        działa program od momentu jego uruchomienia. Przetestuj wątek w main.
        Thread thread2 = new Thread(new Czasoodmierzacz());
        thread2.start();

        System.out.println("Zadanie 3");
//        Stwórz dwa wątki, które będą się ścigać. Każdy z wątków niech wypisze na ekran 1000 razy:
//“Będę pierwszy - to ja <tutaj_nazwa_wątku>”.
//        Po wykonaniu tej czynności ma zawiadomić o skończonej pracy wypisując:
//“ZAKOŃCZYŁEM! Melduje się <tutaj_nazwa_wątku>".
//        Uruchom kilka razy program i zobacz czy wynik za każdym razem jest taki sam.

        Scigacz scigaczPierwszyRunnable = new Scigacz("Ścigacz nr 1");
        Scigacz scigaczDrugiRunnable = new Scigacz("Ścigacz nr 2");
        Thread threadScigacz1 = new Thread(scigaczPierwszyRunnable);
        Thread threadScigacz2 = new Thread(scigaczDrugiRunnable);
        threadScigacz1.start();
        threadScigacz2.start();
    }
}
