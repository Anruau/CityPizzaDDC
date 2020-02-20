package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Petru Badarau
 */
public class Login extends javax.swing.JFrame {

    /**
     * @see init
     *
     */
    public Login() {
        initComponents();
        this.setTitle("City Pizza");
    }

    /**
     *
     * @param f
     */
    public Login(JFrame f) {
        initComponents();
        this.setTitle("City Pizza");
    }

    /**
     *
     * @param nombre : String
     * @param contrasena : String
     * @return inicio de sesión exitoso
     */
    public boolean comprobar(String nombre, String contrasena) {

        try {

            String consulta = "select * from usuarios where usuario = ? ";
            String consulta2 = "select * from usuarios where contrasena = ?";
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dam", "root", "1234");
            PreparedStatement sentencia = conexion.prepareStatement(consulta);
            sentencia.setString(1, nombre);
            PreparedStatement sentencia2 = conexion.prepareStatement(consulta2);
            sentencia2.setString(1, contrasena);
            ResultSet rs = sentencia.executeQuery();
            ResultSet rs2 = sentencia2.executeQuery();
            boolean nombreEncontrado = false;
            boolean contrasenaEcontrada = false;
            if (rs.next()) {
                nombreEncontrado = true;
            }

            if (rs2.next()) {
                contrasenaEcontrada = true;
            }

            if (nombreEncontrado && contrasenaEcontrada) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfUsuario = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        loguear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jPanel1.setBackground(new java.awt.Color(230, 145, 56));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1098, 847));

        tfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        tfUsuario.setForeground(new java.awt.Color(0, 0, 0));
        tfUsuario.setText("Usuario");
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        pfPassword.setBackground(new java.awt.Color(255, 255, 255));
        pfPassword.setForeground(new java.awt.Color(0, 0, 0));
        pfPassword.setText("Contraseña");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Logo.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 343));

        loguear.setBackground(new java.awt.Color(255, 255, 255));
        loguear.setForeground(new java.awt.Color(0, 0, 0));
        loguear.setText("Login");
        loguear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loguearActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("He olvidado mi contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(404, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loguear, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(389, 389, 389))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(459, 459, 459))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loguear)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        tfUsuario.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed


    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void loguearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loguearActionPerformed

        if (comprobar(tfUsuario.getText(), pfPassword.getText())) {
            new Empleados().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "El usuario y contraseña no concuerda con ningún usuario de nuestra base de datos");
        }


    }//GEN-LAST:event_loguearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loguear;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
