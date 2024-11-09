package Petle;

public class petleBreakContinue {
    public static void main(String[] args) {
        int zmienna;
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if(zmienna < 18) {
                continue; //kontynuuje pętlę od nowa,nie przechodzi do wykonania kodu
            }
            System.out.println("zmienna: " + zmienna);
        }

        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 18) {
                break;
            }
            System.out.println("zmienna drugiej pętli: " + zmienna);
        }
    }

    }
