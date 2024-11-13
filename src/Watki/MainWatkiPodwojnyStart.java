package Watki;

public class MainWatkiPodwojnyStart {
    public static void main(String[] args) {
Thread thread = new Thread(new MojeRunnable());
thread.start();

// chcę znowu uruchomić ten wątek,
// ale nie mogę po prostu znowu wypisać "thread.start()"
// muszę utworzyć nowy Obiekt na Wątku:
        Thread thread1 = new Thread(new MojeRunnable());
        thread1.start();
    }
}