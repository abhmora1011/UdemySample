package Array;

public class ArrayBasics {

    public static void main(String[] args) {

        int a[] = new int[5];
        String b[] = new String[4];

        a[3] = 4;

        // System.out.println(a[4]);
        // System.out.println(b[1]);

        int c[] = {1,2,3,4,5};

        for (int temp: c) {
            System.out.println(temp);
        }
    }

}
