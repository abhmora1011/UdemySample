package Strings;

public class StringsHandling {

    public static void main(String[] args) {

        String str = "Pays $100 dollar";

        System.out.println(str.substring(1));
        System.out.println(str.contains("$"));
        System.out.println(str.charAt(str.length() - 11));
        System.out.println(str.indexOf("$"));

    }

}
