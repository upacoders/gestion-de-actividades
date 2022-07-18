/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pantallas;

import baseDatos.ActividadesJDBC;
import java.text.SimpleDateFormat;

/**
 *
 * @author keigo
 */
public class agregarActividades extends javax.swing.JPanel {
String nombre;
    String fechainicio;
    String fechalimite;
    String estado;
    SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");

    ActividadesJDBC actividadesjdbc;
    /**
     * Creates new form agregarActividades
     */
    public agregarActividades() throws Exception {
        actividadesjdbc = new ActividadesJDBC();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cldinicio = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        cldlimite = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdenproceso = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rdpendientes = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        rdfinalizadas = new javax.swing.JRadioButton();
        btnguardar = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(227, 229, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("Agregar Actividades");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 154, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nombre de la actividad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txtnombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtnombre.setText("Agregar nombre de la actividad");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 280, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(cldinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Fecha limite ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        jPanel1.add(cldlimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Estado de la actividad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("En proceso");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        rdenproceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdenprocesoActionPerformed(evt);
            }
        });
        jPanel1.add(rdenproceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Pendientes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        rdpendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdpendientesActionPerformed(evt);
            }
        });
        jPanel1.add(rdpendientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Finalizadas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        rdfinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdfinalizadasActionPerformed(evt);
            }
        });
        jPanel1.add(rdfinalizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        cancelarBtn.setText("Cancelar");
        cancelarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarBtnMouseClicked(evt);
            }
        });
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed

    }//GEN-LAST:event_txtnombreActionPerformed

    private void rdenprocesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdenprocesoActionPerformed
estado = "en proceso";
    }//GEN-LAST:event_rdenprocesoActionPerformed

    private void rdpendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdpendientesActionPerformed
estado = "pendiente";
    }//GEN-LAST:event_rdpendientesActionPerformed

    private void rdfinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdfinalizadasActionPerformed
estado = "finalizada";
    }//GEN-LAST:event_rdfinalizadasActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
nombre = txtnombre.getText();
        fechainicio = sdf.format(cldinicio.getDate());
        fechalimite = sdf.format(cldlimite.getDate());

        int id_estado = actividadesjdbc.Idestado(estado);
        actividadesjdbc.insert(nombre, fechainicio, fechalimite, id_estado);
    }//GEN-LAST:event_btnguardarActionPerformed

    private void cancelarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMouseClicked

    }//GEN-LAST:event_cancelarBtnMouseClicked

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton cancelarBtn;
    private com.toedter.calendar.JDateChooser cldinicio;
    private com.toedter.calendar.JDateChooser cldlimite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdenproceso;
    private javax.swing.JRadioButton rdfinalizadas;
    private javax.swing.JRadioButton rdpendientes;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
