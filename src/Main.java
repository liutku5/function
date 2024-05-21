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
        System.out.println(randomcycle(2, 34, 5));
        System.out.println("Užduotis 7");
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
    public static int[] randomcycle(int min, int max, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int res = (int) Math.round(Math.random() * (max - min) + min);
            result[i] = res;
        }
        return result;
    }
//  Užduotis 7

}