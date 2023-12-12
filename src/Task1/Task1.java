package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a < b){
            printNumbersAsc(a, b);
        }else{
            printNumbersDesc(a, b);
        }
    }

    private static void printNumbersAsc(int a, int b){
        System.out.print(a + " ");
        if (a == b) return;
        printNumbersAsc(a + 1, b);
    }

    private static void printNumbersDesc(int a, int b){
        System.out.print (a + " ");
        if(a == b) return;
        printNumbersDesc(a - 1, b);
    }
}