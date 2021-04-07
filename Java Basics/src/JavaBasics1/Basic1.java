package JavaBasics1;

public class Basic1{
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int a = 1, b = 2, sum;

        sum = a + b;

        System.out.println("sum is " + sum);

        HeaderValidation header1 =  new HeaderValidation();
        HeaderValidation header2 =  new HeaderValidation();

        header1.validateHeader("Abe");
        header1.validateHeader("Gale");
    }
}
