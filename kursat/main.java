package Hipotenus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan üçgenin kenar uzunluklaırnı al
        int a,b,c,cevre;
        double u,alan,sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("1. kenar uzunluğu = ");
        a = inp.nextInt();
        System.out.print("2. kenar uzunluğu = ");
        b = inp.nextInt();
        System.out.print("3. kenar uzunluğu = ");
        c = inp.nextInt();
        cevre = a+b+c;
        System.out.println("Üçgenin cevresi : " + cevre);

        u = cevre / 2;
        alan = u*(u-a)*(u-b)*(u-c);
        sonuc= Math.sqrt(alan);
        System.out.println("Üçgenin alanı : " + sonuc);
        System.out.println("İns:Kursattrgt")
    }
}