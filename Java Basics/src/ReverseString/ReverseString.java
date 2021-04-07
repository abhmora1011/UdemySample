package ReverseString;

public class ReverseString {


    public static void main(String[] args) {

        String s = "madam";
        String t = "";

        for (int i = s.length()-1; i>=0; i--){
            t = t + s.charAt(i);
        }

        t = String.valueOf(t);

        System.out.println(t);

        if (s.equals(t)){

            System.out.println("Matched!");
        }



    }

}
