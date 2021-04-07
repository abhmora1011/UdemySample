package JavaBasics1;

public class HeaderValidation {

    public void validateHeader(String header){
        String name = header;

        if(name == "Abe"){
            System.out.print("Matched \n");
        }
        else {
            System.out.println("Invalid header name \n");
        }

    }


}
