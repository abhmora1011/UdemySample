package Array;

public class Interview {

    public static void main(String[] args) {



        int b[][] = {{1, 112, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}};

        //
        int min = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                //System.out.print(b[i][j]);
                if (b[i][j] > min ){
                    //min = b[i][j];

                    // Added for column validation
                    if (j == 1){
                        min = b[i][j];
                    }
                    // End of added

                }

            }

            //System.out.println();
        }


        System.out.println(min);

    }

}
