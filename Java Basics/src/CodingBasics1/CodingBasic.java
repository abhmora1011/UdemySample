package CodingBasics1;

public class CodingBasic {

    public static void main(String[] args) {

        int[] a = {2,5,8,7,4};

        int temp;

        for(int i = 0; i < a.length; i++){
          //temp = temp + a[i];

            System.out.println(a[i]);
            if (a[i] == 7){
                //System.out.println(i);
                break;
            }

        }

        //System.out.println(temp);


    }

}
