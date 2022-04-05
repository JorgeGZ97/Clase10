package com.mycompany.tareaclase4;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sistema extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection conect; //conect.getConnection();
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;

    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtsalario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Salario");

        txtid.setEditable(false);
        txtid.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtnombre)
                    .addComponent(txtapellido)
                    .addComponent(txtsalario))
                .addGap(522, 522, 522))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRUD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnagregar)
                .addGap(88, 88, 88)
                .addComponent(btnmodificar)
                .addGap(74, 74, 74)
                .addComponent(btneliminar)
                .addGap(72, 72, 72)
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btnnuevo)
                    .addComponent(btnsalir))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Salario"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        int confirmar = JOptionPane.showConfirmDialog(rootPane, "¿Desea salir?");
        if (JOptionPane.OK_OPTION == confirmar) {
            System.exit(0);
        } else {
            if (JOptionPane.CANCEL_OPTION == confirmar) {
                return;
            }
        }
    }//GEN-LAST:event_btnsalirActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, " Seleccione una fila");
        } else {
            idc = Integer.parseInt((String) Tabla.getValueAt(fila, 0).toString());
            String nombre = (String) Tabla.getValueAt(fila, 1);
            String apellido = (String) Tabla.getValueAt(fila, 2);
            int salario = Integer.parseInt((String) Tabla.getValueAt(fila, 3).toString());
            txtid.setText("" + idc);
            txtnombre.setText("" + nombre);
            txtapellido.setText("" + apellido);
            txtsalario.setText("" + salario);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
        Agregar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        Modificar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        Eliminar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        Nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    void consultar() {
        String sql = "select * from salarios";
        try {
            conect = con.getConnection();
            st = conect.createStatement();
            rs = st.executeQuery(sql);
            Object[] dato = new Object[4];
            modelo = (DefaultTableModel) Tabla.getModel();
            while (rs.next()) {
                dato[0] = rs.getInt("Id"); //ID de la base de datos
                dato[1] = rs.getString("nombre");
                dato[2] = rs.getString("apellido");
                dato[3] = rs.getInt("salario");
                modelo.addRow(dato);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) {

        }
    }

    void Agregar() {
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        String salario = txtsalario.getText();
        try {
            if (nombre.equals("") || apellido.equals("") || salario.equals("")) {
                JOptionPane.showMessageDialog(null, "No ingreso ningun dato");
                limpiarTabla();
            } else {
                String sql = "insert into salarios(nombre,apellido,salario) values('" + nombre + "','" + apellido + "','" + salario + "')";
                conect = con.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se ingreso nuevo registro correctamente");
                limpiarTabla();
            }
        } catch (Exception e) {

        }
    }

    void Modificar() {
        String nombre = txtnombre.getText();
        String apellido = txtapellido.getText();
        String salario = txtsalario.getText();
        try {
            if (nombre.equals("") || apellido.equals("") || salario.equals("")) {
                JOptionPane.showMessageDialog(null, "Revisa bien los datos");
                limpiarTabla();
            } else {
                String sql = "Update salarios set Id='" + idc + "',nombre='" + nombre + "',apellido='" + apellido + "',salario='" + salario + "' where Id=" + idc;
                conect = con.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Los datos se han modificado exitosamente");
                limpiarTabla();
            }

        } catch (Exception e) {

        }
    }

    void Eliminar() {
        int fila = Tabla.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
                limpiarTabla();
            } else {
                String sql = "delete from salarios where Id=" + idc;
                conect = con.getConnection();
                st = conect.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Los datos se han eliminado correctamente");
                limpiarTabla();
            }
        } catch (Exception e) {

        }
    }
    void Nuevo() {
        txtid.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtsalario.setText("");
        txtnombre.requestFocus();
    }

    void limpiarTabla() {
        for (int i = 0; i <= Tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsalario;
    // End of variables declaration//GEN-END:variables
}
