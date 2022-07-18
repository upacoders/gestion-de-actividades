package pantallas;

import baseDatos.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AgregarEspacioTrabajo extends javax.swing.JPanel {

    DefaultTableModel tMR = new DefaultTableModel();

    public AgregarEspacioTrabajo() {
        initComponents();

        tMR.addColumn("Miembro");
        tMR.addColumn("Rol");
        tablaMiembroRol.setModel(tMR);

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Euclick", "postgres", "Keigomitsui77");

            Statement st = con.createStatement();
            String sql = "select id_persona, correo from persona order by id_persona ASC";
            ResultSet rs = st.executeQuery(sql);

            miembros.removeAllItems();
            miembros.addItem("Seleccione una opcion");

            while (rs.next()) {
                miembros.addItem(rs.getString("correo"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Euclick", "postgres", "Keigomitsui77");

            Statement st = con.createStatement();
            String sql = "select nombre_rol,id_rol from rol order by id_rol asc;";
            ResultSet rs = st.executeQuery(sql);
            rolmiembro.removeAllItems();
            rolmiembro.addItem("Seleccione una opcion");

            while (rs.next()) {
                rolmiembro.addItem(rs.getString("nombre_rol"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JimenaBtnGroup = new javax.swing.ButtonGroup();
        HiramBtnGroup = new javax.swing.ButtonGroup();
        MarceleloBtnGroup = new javax.swing.ButtonGroup();
        GuidoBtnGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreProyecto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        miembros = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        rolmiembro = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMiembroRol = new javax.swing.JTable();

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
        nombreProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProyectoActionPerformed(evt);
            }
        });
        add(nombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 280, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Agregar Miembros");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, -1));

        guardarBtn.setText("Guardar");
        guardarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarBtnMouseClicked(evt);
            }
        });
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

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("+");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 20, 20));

        miembros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        miembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miembrosActionPerformed(evt);
            }
        });
        add(miembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 280, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("Rol de miembro");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 120, -1));

        rolmiembro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opcion" }));
        rolmiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolmiembroActionPerformed(evt);
            }
        });
        add(rolmiembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 280, -1));

        tablaMiembroRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMiembroRol);
        if (tablaMiembroRol.getColumnModel().getColumnCount() > 0) {
            tablaMiembroRol.getColumnModel().getColumn(0).setResizable(false);
            tablaMiembroRol.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBtnMouseClicked
        setVisible(false);
    }//GEN-LAST:event_cancelarBtnMouseClicked

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        //ACA FALTA ARREGLAR PARA INSERTAR
        //Tomamos los nombre elegidos en la tabla y los guardaremos en la base de datos
        for (int i = 0; i < tablaMiembroRol.getRowCount(); i++) {
            String correoPersona = (String) tablaMiembroRol.getValueAt(i, 0);
            String idRol = (String) tablaMiembroRol.getValueAt(i, 1);

            try {
                Class.forName("org.postgresql.Driver");
                Connection Conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Euclick", "postgres", "Keigomitsui77");
                Conexion con = new Conexion();
                String nombre = nombreProyecto.getText();
                Connection conexion;
                con.crearConexion();
                Conexion = con.getConexion();
                Statement st = Conexion.createStatement();
                String sqlinsertar = "insert into espacio_trabajo (nombre_espacio_trabajo) values (?)";
                PreparedStatement sentencia_preparada = null;
                sentencia_preparada = Conexion.prepareStatement(sqlinsertar);
                sentencia_preparada.setString(1, nombre);
                sentencia_preparada.executeUpdate();
                sentencia_preparada.close();
                
                
                String sqlid = "select id_espacio_trabajo from espacio_trabajo where nombre_espacio_trabajo = '" + nombre + "'";
                ResultSet resultSet = st.executeQuery(sqlid);
                resultSet.next();
		int id_espacio_trabajo = resultSet.getInt(1);
                
                String sqlid_p = "select id_persona from persona where correo = '" + correoPersona + "'";
                resultSet = st.executeQuery(sqlid_p);
                resultSet.next();
		int id_persona = resultSet.getInt(1);
                
                
                String sqlcrearespacio = "insert into persona_espacio_trabajo (id_persona, id_espacio_trabajo)"+ " values (?,?)";
                sentencia_preparada = null;
                sentencia_preparada = Conexion.prepareStatement(sqlcrearespacio);
                sentencia_preparada.setInt(1, id_persona);
                sentencia_preparada.setInt(2, id_espacio_trabajo);
                sentencia_preparada.executeUpdate();
                sentencia_preparada.close();
                
                JOptionPane.showMessageDialog(null, "Tablero creado con exito");
                
                Conexion.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Nombre: " + correoPersona);//Nombre del Wey
            System.out.println("Rol: " + idRol);//Nombre del rol
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void miembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miembrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miembrosActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked

        if (miembros.getSelectedItem().toString().equals("Seleccione una opcion")) {
            javax.swing.JOptionPane.showMessageDialog(this, "DEBE ELEGIR UN MIEMBRO AL MENOS " + javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else if (rolmiembro.getSelectedItem().toString().equals("Seleccione una opcion")) {
            javax.swing.JOptionPane.showMessageDialog(this, "DEBE ELEGIR UN ROL AL MENOS " + javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            String Dato[] = new String[2];
            String elegido = miembros.getSelectedItem().toString();
            String rolElegido = rolmiembro.getSelectedItem().toString();
            Dato[0] = elegido;
            Dato[1] = rolElegido;

            tMR.addRow(Dato);
        }

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Euclick", "postgres", "Keigomitsui77");

            Statement st = con.createStatement();
            String sql = "select id_persona, correo from persona order by id_persona ASC";
            ResultSet rs = st.executeQuery(sql);

            miembros.removeAllItems();
            miembros.addItem("Seleccione una opcion");

            while (rs.next()) {
                miembros.addItem(rs.getString("correo"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Euclick", "postgres", "Keigomitsui77");

            Statement st = con.createStatement();
            String sql = "select nombre_rol,id_rol from rol order by id_rol ASC;";
            ResultSet rs = st.executeQuery(sql);
            rolmiembro.removeAllItems();
            rolmiembro.addItem("Seleccione una opcion");

            while (rs.next()) {
                rolmiembro.addItem(rs.getString("nombre_rol"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_jLabel10MouseClicked

    private void rolmiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolmiembroActionPerformed
        //
    }//GEN-LAST:event_rolmiembroActionPerformed

    private void guardarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarBtnMouseClicked

    }//GEN-LAST:event_guardarBtnMouseClicked

    private void nombreProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProyectoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GuidoBtnGroup;
    private javax.swing.ButtonGroup HiramBtnGroup;
    private javax.swing.ButtonGroup JimenaBtnGroup;
    private javax.swing.ButtonGroup MarceleloBtnGroup;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> miembros;
    private javax.swing.JTextField nombreProyecto;
    private javax.swing.JComboBox<String> rolmiembro;
    public javax.swing.JTable tablaMiembroRol;
    // End of variables declaration//GEN-END:variables
}
