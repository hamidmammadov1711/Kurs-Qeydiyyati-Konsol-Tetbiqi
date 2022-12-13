
import java.util.Scanner;

public class Muhasib {
    private String ad;

    public Muhasib(String ad) {
        this.ad = ad;
    }
    
    public void deyerlendirme(Secretary s) throws InterruptedException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int faktura_nomresi;
            String message = "Salam Mən bu Kursun Mühasibliyindən Məsul Olan Şəxsəm\n"
                                     + "Kurs Qeydiyyatınızı Tamamlamaq Üçün Faktura Nömrənizi Daxil Edin: ";
            System.out.println(message);
            faktura_nomresi = scanner.nextInt();
            
            if (faktura_nomresi == s.getFaktura_no()) {
                System.out.println("");
                System.out.println("Faktura Nömrəniz Yoxlanılır...");
                Thread.sleep(4000);
                String message2 = "Kursumuzun Mühasibi "+ad +" Tərəfindən Sizin Faktura Nömrəniz Analiz Edildi\n"
                        + "Doğruluğu Təsdiqləndi\n"
                        + "Kursumuza Xoş Gəldiniz...";
                System.out.println(message2);
                return;
            }
            else {
                System.out.println("");
                System.out.println("Faktura Nömrəniz Yoxlanılır...");
                Thread.sleep(4000);
                String message3 = "Kursumuzun Muhasibi "+ ad + " Tərəfindən Sizin Faktura Nömrəniz Analiz Edildi\n"
                        + " Faktura Nömrənizin Yanlış Olduğu Qeydə Alındı\n"
                        + " Faktura Nömrənizi Yenidən girməyiniz Xahiş Olunur";
                System.out.println(message3);
            }
            
  
        }
    }
    
}
