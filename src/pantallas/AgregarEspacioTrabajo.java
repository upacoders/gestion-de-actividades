/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pantallas;

/**
 *
 * @author Lenovo
 */
public class AgregarEspacioTrabajo extends javax.swing.JPanel {

    /**
     * Creates new form agregarEspacioTrabajo_1
     */
    public AgregarEspacioTrabajo() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreProyecto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        miembroProyecto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonJefeEspacio = new javax.swing.JRadioButton();
        botontrabajo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        botonJefeEspacio1 = new javax.swing.JRadioButton();
        botonTrabajo1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        botonJefeEspacio2 = new javax.swing.JRadioButton();
        botonTrabajo2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        botonJefeEspacio3 = new javax.swing.JRadioButton();
        botonTrabajo3 = new javax.swing.JRadioButton();
        guardarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(227, 229, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("Agregar Espacio de Trabajo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 120, -1));

        nombreProyecto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nombreProyecto.setText("agregar nombre del Espacio de Trabajo");
        add(nombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 280, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Agregar Miembros");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, -1));

        miembroProyecto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        miembroProyecto.setText("agregar miembros al equipo");
        add(miembroProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 280, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Jefe de espacio");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Trabajo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Jimena Lezcano");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        botonJefeEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJefeEspacioActionPerformed(evt);
            }
        });
        add(botonJefeEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        botontrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botontrabajoActionPerformed(evt);
            }
        });
        add(botontrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Hiram Verdefronte");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        botonJefeEspacio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJefeEspacio1ActionPerformed(evt);
            }
        });
        add(botonJefeEspacio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        botonTrabajo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrabajo1ActionPerformed(evt);
            }
        });
        add(botonTrabajo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Marcelo Rodriguez");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        botonJefeEspacio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJefeEspacio2ActionPerformed(evt);
            }
        });
        add(botonJefeEspacio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        botonTrabajo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrabajo2ActionPerformed(evt);
            }
        });
        add(botonTrabajo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Guido Acosta");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        botonJefeEspacio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJefeEspacio3ActionPerformed(evt);
            }
        });
        add(botonJefeEspacio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        botonTrabajo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrabajo3ActionPerformed(evt);
            }
        });
        add(botonTrabajo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });
        add(guardarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

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
        add(cancelarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonJefeEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJefeEspacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJefeEspacioActionPerformed

    private void botontrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botontrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botontrabajoActionPerformed

    private void botonJefeEspacio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJefeEspacio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJefeEspacio1ActionPerformed

    private void botonTrabajo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrabajo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTrabajo1ActionPerformed

    private void botonJefeEspacio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJefeEspacio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJefeEspacio2ActionPerformed

    private void botonTrabajo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrabajo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTrabajo2ActionPerformed

    private void botonJefeEspacio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJefeEspacio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonJefeEspacio3ActionPerformed

    private void botonTrabajo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrabajo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTrabajo3ActionPerformed

    private void cancelarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMouseClicked
        setVisible(false);
    }//GEN-LAST:event_cancelarBtnMouseClicked

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botonJefeEspacio;
    private javax.swing.JRadioButton botonJefeEspacio1;
    private javax.swing.JRadioButton botonJefeEspacio2;
    private javax.swing.JRadioButton botonJefeEspacio3;
    private javax.swing.JRadioButton botonTrabajo1;
    private javax.swing.JRadioButton botonTrabajo2;
    private javax.swing.JRadioButton botonTrabajo3;
    private javax.swing.JRadioButton botontrabajo;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField miembroProyecto;
    private javax.swing.JTextField nombreProyecto;
    // End of variables declaration//GEN-END:variables
}
