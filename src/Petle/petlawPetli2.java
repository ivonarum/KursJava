package Petle;

public class petlawPetli2
{
    public static void main(String[] args)
    {
        // tabliczka mnożenia
        // 1 2 3 4 5 6 7 8 9 10
        //2*   2 4 6 8 10 12 14 16 18 20
        //3*   3 6 ...

        for(int j = 1; j <= 10; j++)
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }

}
