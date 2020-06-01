
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class B_1_Kat extends javax.swing.JFrame {
    OgrenciIslemleri islemler = new OgrenciIslemleri();
    DefaultTableModel model;
    /**
     * Creates new form B_1_Kat
     */
    public B_1_Kat(java.awt.Frame parent, boolean modal) {
        initComponents();
        model = (DefaultTableModel)b_1_tablo.getModel();
        OgrenciGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        oda_alani = new javax.swing.JTextField();
        yatak_alani = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        b_1_tablo = new javax.swing.JTable();
        ekle = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();
        b_1_kat_arkaplan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("B Blok 1. Kat İşlemleri");
        setLocation(new java.awt.Point(550, 250));

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ad :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 30, 70, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Soyad :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 70, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Oda :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 110, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Yatak :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 150, 60, 30);
        jPanel1.add(ad_alani);
        ad_alani.setBounds(140, 30, 160, 30);
        jPanel1.add(soyad_alani);
        soyad_alani.setBounds(140, 70, 160, 30);
        jPanel1.add(oda_alani);
        oda_alani.setBounds(140, 110, 160, 30);
        jPanel1.add(yatak_alani);
        yatak_alani.setBounds(140, 150, 160, 30);

        b_1_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Ad", "Soyad", "Oda", "Yatak"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        b_1_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_1_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(b_1_tablo);
        if (b_1_tablo.getColumnModel().getColumnCount() > 0) {
            b_1_tablo.getColumnModel().getColumn(0).setResizable(false);
            b_1_tablo.getColumnModel().getColumn(1).setResizable(false);
            b_1_tablo.getColumnModel().getColumn(2).setResizable(false);
            b_1_tablo.getColumnModel().getColumn(3).setResizable(false);
            b_1_tablo.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 210, 570, 200);

        ekle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ekle.setText("Yeni Öğrenci Ekle");
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });
        jPanel1.add(ekle);
        ekle.setBounds(500, 40, 180, 30);

        sil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sil.setText("Öğrenci Kaydı Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });
        jPanel1.add(sil);
        sil.setBounds(500, 90, 180, 30);

        guncelle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        guncelle.setText("Öğrenci Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });
        jPanel1.add(guncelle);
        guncelle.setBounds(500, 140, 180, 30);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 255));
        jButton4.setText("GERİ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(310, 430, 200, 30);

        jButton5.setBackground(new java.awt.Color(255, 0, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ÇIKIŞ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(310, 480, 200, 30);

        mesaj_yazisi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(mesaj_yazisi);
        mesaj_yazisi.setBounds(140, 184, 540, 20);

        b_1_kat_arkaplan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yurt_arkaplan.jpg"))); // NOI18N
        jPanel1.add(b_1_kat_arkaplan);
        b_1_kat_arkaplan.setBounds(0, 0, 800, 533);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        B_Blok bblok = new B_Blok();
        setVisible(false);
        bblok.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void b_1_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_1_tabloMouseClicked
        int selectedrow = b_1_tablo.getSelectedRow();
        ad_alani.setText(model.getValueAt(selectedrow, 1).toString());
        soyad_alani.setText(model.getValueAt(selectedrow, 2).toString());
        oda_alani.setText(model.getValueAt(selectedrow, 3).toString());
        yatak_alani.setText(model.getValueAt(selectedrow, 4).toString());
    }//GEN-LAST:event_b_1_tabloMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String oda = oda_alani.getText();
        String yatak = yatak_alani.getText();
        
        int selectedrow = b_1_tablo.getSelectedRow();
        
        if(selectedrow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Öğrenci Tablosu Şuan Boş");
            }
            else{
                mesaj_yazisi.setText("Lütfen Güncellenecek Bir Öğrenci Seçin");
            }
        }
        int sira = (int) model.getValueAt(selectedrow, 0);
        islemler.ogrenciGuncelle3(ad,soyad,oda,yatak,sira);
        OgrenciGoruntule();
        mesaj_yazisi.setText("Öğrenci Başarıyla Güncellendi...");
    }//GEN-LAST:event_guncelleActionPerformed

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
        mesaj_yazisi.setText("");
        
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String oda = oda_alani.getText();
        String yatak = yatak_alani.getText();
        
        islemler.ogrenci4Ekle(ad, soyad, oda, yatak);
        OgrenciGoruntule();
        mesaj_yazisi.setText("Öğrenci Başarıyla Kayıt Edildi...");
    }//GEN-LAST:event_ekleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        mesaj_yazisi.setText("");
        
        int selectedrow = b_1_tablo.getSelectedRow();
        if(selectedrow == -1){
            if(model.getRowCount() == 0){
                mesaj_yazisi.setText("Öğrenci Tablosu Şuan Boş...");      
            }
            else{
                mesaj_yazisi.setText("Lütfen Silinecek Öğrenciyi Seçiniz!");           
            }           
    }                                   
        else{
            int sira = (int) model.getValueAt(selectedrow , 0);
            islemler.ogrenci4Sil(sira);
            OgrenciGoruntule();
            mesaj_yazisi.setText("Öğrenci Başarıyla Silindi...");
        }
    }//GEN-LAST:event_silActionPerformed

    /**
     * @param args the command line arguments
     */
    public void OgrenciGoruntule(){
        model.setRowCount(0);
        ArrayList<OgrenciA1> proje = new ArrayList<OgrenciA1>();
        
        proje = islemler.B1araOgrencileriGetir();
        if(proje !=null){
            for(OgrenciA1 ogrenci : proje){
                Object[] eklenecek = {ogrenci.getSira(),ogrenci.getAd(),ogrenci.getSoyad(),ogrenci.getOda(),ogrenci.getYatak()};
                model.addRow(eklenecek);
            }
        }     
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(B_1_Kat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B_1_Kat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B_1_Kat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B_1_Kat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                B_1_Kat dialog = new B_1_Kat(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e){
                    System.exit(0);
                }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField ad_alani;
    javax.swing.JLabel b_1_kat_arkaplan;
    javax.swing.JTable b_1_tablo;
    javax.swing.JButton ekle;
    javax.swing.JButton guncelle;
    javax.swing.JButton jButton4;
    javax.swing.JButton jButton5;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JLabel mesaj_yazisi;
    javax.swing.JTextField oda_alani;
    javax.swing.JButton sil;
    javax.swing.JTextField soyad_alani;
    javax.swing.JTextField yatak_alani;
    // End of variables declaration//GEN-END:variables
}