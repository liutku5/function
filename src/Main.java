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
        array(array);
        System.out.println("Užduotis 5");
        System.out.println("----------------");
        System.out.println(ranInt(5, 20));
        System.out.println("Užduotis 6");
        System.out.println("----------------");
        int[] arrRes = ranArr(1, 24, 5);
        System.out.println("Užduotis 7");
        System.out.println("----------------");
        System.out.println("suma: " + ranArrSum(arrRes));
        System.out.println("Užduotis 8");
        System.out.println("----------------");
        System.out.println("vidurkis: " + ranArrAverage(arrRes));
        System.out.println("Užduotis 9");
        System.out.println("----------------");
        rectangle(4, 9);
        System.out.println("Užduotis 10");
        System.out.println("----------------");
        simbolCounter("Šiandien labai graži diena");
        System.out.println("Užduotis 11");
        System.out.println("----------------");
        String text = reverseSentence("Naglis");
        System.out.println(text);
        System.out.println("Sunki užduotis 1");
        System.out.println("----------------");
        System.out.println(text("Labas"));
        System.out.println("Sunki užduotis 2");
        System.out.println("----------------");
        String rndStr = generateRndStr(10);
        System.out.println(rndStr);
        ranSimbols(rndStr);
        System.out.println("Sunki užduotis 3");
        System.out.println("----------------");
        System.out.println(intDivisible(6));
        System.out.println("Sunki užduotis 4");
        System.out.println("----------------");
//    Išrūšiuokite masyvą pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.
        int[] rndArr = ranArr(33, 77, 5);
        for (int i = 0; i < rndArr.length; i++) {

//            rndArr[i]
            // eik googlint
//            bubble sort java
        }
        System.out.println("Sunki užduotis 5");
        System.out.println("----------------");
        int arr1 = 5;
        int primeCount = 0;
        for (int i = 0; i < arr1; i++) {
            int number1 = ranInt(333, 777);
            int numbers1 = intDivisible(number1);
            System.out.println(number1 + " " + numbers1);
            if (numbers1 == 0) {
                primeCount++;
            }
        }
        System.out.println("Prime number count: " + primeCount);
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

    public static void array(int[] number) {
        String result = "";
        for (int i = 0; i < number.length; i++) {
            result += number[i] + ",";
        }
        System.out.println(result.substring(0, result.length() - 1) + ";");
    }
    //  Užduotis 5

    public static int ranInt(int min, int max) {
        int res = (int) Math.round(Math.random() * (max - min) + min);
        return res;
    }

    //  Užduotis 6
    public static int[] ranArr(int min, int max, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int res = (int) Math.round(Math.random() * (max - min) + min);
            result[i] = res;
        }
        return result;
    }

    //  Užduotis 7

    public static int ranArrSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    //  Užduotis 8
    public static double ranArrAverage(int[] numbers) {
        double sum = 0;
        double variable = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            variable++;
        }
        return sum / variable;
    }

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

    public static String reverseSentence(String words) {
        StringBuilder reverseSentence = new StringBuilder(words).reverse();
        return reverseSentence.toString();
    }

    //    Sunki užduotis 1
    public static String text(String words) {
        return "---" + words + "---";
    }

    //    Sunki užduotis 2

    //    Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].
    public static void ranSimbols(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                System.out.println(text.charAt(i));
            } else if (Character.isDigit(text.charAt(i))) {
                System.out.println("[" + text.charAt(i) + "]");
            } if

        }
    }

    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }

    //    Sunki užduotis 3
    public static int intDivisible(int number) {
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
            if (number == i) {
                count--;
            }
        }
        return count;
    }


}