public class Main {
    public static void main(String[] args) {
        System.out.println("Užduotis 1");
        sum(5,60);
        System.out.println("Užduotis 2");
        System.out.println("----------------");
        System.out.println(Pisq());
        System.out.println("Užduotis 3");
        System.out.println("----------------");
        System.out.println(multiplication(4,17));
        System.out.println("Užduotis 4");
        System.out.println("----------------");

    }
//    užduotis 1
    public static  void sum(int a, int b){
        System.out.println(a + b);
        }
//   Užduotis 2
    public static double Pisq(){
        return 9.8596;
    }
//  Užduotis 3
    public static int multiplication(int a, int b){
        return a * b;
    }
//  Užduotis 4
}