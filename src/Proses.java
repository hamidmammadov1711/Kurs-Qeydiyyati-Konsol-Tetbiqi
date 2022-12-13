
import java.util.Scanner;


public class Proses {
    public static void main(String[] args) throws InterruptedException {
        Secretary s = new Secretary("Nərgiz");
        
        Scanner scanner = new Scanner(System.in);
        
        String giris = "Kursumuzun Qeydiyyat Bölməsinə Xoş Gəldiniz\n"
                        + "Kursun Katib İşlərindən Məsul " + s.getAd() + "\n"
                        + "Kurs Haqqında Məlumat Üçün Bildiririk ki,\n"
                        + "Java, Kotlin, Python, Html-Css və Javascript Olmaqla 5 Kursdan İbarətdir\n"
                        + "Kurs Ödənişləri Sabit Olmaqla 200 AZN-dir\n"
                        + "Kurslarımızda İştirak Etməyiniz Üçün Ödəniş Etməyiniz Xahiş Olunur";
        System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
        System.out.println(giris);
        System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
        System.out.println(" ");
        System.out.print("Xahiş Edirik Öyrənmək İstədiyiniz Kurs Adını Daxil Edin: ");
        
        
        String kurs_adi = scanner.nextLine();
        System.out.print("Kursa Qeydiyyat Üçün Yatıracağınız Miqdarı Daxil Edin: ");
        int yatirim_miqdari = scanner.nextInt();
        
        if (yatirim_miqdari == s.getUcret()) {
            System.out.println("");
            s.proses_neticesi();
            
            Muhasib m = new Muhasib("Orxan");
            m.deyerlendirme(s);  
        }
        else {
            System.out.println("Ödənişiniz Tam Olmadığı Üçün Qeydiyyatınız Baş Tutmadı");
            return;
        }
        
                  
                  
                  
        
    }
}
