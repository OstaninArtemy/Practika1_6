
package com.mycompany.telephone;
public class Telephone {

    public static void main(String[] args) {
        Prodavec Prodavec = new Prodavec();
        phone phone = Prodavec.inputTelephone();
        System.out.println("Исходные значения полей: " + phone.getProizvoditel());
        Prodavec.modify(phone);
        System.out.println("Измененные значения полей: " + phone.getProizvoditel());
    }
}
