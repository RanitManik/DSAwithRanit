package L11_Functions_Methods;

import static L11_Functions_Methods.string_return.greet;

public class Passing_Exmaple {
    public static void main(String[] args) {
        String my_name = "Ranit Manik";
        greet(my_name);

    }

    static void greet(String naam) {
        System.out.println(naam);
    }
}