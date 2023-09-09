import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Scanner scanner = new Scanner(System.in);
        Integer I1 = scanner.nextInt();
        Integer s1 = 0;
        for (int i = 0; i <= I1; i++) {
            s1 = s1+i;
        }
        Integer s2 = 1;
        for (int i = 1; i <= I1; i++) {
            s2 = s2*i;
        }
        System.out.println(s1.toString()+' '+ s2.toString());
        //Задача 2
        Integer I3 = 0;
        for (int i = 0; i <= 1000; i++) {
            I3 = i;
            System.out.print(I3.toString()+' ');
        }
        System.out.println();
        //Задача 3
        System.out.println("Введите действие(+ - * /)");
        String St1 = scanner.next();
        System.out.println("Введите два числа");
        Integer I4 = scanner.nextInt();
        Integer I5 = scanner.nextInt();
        Integer Z =0;
        if (St1.equals("+")){
            Z = I4+I5;
            System.out.println(Z);
        }
        if (St1.equals("-")){
            Z=I4-I5;
            System.out.println(Z);
        }
        if (St1.equals("*")){
            Z = I4*I5;
            System.out.println(Z);
        }
        if (St1.equals("/")) {
            Z = I4 / I5;
            System.out.println(Z);
        }
    }
}