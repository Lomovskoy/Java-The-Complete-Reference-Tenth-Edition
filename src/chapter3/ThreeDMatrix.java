package chapter3;

/**
 * Демонстрация создания трёхмерного массива.
 *
 * @author Ломовской К.Ю.
 * @since 06.04.2019
 */
public class ThreeDMatrix {

    public static void main(String[] args) {
        int threeD[][][] = new int [3][4][5];
        int i, j, k;

        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    threeD[i][j][k] = i * j * k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k] + "\t");
                System.out.println();
            }
            System.out.println();
        }
    }
}
