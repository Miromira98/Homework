import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pojalusta, vvedite chislo:");
        int number333 = scanner.nextInt();


        //perevesti chislo 333 iz shestnadzatirichnoy v desyatichnuyu.
          toTen(number333, 16);

        //Razlojit chislo 200345 na razryadi v desyatichnoy systeme.
        // 2*10^5 + 0*10^3 3*10^2 + 4*10^1 + 5*10^0

        //Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10).
        System.out.println("pojalusta, vvedite chislo");
        int number637 = scanner.nextInt();
        tenTo(number637, 16);
        toTen(number637, 16);

        // Перевести 637 из десятичной в двоичную.
        tenTo(number637,2);

        //Перевести 637 из десятичной в троичную.
        tenTo(number637, 3);

        //11100111 перевести в десятичную.
        toTen(11100111, 2 );
    }
    public static void toTen (int num, int digit){
        System.out.println("Chislo " + num + " Is " + digit + " v 10:");
        int result = 0;
        int value = 0;
        int counter = Integer.toString(num).length();

        for(int i= 0; i<counter; i++) {
            value = num % 10;
            result += value *Math.pow(digit,i);
            num /= 10;
        }

        System.out.println(result);
    }

    public static void tenTo(int num, int digit){
        System.out.println("Chislo " + num + " Is 10 v " + digit + ":");
        String result = "";
        int value = 0;
        while (num!= 0) {
            value = num % digit;
            result = value + result;
            num /= digit;
        }

        System.out.println(result);
    }

}