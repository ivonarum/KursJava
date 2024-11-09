package KlasyAbstrakcyjneInterfejsyIInne;

public class KlasaZewnetrzna {
    int poleZewnetrzne;

    int metodaZewnetrzna() {
       // Można utworzyc Obiekt klasy wewn w klasie zewnetrznej,
        // ale nie mozna  wywołac jej pól i metod
        Wewnetrzna obiektWewnetrzna = new Wewnetrzna();
        obiektWewnetrzna.metodaWewnetrzna();
        obiektWewnetrzna.poleWewnetrzne = 202;
        return -1;
    }
    class Wewnetrzna {
        //pola i metody z klasy ZEWNETRZNEJ mozna
        // tu wywołac w klasie wewn., ale nie odwrotnie.
        // Można jednak utworzyc Obiekt klasy wewn w klasie zewnetrznej

        int poleWewnetrzne;

        int metodaWewnetrzna() {
            metodaZewnetrzna();
            poleZewnetrzne = 101;
            return -2;
        }
    }
}
