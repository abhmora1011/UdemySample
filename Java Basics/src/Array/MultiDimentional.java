package Array;

public class MultiDimentional {

    public static void main(String[] args) {

        int b[][] = {{1, 2, 3, 4}, {3, 2, 3, 5}, {4, 5, 6, 7}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

    }
}
