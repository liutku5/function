import javax.print.attribute.standard.PresentationDirection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Užduotis 1");
        sum(5, 60);
        System.out.println("Užduotis 2");
        System.out.println("----------------");
        System.out.println(Pisq());
        System.out.println("Užduotis 3");
        System.out.println("----------------");
        System.out.println(multiplication(4, 17));
        System.out.println("Užduotis 4");
        System.out.println("----------------");
        int[] array = {4, 5, 10, 75};
        cycle(array);
        System.out.println("Užduotis 5");
        System.out.println("----------------");
        System.out.println(random(5, 20));
        System.out.println("Užduotis 6");
        System.out.println("----------------");
        int[] at = randomCycle(2, 34, 5);
        System.out.println("Užduotis 7");
        System.out.println("----------------");
        int[] res = randomCycle(2, 14, 3);
        System.out.println("Užduotis 8");
        System.out.println("----------------");
        System.out.println("Užduotis 9");
        System.out.println("----------------");
        rectangle(4, 9);
        System.out.println("Užduotis 10");
        System.out.println("----------------");
        simbolCounter("Šiandien labai graži diena");
        System.out.println("Užduotis 11");
        System.out.println("----------------");
    }

    //    užduotis 1
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    //   Užduotis 2
    public static double Pisq() {
        return 9.8596;
    }

    //  Užduotis 3
    public static int multiplication(int a, int b) {
        return a * b;
    }

    //  Užduotis 4

    public static void cycle(int[] number) {
        String result = "";
        for (int i = 0; i < number.length; i++) {
            result += number[i] + ",";
        }
        System.out.println(result.substring(0, result.length() - 1) + ";");
    }
    //  Užduotis 5

    public static int random(int min, int max) {
        int res = (int) Math.round(Math.random() * (max - min) + min);
        return res;
    }

    //  Užduotis 6
    public static int[] randomCycle(int min, int max, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int res = (int) Math.round(Math.random() * (max - min) + min);
            result[i] = res;
        }
        return result;
    }

    //  Užduotis 7
//  Sukurkite Funkciją kuri panaudotų 6toje užduotyje sugeneruotą masyvą (priimtų kaip kintamąjį),
//  susumuotų ir gražintų reikšmę
//    public static int ranCycleSum(numbers){
//            int sum =0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        return sum;
//        }
//  Užduotis 8
//  Užduotis 9
    public static void rectangle(int length, int width) {
        for (int i = 0; i < length; i++) {
            for (int z = 0; z < width; z++) {
                if (i >= z || i <= z) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    //  Užduotis 10
    public static void simbolCounter(String words) {
        int letters = 0;
        int spaces = 0;

        for (int i = 0; i < words.length(); i++) {
            if (Character.isLetter(words.charAt(i))) {
                letters++;
            } else if (Character.isWhitespace(words.charAt(i))) {
                spaces++;
            } else {
                letters++;
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
    }
//    Užduotis 11
//  Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės.
//  Pvz “Naglis” turi gautis “silgaN”.
//    public static String reverseSentence(String words){
//
//    }

}