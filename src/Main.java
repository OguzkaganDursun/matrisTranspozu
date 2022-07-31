import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matris = {
                {1,2,3,},
                {4,5,6},
                {7,8,9},
        };

        int[][] matrisTranspozu = new int[matris[0].length][matris.length];

        System.out.println("Matris : ");
        System.out.println();

        for (int i = 0; i < matris.length; i++)
        {
            for (int j = 0; j < matris[i].length; j++)
            {
                matrisTranspozu[j][i] = matris[i][j];
                System.out.print(matris[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matris Transpozu : ");
        System.out.println();

        for (int i = 0; i < matris.length; i++)
        {
            for (int j = 0; j < matrisTranspozu[i].length; j++)
            {
                System.out.print(matrisTranspozu[i][j] + " ");
            }
            System.out.println();
        }
    }
}
