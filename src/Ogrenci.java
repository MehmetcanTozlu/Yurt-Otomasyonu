public class Ogrenci {
    
    private int sira;
    private String ad;
    private String soyad;
    private String kat;
    private String oda;
    private String yatak;
  
    Ogrenci(int sira, String ad, String soyad, String kat, String oda){
        this.sira = sira;
        this.ad = ad;
        this.soyad = soyad;
        this.kat = kat;
        this.oda = oda;
    }

    Ogrenci(int sira, String ad, String soyad, String kat, String oda, String yatak, String izin_suresi, String izin_tarihi) {
        this.sira = sira;
        this.ad = ad;
        this.soyad = soyad;
        this.kat = kat;
        this.oda = oda;
        this.yatak = yatak;
    }

    public int getSira() {
        return sira;
    }

    public void setSira(int sira) {
        this.sira = sira;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKat() {
        return kat;
    }

    public void setKat(String kat) {
        this.kat = kat;
    }

    public String getOda() {
        return oda;
    }

    public void setOda(String oda) {
        this.oda = oda;
    }

    public String getYatak() {
        return yatak;
    }

    public void setYatak(String yatak) {
        this.yatak = yatak;
    }

}