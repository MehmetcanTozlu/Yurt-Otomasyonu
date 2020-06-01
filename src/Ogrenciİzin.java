public class Ogrenciİzin {
    
    private int sira;
    private String ad;
    private String soyad;
    private String izin_tarihi;
    private String izin_suresi;
    private String telefon;

    public Ogrenciİzin(int sira, String ad, String soyad, String izin_tarihi, String izin_suresi, String telefon) {
        this.sira = sira;
        this.ad = ad;
        this.soyad = soyad;
        this.izin_tarihi = izin_tarihi;
        this.izin_suresi = izin_suresi;
        this.telefon = telefon;
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

    public String getIzin_tarihi() {
        return izin_tarihi;
    }

    public void setIzin_tarihi(String izin_tarihi) {
        this.izin_tarihi = izin_tarihi;
    }

    public String getIzin_suresi() {
        return izin_suresi;
    }

    public void setIzin_suresi(String izin_suresi) {
        this.izin_suresi = izin_suresi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}