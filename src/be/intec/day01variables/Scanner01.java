package be.intec.day01variables;

import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kurmamizi saglar
    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" etmek gerekir.
    //Scanner Class'i Java nin util kutuphanesindedir.

    public static void main(String[] args) {

        //Kullanicidan data almak icin yapilmasi gerekenler

        //1.Adim: Scanner Class'indan object olusturun
        Scanner input = new Scanner(System.in);

        //2.Adim:Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir...");

        //3.Adim: Kullanicidan aldiginiz data'yi bir variable'in icine koyun
        byte age = input.nextByte();
        System.out.println("Hey kullanici senin yasin " + age);


        /*
            next() ile nextLine() in farki nedir?
            next() methodu kulanicidan gelen String'in sadece ilk kelimeisni alir.
            nextLine() methodu kulanicidan gelen String'in tamamini alir.
        */


    /*
        Not: char variable'lari matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
             Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 yazdirir
        Note: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi ii)Birlestirme Islemi(Concatenation)
              Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.
     */

        //Example 1: Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz
        //           Ali Can ==> AC

        Scanner input1 = new Scanner(System.in);


        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input1.nextLine();// Ali Can

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);





    }

}
