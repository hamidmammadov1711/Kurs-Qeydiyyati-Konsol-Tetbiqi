
import java.util.Random;

public class Secretary {
    
    Random random = new Random();
    
    private String ad;
    private int ucret = 200;
    private int faktura_no = random.nextInt(40);    

    public Secretary(String ad) {
        this.ad = ad;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getFaktura_no() {
        return faktura_no;
    }

    public void setFaktura_no(int faktura_no) {
        this.faktura_no = faktura_no;
    }
    
    public void proses_neticesi() {
        String s = "Kurs Qeydiyyatınız "+ad+" Tərəfindən Qeydə Alındı\n"
                + "Faktura Nömrənizi Mühasib Bölməsinə Göndərməyiniz Xahiş Olunur\n"
                + "Sizin Faktura Nömrəniz: "+faktura_no;
        
        System.out.println(s);
    }

}
