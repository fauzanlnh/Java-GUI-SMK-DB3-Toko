/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.FAbout;
import view.FTransaksiBMasuk;
import view.FormPelanggan;
import view.Login;
import view.FormBarang;
import Class.DatabaseConnection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import studikasusbarang.View.MenuUtama;

/**
 *
 * @author Fauzan13
 */
public class FHelp extends javax.swing.JFrame {

    /**
     * Creates new form FHelp
     */
    public FHelp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnFB = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnFP = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        TPemB = new javax.swing.JMenuItem();
        TPenB = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        LprnBarangKeluar = new javax.swing.JMenuItem();
        LprnBarangMasuk = new javax.swing.JMenuItem();
        LprnPersediaan = new javax.swing.JMenuItem();
        LprnDaraBarang = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEnabled(false);
        jTextArea1.setText("A.Barang Baru\n" +
            "	1.Masuk Ke Menu Master lalu ke form barang dan isi form\n" +
            "	2.Lalu Ke Transaksi Pembelian dan isi ");
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home.png"))); // NOI18N
        jMenu7.setText("Home");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Home");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuBar1.add(jMenu7);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Master.png"))); // NOI18N
        jMenu3.setText("Master");

        mnFB.setText("Form Barang");
        mnFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFBActionPerformed(evt);
            }
        });
        jMenu3.add(mnFB);
        jMenu3.add(jSeparator1);

        mnFP.setText("Form Pelanggan");
        mnFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnFPActionPerformed(evt);
            }
        });
        jMenu3.add(mnFP);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transaksi.png"))); // NOI18N
        jMenu4.setText("Transaksi");

        TPemB.setText("Pembelian Barang");
        TPemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPemBActionPerformed(evt);
            }
        });
        jMenu4.add(TPemB);

        TPenB.setText("Penjualan Barang");
        TPenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPenBActionPerformed(evt);
            }
        });
        jMenu4.add(TPenB);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laporan.png"))); // NOI18N
        jMenu5.setText("Laporan");

        LprnBarangKeluar.setText("Barang Keluar");
        LprnBarangKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LprnBarangKeluarActionPerformed(evt);
            }
        });
        jMenu5.add(LprnBarangKeluar);

        LprnBarangMasuk.setText("Barang Masuk");
        LprnBarangMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LprnBarangMasukActionPerformed(evt);
            }
        });
        jMenu5.add(LprnBarangMasuk);

        LprnPersediaan.setText("Persediaan Barang");
        LprnPersediaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LprnPersediaanActionPerformed(evt);
            }
        });
        jMenu5.add(LprnPersediaan);

        LprnDaraBarang.setText("Data Barang");
        LprnDaraBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LprnDaraBarangActionPerformed(evt);
            }
        });
        jMenu5.add(LprnDaraBarang);

        jMenuBar1.add(jMenu5);

        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hepl.png"))); // NOI18N
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem4);

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem1);

        jMenuBar1.add(Help);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Logout");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Logout.add(jMenuItem5);

        jMenuBar1.add(Logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MenuUtama m = new MenuUtama();
        m.show();
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void mnFBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFBActionPerformed
        FormBarang fb = new FormBarang();
        fb.show();
        dispose();
    }//GEN-LAST:event_mnFBActionPerformed

    private void mnFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnFPActionPerformed
        FormPelanggan fp = new FormPelanggan();
        fp.show();
        dispose();
    }//GEN-LAST:event_mnFPActionPerformed

    private void TPemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPemBActionPerformed
        FTransaksiBMasuk FTB = new FTransaksiBMasuk();
        FTB.show();
        dispose();
    }//GEN-LAST:event_TPemBActionPerformed

    private void TPenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPenBActionPerformed
        FTransaksiBKeluar FTB = new FTransaksiBKeluar();
        FTB.show();
        dispose();
    }//GEN-LAST:event_TPenBActionPerformed

    private void LprnBarangKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LprnBarangKeluarActionPerformed
        // TODO add your handling code here:
        String reportSource = null;
        String reportDest = null;

        try {

            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_tokok");
            reportSource = System.getProperty("user.dir") + "/Laporan/Laporanpeminjamanbuku.jrxml";
            reportDest = System.getProperty("user.dir") + "/Laporan/Laporanpeminjamanbuku.jasper";

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_LprnBarangKeluarActionPerformed

    private void LprnBarangMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LprnBarangMasukActionPerformed
        // TODO add your handling code here:
        String reportSource = null;
        String reportDest = null;

        try {

            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_tokok");
            reportSource = System.getProperty("user.dir") + "/Laporan/Laporanpeminjamanbuku.jrxml";
            reportDest = System.getProperty("user.dir") + "/Laporan/Laporanpeminjamanbuku.jasper";

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_LprnBarangMasukActionPerformed

    private void LprnPersediaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LprnPersediaanActionPerformed
        // TODO add your handling code here:
        String reportSource = null;
        String reportDest = null;

        try {

            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_tokok");
            reportSource = System.getProperty("user.dir") + "/Laporan/Laporanpeminjamanbuku.jrxml";
            reportDest = System.getProperty("user.dir") + "/Laporan/Laporanpeminjamanbuku.jasper";

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_LprnPersediaanActionPerformed

    private void LprnDaraBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LprnDaraBarangActionPerformed
        // TODO add your handling code here:
        String reportSource = null;
        String reportDest = null;

        try {

            com.mysql.jdbc.Connection c = (com.mysql.jdbc.Connection) DatabaseConnection.getKoneksi("localhost", "3306", "root", "", "db_tokok");
            reportSource = System.getProperty("user.dir") + "/Laporan/Laporanpeminjamanbuku.jrxml";
            reportDest = System.getProperty("user.dir") + "/Laporan/Laporanpeminjamanbuku.jasper";

            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, c);
            JasperExportManager.exportReportToHtmlFile(jasperPrint, reportDest);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_LprnDaraBarangActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FHelp h = new FHelp();
        h.show();
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
    }//GEN-LAST:event_HelpActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Login l = new Login();
        l.show();
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login l = new Login();
        l.show();
        dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FAbout f = new FAbout();
        f.show();
        dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FHelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Logout;
    private javax.swing.JMenuItem LprnBarangKeluar;
    private javax.swing.JMenuItem LprnBarangMasuk;
    private javax.swing.JMenuItem LprnDaraBarang;
    private javax.swing.JMenuItem LprnPersediaan;
    private javax.swing.JMenuItem TPemB;
    private javax.swing.JMenuItem TPenB;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem mnFB;
    private javax.swing.JMenuItem mnFP;
    // End of variables declaration//GEN-END:variables
}
