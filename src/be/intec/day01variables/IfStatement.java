package be.intec.day01variables;


public class IfStatement {

    public static void main(String[] args) {

        // && ile & arasindaki fark
        //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
        // Ancak & tum satırı kontrol eder ondan sonra durur.
        //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir


        //Kullanici negatif sayi girse bile pozitif yapma **mutlak deger  the absolute value
        int n = -2430;
        n = Math.abs(n);
        System.out.println(n);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz

        int d = 0;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);


         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        int year = 2001;
        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");
        System.out.println(leap);

    }
}