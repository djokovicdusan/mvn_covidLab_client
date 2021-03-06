/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domen.Administrator;
import gui.laborant.LaborantForma;
import gui.pacijent.PacijentForma;
import gui.termin.RezultatForma;
import gui.termin.SviRezultatiForma;
import gui.termin.TerminForma;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import session.Session;

/**
 *
 * @author DuleDjo
 */
public class GlavnaForma extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    GlavnaForma() {
        initComponents();
        populateCurrentUser();
        setTitle("Laboratorija za testiranje na Covid-19");
        centerWindow();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelTrenutniAdministrator = new javax.swing.JPanel();
        adminLoggedIn = new javax.swing.JLabel();
        lblCurrentUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmStudent = new javax.swing.JMenu();
        jmiDodajPacijenta = new javax.swing.JMenuItem();
        jmiIzmeniPacijenta = new javax.swing.JMenuItem();
        jmiObrisiPacijenta = new javax.swing.JMenuItem();
        jmLaborant = new javax.swing.JMenu();
        jmiDodajLaboranta = new javax.swing.JMenuItem();
        jmiObrisiLaboranta = new javax.swing.JMenuItem();
        jmiIzmeniLaboranta = new javax.swing.JMenuItem();
        jmAppointment = new javax.swing.JMenu();
        jmiDodajTermin = new javax.swing.JMenuItem();
        jmiUnosRezultata = new javax.swing.JMenuItem();
        jmiIzvestajRezultat = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dobrodo??li");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        panelTrenutniAdministrator.setBackground(new java.awt.Color(102, 0, 0));
        panelTrenutniAdministrator.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, new java.awt.Color(157, 182, 248)), "Trenutni administrator", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MS Reference Sans Serif", 0, 28), new java.awt.Color(255, 255, 255))); // NOI18N
        panelTrenutniAdministrator.setForeground(new java.awt.Color(255, 0, 0));
        panelTrenutniAdministrator.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        adminLoggedIn.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        adminLoggedIn.setForeground(new java.awt.Color(255, 255, 255));
        adminLoggedIn.setText("  ");

        javax.swing.GroupLayout panelTrenutniAdministratorLayout = new javax.swing.GroupLayout(panelTrenutniAdministrator);
        panelTrenutniAdministrator.setLayout(panelTrenutniAdministratorLayout);
        panelTrenutniAdministratorLayout.setHorizontalGroup(
            panelTrenutniAdministratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrenutniAdministratorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );
        panelTrenutniAdministratorLayout.setVerticalGroup(
            panelTrenutniAdministratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrenutniAdministratorLayout.createSequentialGroup()
                .addComponent(adminLoggedIn)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        lblCurrentUser.setBackground(new java.awt.Color(216, 226, 253));
        lblCurrentUser.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCurrentUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/dd.png"))); // NOI18N
        jLabel1.setText("L");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelTrenutniAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblCurrentUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTrenutniAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dobrodo??li u sistem za testiranje na COVID-19 ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jmStudent.setText("Pacijent  ");
        jmStudent.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jmStudent.setInheritsPopupMenu(true);

        jmiDodajPacijenta.setBackground(new java.awt.Color(250, 252, 255));
        jmiDodajPacijenta.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiDodajPacijenta.setText("Dodaj novog pacijenta");
        jmiDodajPacijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodajPacijentaActionPerformed(evt);
            }
        });
        jmStudent.add(jmiDodajPacijenta);

        jmiIzmeniPacijenta.setBackground(new java.awt.Color(250, 252, 255));
        jmiIzmeniPacijenta.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiIzmeniPacijenta.setText("Izmeni pacijenta");
        jmiIzmeniPacijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIzmeniPacijentaActionPerformed(evt);
            }
        });
        jmStudent.add(jmiIzmeniPacijenta);

        jmiObrisiPacijenta.setBackground(new java.awt.Color(250, 252, 255));
        jmiObrisiPacijenta.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiObrisiPacijenta.setText("Obri??i pacijenta");
        jmiObrisiPacijenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiObrisiPacijentaActionPerformed(evt);
            }
        });
        jmStudent.add(jmiObrisiPacijenta);

        jMenuBar1.add(jmStudent);

        jmLaborant.setBackground(new java.awt.Color(255, 255, 255));
        jmLaborant.setText("Laborant  ");
        jmLaborant.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N

        jmiDodajLaboranta.setBackground(new java.awt.Color(250, 252, 255));
        jmiDodajLaboranta.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiDodajLaboranta.setText("Dodaj novog laboranta");
        jmiDodajLaboranta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodajLaborantaActionPerformed(evt);
            }
        });
        jmLaborant.add(jmiDodajLaboranta);

        jmiObrisiLaboranta.setBackground(new java.awt.Color(250, 252, 255));
        jmiObrisiLaboranta.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiObrisiLaboranta.setText("Obri??i laboranta");
        jmiObrisiLaboranta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiObrisiLaborantaActionPerformed(evt);
            }
        });
        jmLaborant.add(jmiObrisiLaboranta);

        jmiIzmeniLaboranta.setBackground(new java.awt.Color(250, 252, 255));
        jmiIzmeniLaboranta.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiIzmeniLaboranta.setText("Izmeni laboranta");
        jmiIzmeniLaboranta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIzmeniLaborantaActionPerformed(evt);
            }
        });
        jmLaborant.add(jmiIzmeniLaboranta);

        jMenuBar1.add(jmLaborant);

        jmAppointment.setText("Termin");
        jmAppointment.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N

        jmiDodajTermin.setBackground(new java.awt.Color(250, 252, 255));
        jmiDodajTermin.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiDodajTermin.setText("Zaka??i termin testiranja");
        jmiDodajTermin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDodajTerminActionPerformed(evt);
            }
        });
        jmAppointment.add(jmiDodajTermin);

        jmiUnosRezultata.setBackground(new java.awt.Color(250, 252, 255));
        jmiUnosRezultata.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiUnosRezultata.setText("Unos rezultata testiranja");
        jmiUnosRezultata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUnosRezultataActionPerformed(evt);
            }
        });
        jmAppointment.add(jmiUnosRezultata);

        jmiIzvestajRezultat.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jmiIzvestajRezultat.setText("Izvestaj rezultata");
        jmiIzvestajRezultat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIzvestajRezultatActionPerformed(evt);
            }
        });
        jmAppointment.add(jmiIzvestajRezultat);

        jMenuBar1.add(jmAppointment);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiDodajPacijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodajPacijentaActionPerformed
        new PacijentForma(null, true, ModForme.UNOS).setVisible(true);
    }//GEN-LAST:event_jmiDodajPacijentaActionPerformed

    private void jmiUnosRezultataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUnosRezultataActionPerformed
        JDialog frmGrades = new RezultatForma(this, true);
        frmGrades.setVisible(true);
    }//GEN-LAST:event_jmiUnosRezultataActionPerformed

    private void jmiIzmeniPacijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIzmeniPacijentaActionPerformed
        new PretragaForma(this, true, ModPretraga.PACIJENT).setVisible(true);
    }//GEN-LAST:event_jmiIzmeniPacijentaActionPerformed

    private void jmiDodajLaborantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodajLaborantaActionPerformed
        new LaborantForma(null, true, ModForme.UNOS).setVisible(true);
    }//GEN-LAST:event_jmiDodajLaborantaActionPerformed

    private void jmiObrisiPacijentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiObrisiPacijentaActionPerformed
        new PretragaForma(this, true, ModPretraga.PACIJENT).setVisible(true);
    }//GEN-LAST:event_jmiObrisiPacijentaActionPerformed

    private void jmiObrisiLaborantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiObrisiLaborantaActionPerformed
        new PretragaForma(this, true, ModPretraga.LABORANT).setVisible(true);
    }//GEN-LAST:event_jmiObrisiLaborantaActionPerformed

    private void jmiDodajTerminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDodajTerminActionPerformed
        new TerminForma(this, true).setVisible(true);
    }//GEN-LAST:event_jmiDodajTerminActionPerformed

    private void jmiIzmeniLaborantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIzmeniLaborantaActionPerformed
        new PretragaForma(this, true, ModPretraga.LABORANT).setVisible(true);
    }//GEN-LAST:event_jmiIzmeniLaborantaActionPerformed

    private void jmiIzvestajRezultatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIzvestajRezultatActionPerformed
        new SviRezultatiForma(this, true).setVisible(true);        
    }//GEN-LAST:event_jmiIzvestajRezultatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLoggedIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jmAppointment;
    private javax.swing.JMenu jmLaborant;
    private javax.swing.JMenu jmStudent;
    private javax.swing.JMenuItem jmiDodajLaboranta;
    private javax.swing.JMenuItem jmiDodajPacijenta;
    private javax.swing.JMenuItem jmiDodajTermin;
    private javax.swing.JMenuItem jmiIzmeniLaboranta;
    private javax.swing.JMenuItem jmiIzmeniPacijenta;
    private javax.swing.JMenuItem jmiIzvestajRezultat;
    private javax.swing.JMenuItem jmiObrisiLaboranta;
    private javax.swing.JMenuItem jmiObrisiPacijenta;
    private javax.swing.JMenuItem jmiUnosRezultata;
    private javax.swing.JLabel lblCurrentUser;
    private javax.swing.JPanel panelTrenutniAdministrator;
    // End of variables declaration//GEN-END:variables

    private void populateCurrentUser() {
        Administrator user = Session.getInstance().getCurrentUser();
        adminLoggedIn.setText(user.getIme() + " " + user.getPrezime());
        
    }
    
    public GlavnaForma getForm() {
        return this;
    }
    
    private void centerWindow() {
        setLocationRelativeTo(null);
    }
    
}
