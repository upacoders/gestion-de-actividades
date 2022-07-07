/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    int xMouse, yMouse;
    
    public Login() {
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

        bg = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        text4user = new javax.swing.JLabel();
        text4password = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        registrarse = new javax.swing.JButton();
        login = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        loginImage = new javax.swing.JLabel();
        leftImage = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        logoAndNameSpace = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        companyName = new javax.swing.JLabel();
        barraDeAccionesSobrePantalla = new javax.swing.JPanel();
        botonSalida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(165, 200, 202));
        loginPanel.setForeground(new java.awt.Color(165, 200, 202));

        text4user.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text4user.setText("Usuario");

        text4password.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        text4password.setText("Contraseña");

        forgotPassword.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        forgotPassword.setText("¿Olvidó su contraseña?");

        registrarse.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        registrarse.setText("Registrarse");
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(255, 51, 51));
        login.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        login.setText("Iniciar Sesión");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        user.setText("ingrese su usuario");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMousePressed(evt);
            }
        });
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        password.setText("********");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordMousePressed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text4user, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(text4password))
                        .addGap(26, 26, 26)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(password)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(forgotPassword))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(login)
                        .addGap(39, 39, 39)
                        .addComponent(registrarse)))
                .addGap(36, 36, 36))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text4user)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text4password)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarse)
                    .addComponent(login))
                .addGap(49, 49, 49))
        );

        bg.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 440, 280));

        loginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar-sesion.png"))); // NOI18N
        bg.add(loginImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 90, 90));

        leftImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pm.png"))); // NOI18N
        bg.add(leftImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 340, 370));

        loginTitle.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        loginTitle.setText("Login");
        bg.add(loginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 110, 50));

        logoAndNameSpace.setBackground(new java.awt.Color(88, 104, 117));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logotuerca.png"))); // NOI18N

        companyName.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        companyName.setText("Euclick");
        companyName.setToolTipText("");

        barraDeAccionesSobrePantalla.setBackground(new java.awt.Color(88, 104, 117));
        barraDeAccionesSobrePantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraDeAccionesSobrePantallaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                barraDeAccionesSobrePantallaMouseReleased(evt);
            }
        });

        botonSalida.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        botonSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalida.setText("X");
        botonSalida.setToolTipText("");
        botonSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonSalida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSalidaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout barraDeAccionesSobrePantallaLayout = new javax.swing.GroupLayout(barraDeAccionesSobrePantalla);
        barraDeAccionesSobrePantalla.setLayout(barraDeAccionesSobrePantallaLayout);
        barraDeAccionesSobrePantallaLayout.setHorizontalGroup(
            barraDeAccionesSobrePantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraDeAccionesSobrePantallaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraDeAccionesSobrePantallaLayout.setVerticalGroup(
            barraDeAccionesSobrePantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraDeAccionesSobrePantallaLayout.createSequentialGroup()
                .addComponent(botonSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout logoAndNameSpaceLayout = new javax.swing.GroupLayout(logoAndNameSpace);
        logoAndNameSpace.setLayout(logoAndNameSpaceLayout);
        logoAndNameSpaceLayout.setHorizontalGroup(
            logoAndNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoAndNameSpaceLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(companyName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1022, Short.MAX_VALUE))
            .addComponent(barraDeAccionesSobrePantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logoAndNameSpaceLayout.setVerticalGroup(
            logoAndNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoAndNameSpaceLayout.createSequentialGroup()
                .addComponent(barraDeAccionesSobrePantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(logoAndNameSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(companyName))
                .addContainerGap())
        );

        bg.add(logoAndNameSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarseActionPerformed

    private void barraDeAccionesSobrePantallaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraDeAccionesSobrePantallaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraDeAccionesSobrePantallaMousePressed

    private void barraDeAccionesSobrePantallaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraDeAccionesSobrePantallaMouseReleased
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_barraDeAccionesSobrePantallaMouseReleased

    private void botonSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalidaMouseClicked

    private void botonSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseEntered
        //a
    }//GEN-LAST:event_botonSalidaMouseEntered

    private void botonSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalidaMouseExited
       //a
    }//GEN-LAST:event_botonSalidaMouseExited

    private void userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMousePressed
        if(user.getText().equals("ingrese su usuario")) {
            user.setText("");
            user.setForeground(Color.black);
        }
        
        if (String.valueOf(password.getPassword()).isEmpty()){
            password.setText("********");
            password.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_userMousePressed

    private void passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMousePressed
        
        if (String.valueOf(password.getPassword()).equals("********")){
            password.setText("");
            password.setForeground(Color.black);
        }
        
        if(user.getText().isEmpty()){
            user.setText("Ingrese su usuario");
            user.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_passwordMousePressed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intengo de login con datos:\nUsuario: "+ user.getText() + "\nContraseña: " + String.valueOf(password.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraDeAccionesSobrePantalla;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel botonSalida;
    private javax.swing.JLabel companyName;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel leftImage;
    private javax.swing.JButton login;
    private javax.swing.JLabel loginImage;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoAndNameSpace;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registrarse;
    private javax.swing.JLabel text4password;
    private javax.swing.JLabel text4user;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
