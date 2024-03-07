
package com.mycompany.telephone;
import java.util.Scanner;

public class Prodavec {
    public static void modify(phone telephone) {// МЕТОД КЛАССА Prodavec
        String x = "";
        for (char c : telephone.getProizvoditel().toCharArray()) { // хранение одного символа и сохранение в общий массив данных
            if (c=='o') {
                x=x+'a';
            } else {
                x=x+Character.toLowerCase(c);
            }
        }
        if (x.charAt(0) == 'n') {
            x = x.substring(0, 1).toUpperCase() + x.substring(1);
        }
        telephone.setProizvoditel(x);
    }
    public static phone inputTelephone() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Назовите производителя телефонного аппарата: ");
        String proizTelelphone = scanner.nextLine();
        return new phone(proizTelelphone);
    }
}
