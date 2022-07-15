/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import baseDatos.Guardar_id;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class espacio_de_trabajo extends javax.swing.JFrame {

    /**
     * Creates new form espacio_de_trabajo
     */
    
    int xMouse,yMouse;
    
    public espacio_de_trabajo() {
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
        panelOpcionesPantalla = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        companyName = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        agregarTablero = new javax.swing.JButton();
        JCombo = new javax.swing.JComboBox<>();
        agregarTablero1 = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        elegirTablero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpcionesPantalla.setBackground(new java.awt.Color(88, 104, 117));
        panelOpcionesPantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelOpcionesPantallaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelOpcionesPantallaMouseReleased(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setText("X");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesPantallaLayout = new javax.swing.GroupLayout(panelOpcionesPantalla);
        panelOpcionesPantalla.setLayout(panelOpcionesPantallaLayout);
        panelOpcionesPantallaLayout.setHorizontalGroup(
            panelOpcionesPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesPantallaLayout.createSequentialGroup()
                .addGap(0, 1169, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelOpcionesPantallaLayout.setVerticalGroup(
            panelOpcionesPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jPanel1.add(panelOpcionesPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 20));

        jPanel3.setBackground(new java.awt.Color(88, 104, 117));
        jPanel3.setForeground(new java.awt.Color(88, 104, 117));
        jPanel3.setToolTipText("");

        companyName.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        companyName.setText("Euclick");
        companyName.setToolTipText("");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotuerca.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(companyName)
                .addContainerGap(1027, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addComponent(companyName))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1200, 70));

        jPanel4.setBackground(new java.awt.Color(165, 200, 202));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("MENÚ");

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setText("Espacios de trabajo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Dashboard");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setText("Configuraciones");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(136, 136, 136))
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addComponent(jButton7)
                .addGap(17, 17, 17)
                .addComponent(jButton6)
                .addGap(17, 17, 17)
                .addComponent(jButton8)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 330, 540));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Espacio de Trabajo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Tableros");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        agregarTablero.setBackground(new java.awt.Color(255, 255, 204));
        agregarTablero.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        agregarTablero.setText("+ Agregar Tablero");
        agregarTablero.setBorder(null);
        agregarTablero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTableroActionPerformed(evt);
            }
        });
        jPanel1.add(agregarTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 300, 30));

        JCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona espacio de trabajo" }));
        JCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboActionPerformed(evt);
            }
        });
        jPanel1.add(JCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 290, 40));

        agregarTablero1.setBackground(new java.awt.Color(255, 255, 204));
        agregarTablero1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        agregarTablero1.setText("+ Agregar Espacio de Trabajo");
        agregarTablero1.setToolTipText("");
        agregarTablero1.setBorder(null);
        agregarTablero1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregarTablero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarTablero1MouseClicked(evt);
            }
        });
        agregarTablero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTablero1ActionPerformed(evt);
            }
        });
        jPanel1.add(agregarTablero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 300, 30));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 540, 470));

        jPanel1.add(elegirTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 290, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTableroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarTableroActionPerformed

    private void agregarTablero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTablero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarTablero1ActionPerformed

    private void agregarTablero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTablero1MouseClicked
        AgregarEspacioTrabajo eT = new AgregarEspacioTrabajo();
        eT.setSize(540,470);
        eT.setLocation(0,0);
        
        content.removeAll();
        content.add(eT, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_agregarTablero1MouseClicked

    private void panelOpcionesPantallaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionesPantallaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelOpcionesPantallaMousePressed

    private void panelOpcionesPantallaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionesPantallaMouseReleased
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelOpcionesPantallaMouseReleased

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dashboard newFrame = new dashboard();
        newFrame.setVisible (true);
        this.dispose(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Configuracion newFrame = new Configuracion();
        newFrame.setVisible (true);
        this.dispose(); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void JComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboActionPerformed
         
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/Euclick","postgres","12345");
            
            Statement st = con.createStatement();
            String sql = "select nombre_espacio_trabajo from espacio_trabajo et join persona_espacio_trabajo pet on pet.id_espacio_trabajo = et.id_espacio_trabajo where pet.id_persona = " + Guardar_id.id ;
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                JCombo.setName(rs.getString("nombre_espacio_trabajo"));
                
            }
            con.close();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_JComboActionPerformed

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
            java.util.logging.Logger.getLogger(espacio_de_trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(espacio_de_trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(espacio_de_trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(espacio_de_trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new espacio_de_trabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCombo;
    private javax.swing.JButton agregarTablero;
    private javax.swing.JButton agregarTablero1;
    private javax.swing.JLabel companyName;
    private javax.swing.JPanel content;
    private javax.swing.JComboBox<String> elegirTablero;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelOpcionesPantalla;
    // End of variables declaration//GEN-END:variables
}
