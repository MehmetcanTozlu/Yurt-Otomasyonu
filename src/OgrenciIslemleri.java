import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class OgrenciIslemleri {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
  
    public void ogrenciEkle(String ad, String soyad, String oda, String yatak){
        String sorgu = "Insert Into a1kat (ad,soyad,oda,yatak) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, oda);
            preparedStatement.setString(4, yatak);
            preparedStatement.executeUpdate();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public void ogrenci2Ekle(String ad, String soyad, String oda, String yatak){
        String sorgu = "Insert Into a2kat (ad,soyad,oda,yatak) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, oda);
            preparedStatement.setString(4, yatak);
            preparedStatement.executeUpdate();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public void ogrenci3Ekle(String ad, String soyad, String oda, String yatak){
        String sorgu = "Insert Into a3kat (ad,soyad,oda,yatak) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, oda);
            preparedStatement.setString(4, yatak);
            preparedStatement.executeUpdate();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public void ogrenci4Ekle(String ad, String soyad, String oda, String yatak){
        String sorgu = "Insert Into b1kat (ad,soyad,oda,yatak) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, oda);
            preparedStatement.setString(4, yatak);
            preparedStatement.executeUpdate();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public void ogrenci5Ekle(String ad, String soyad, String oda, String yatak){
        String sorgu = "Insert Into b2kat (ad,soyad,oda,yatak) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, oda);
            preparedStatement.setString(4, yatak);
            preparedStatement.executeUpdate();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public void ogrenci6Ekle(String ad, String soyad, String oda, String yatak){
        String sorgu = "Insert Into b3kat (ad,soyad,oda,yatak) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, oda);
            preparedStatement.setString(4, yatak);
            preparedStatement.executeUpdate();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public void ogrenciGuncelle(String yeniad, String yenisoyad, String yenioda, String yeniyatak, int sira){
        String sorgu = "Update a1kat set ad = ? , soyad = ? , oda = ? , yatak = ? where sıra = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeniad);
            preparedStatement.setString(2, yenisoyad);
            preparedStatement.setString(3, yenioda);
            preparedStatement.setString(4, yeniyatak);
            
            preparedStatement.setInt(5, sira);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenciGuncelle1(String yeniad, String yenisoyad, String yenioda, String yeniyatak, int sira){
        String sorgu = "Update a2kat set ad = ? , soyad = ? , oda = ? , yatak = ? where sıra = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeniad);
            preparedStatement.setString(2, yenisoyad);
            preparedStatement.setString(3, yenioda);
            preparedStatement.setString(4, yeniyatak);
            
            preparedStatement.setInt(5, sira);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenciGuncelle2(String yeniad, String yenisoyad, String yenioda, String yeniyatak, int sira){
        String sorgu = "Update a3kat set ad = ? , soyad = ? , oda = ? , yatak = ? where sıra = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeniad);
            preparedStatement.setString(2, yenisoyad);
            preparedStatement.setString(3, yenioda);
            preparedStatement.setString(4, yeniyatak);
            
            preparedStatement.setInt(5, sira);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenciGuncelle3(String yeniad, String yenisoyad, String yenioda, String yeniyatak, int sira){
        String sorgu = "Update b1kat set ad = ? , soyad = ? , oda = ? , yatak = ? where sıra = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeniad);
            preparedStatement.setString(2, yenisoyad);
            preparedStatement.setString(3, yenioda);
            preparedStatement.setString(4, yeniyatak);
            
            preparedStatement.setInt(5, sira);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenciGuncelle4(String yeniad, String yenisoyad, String yenioda, String yeniyatak, int sira){
        String sorgu = "Update b2kat set ad = ? , soyad = ? , oda = ? , yatak = ? where sıra = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeniad);
            preparedStatement.setString(2, yenisoyad);
            preparedStatement.setString(3, yenioda);
            preparedStatement.setString(4, yeniyatak);
            
            preparedStatement.setInt(5, sira);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenciGuncelle5(String yeniad, String yenisoyad, String yenioda, String yeniyatak, int sira){
        String sorgu = "Update b3kat set ad = ? , soyad = ? , oda = ? , yatak = ? where sıra = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeniad);
            preparedStatement.setString(2, yenisoyad);
            preparedStatement.setString(3, yenioda);
            preparedStatement.setString(4, yeniyatak);
            
            preparedStatement.setInt(5, sira);
            
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenciSil(int sira){
        String sorgu = "Delete from a1kat where sıra = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, sira);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenci2Sil(int sira){
        String sorgu = "Delete from a2kat where sıra = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, sira);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenci3Sil(int sira){
        String sorgu = "Delete from a3kat where sıra = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, sira);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenci4Sil(int sira){
        String sorgu = "Delete from b1kat where sıra = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, sira);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenci5Sil(int sira){
        String sorgu = "Delete from b2kat where sıra = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, sira);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenci6Sil(int sira){
        String sorgu = "Delete from b3kat where sıra = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, sira);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ogrenciİzin(String ad, String soyad, String telefon, String izin_tarihi, String izin_suresi){
        String sorgu = "Insert Into izinal (ad,soyad,telefon,tarih,süre) VALUES(?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, telefon);
            preparedStatement.setString(4, izin_tarihi);
            preparedStatement.setString(5, izin_suresi);
            preparedStatement.executeUpdate();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public ArrayList<Ogrenciİzin> İzinOgrenciGetir(){
        
        ArrayList<Ogrenciİzin> cikti = new ArrayList<Ogrenciİzin>();
        
        try {
            statement = con.createStatement();
            String getir = "SELECT * FROM izinal";
            ResultSet rs = statement.executeQuery(getir);
            while(rs.next()){
                int sira = rs.getInt("sıra");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String telefon = rs.getString("telefon");
                String izin_tarihi = rs.getString("tarih");
                String izin_suresi = rs.getString("süre");
                
                cikti.add(new Ogrenciİzin(sira,ad,soyad,izin_tarihi,izin_suresi,telefon));
            }
            return cikti;
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ArrayList<Ogrenci> araOgrencileriGetir(){
        
        ArrayList<Ogrenci> cikti = new ArrayList<Ogrenci>();
        
        try {
            statement = con.createStatement();
            String getir = "SELECT * FROM `tumogrenciler`";
            ResultSet rs = statement.executeQuery(getir);
            while(rs.next()){
                int sira = rs.getInt("sıra");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String blok = rs.getString("blok");
                String kat = rs.getString("kat");
                
                cikti.add(new Ogrenci(sira,ad,soyad,blok,kat));
            }
            return cikti;
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<OgrenciA1> A1araOgrencileriGetir(){
        
        ArrayList<OgrenciA1> cikti = new ArrayList<OgrenciA1>();
        
        try {
            statement = con.createStatement();
            String getir = "Select * From a1kat";
            ResultSet rs = statement.executeQuery(getir);
            while(rs.next()){
                int sira = rs.getInt("sıra");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String oda = rs.getString("oda");
                String yatak = rs.getString("yatak");

                cikti.add(new OgrenciA1(sira,ad,soyad,oda,yatak));
            }
            return cikti;
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<OgrenciA1> A2araOgrencileriGetir(){
        
        ArrayList<OgrenciA1> cikti = new ArrayList<OgrenciA1>();
        
        try {
            statement = con.createStatement();
            String getir = "Select * From a2kat";
            ResultSet rs = statement.executeQuery(getir);
            while(rs.next()){
                int sira = rs.getInt("sıra");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String oda = rs.getString("oda");
                String yatak = rs.getString("yatak");
                
                cikti.add(new OgrenciA1(sira,ad,soyad,oda,yatak));
            }
            return cikti;
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<OgrenciA1> A3araOgrencileriGetir(){
        
        ArrayList<OgrenciA1> cikti = new ArrayList<OgrenciA1>();
        
        try {
            statement = con.createStatement();
            String getir = "Select * From a3kat";
            ResultSet rs = statement.executeQuery(getir);
            while(rs.next()){
                int sira = rs.getInt("sıra");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String oda = rs.getString("oda");
                String yatak = rs.getString("yatak");
             
                cikti.add(new OgrenciA1(sira,ad,soyad,oda,yatak));
            }
            return cikti;
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<OgrenciA1> B1araOgrencileriGetir(){
        
        ArrayList<OgrenciA1> cikti = new ArrayList<OgrenciA1>();
        
        try {
            statement = con.createStatement();
            String getir = "Select * From b1kat";
            ResultSet rs = statement.executeQuery(getir);
            while(rs.next()){
                int sira = rs.getInt("sıra");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String oda = rs.getString("oda");
                String yatak = rs.getString("yatak");
                
                cikti.add(new OgrenciA1(sira,ad,soyad,oda,yatak));
            }
            return cikti;
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<OgrenciA1> B2araOgrencileriGetir(){
        
        ArrayList<OgrenciA1> cikti = new ArrayList<OgrenciA1>();
        
        try {
            statement = con.createStatement();
            String getir = "Select * From b2kat";
            ResultSet rs = statement.executeQuery(getir);
            while(rs.next()){
                int sira = rs.getInt("sıra");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String oda = rs.getString("oda");
                String yatak = rs.getString("yatak");
                
                cikti.add(new OgrenciA1(sira,ad,soyad,oda,yatak));
            }
            return cikti;
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<OgrenciA1> B3araOgrencileriGetir(){
        
        ArrayList<OgrenciA1> cikti = new ArrayList<OgrenciA1>();
        
        try {
            statement = con.createStatement();
            String getir = "Select * From b3kat";
            ResultSet rs = statement.executeQuery(getir);
            while(rs.next()){
                int sira = rs.getInt("sıra");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String oda = rs.getString("oda");
                String yatak = rs.getString("yatak");
                
                cikti.add(new OgrenciA1(sira,ad,soyad,oda,yatak));
            }
            return cikti;
        } 
        catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean girisYap(String kullanici_adi, String parola){
        
        String sorgu = "Select * from admin where username = ? and password = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
                   
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
    
    public OgrenciIslemleri(){
        
        String url = "jdbc:mysql://" + DataBase.host + ":" + DataBase.port + "/" + DataBase.db_ismi + "?useUnicode = true & characterEncoding = utf8";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı...");
        }
        try {
            con = DriverManager.getConnection(url, DataBase.kullanici_adi, DataBase.parola);
            System.out.println("Bağlantı Başarılı...");
        } 
        catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
    }
}