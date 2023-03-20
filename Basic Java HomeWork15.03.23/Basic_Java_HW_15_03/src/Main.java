import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       String stringVar = "I study Basic Java!";


       char resultOfString = stringVar.charAt(18);
        System.out.println(resultOfString);

        boolean boolVar = stringVar.contains("Java");
        System.out.println(boolVar);

        String stringResult = stringVar.replace("a", "o");
        System.out.println(stringResult);

        String stringResult1 = stringVar.toUpperCase();
        System.out.println(stringResult1);

        String stringResult2 = stringVar.toLowerCase();
        System.out.println(stringResult2);

        String stringResult3 = stringVar.substring(14, 18);
        System.out.println(stringResult3);



    }
}