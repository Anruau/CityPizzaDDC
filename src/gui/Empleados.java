package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Empleados extends javax.swing.JFrame {

    JFrame frame;

    public Empleados() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("City Pizza");
    }

    public Empleados(JFrame f) {
        initComponents();
        this.frame = f;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("City Pizza");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        darAltaCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelEmpleados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        cerrarSesionLabel = new javax.swing.JLabel();
        perfilLabel = new javax.swing.JLabel();
        empleados = new javax.swing.JLabel();
        pedidos = new javax.swing.JLabel();
        facturacion = new javax.swing.JLabel();
        clientes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jPanel1.setBackground(new java.awt.Color(230, 145, 56));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setMinimumSize(new java.awt.Dimension(1070, 847));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1098, 847));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Logo_20.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Empleados");

        panelPrincipal.setBackground(new java.awt.Color(255, 229, 153));
        panelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(255, 229, 153));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/2019-11-05 20_08_56-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N
        jLabel5.setText("Empleados trabajando");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/2019-11-05 20_08_56-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        darAltaCliente.setBackground(new java.awt.Color(255, 255, 255));
        darAltaCliente.setForeground(new java.awt.Color(0, 0, 0));
        darAltaCliente.setText("Dar de alta cliente");
        darAltaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        darAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAltaClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Visor de productividad");

        panelEmpleados.setBackground(new java.awt.Color(255, 229, 153));
        panelEmpleados.setBorder(new javax.swing.border.MatteBorder(null));

        jList1.setBackground(new java.awt.Color(255, 229, 153));
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Rafael Cristian Barbieru", "Cristian Petru Badarau", "Sergio Zambrano" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        cerrarSesionLabel.setBackground(new java.awt.Color(255, 255, 255));
        cerrarSesionLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cerrarSesionLabel.setForeground(new java.awt.Color(0, 0, 0));
        cerrarSesionLabel.setText("Cerrar sesión");
        cerrarSesionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionLabelMouseClicked(evt);
            }
        });

        perfilLabel.setBackground(new java.awt.Color(255, 255, 255));
        perfilLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        perfilLabel.setForeground(new java.awt.Color(0, 0, 0));
        perfilLabel.setText("Perfil");

        empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/2019-11-05 19_34_55-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N

        pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/2019-11-05 19_35_30-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N

        facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/2019-11-05 19_35_36-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N
        facturacion.setToolTipText("");

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/2019-11-05 19_35_42-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N

        jButton1.setText("Sacar informe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(74, 74, 74)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 501, Short.MAX_VALUE)
                                .addComponent(darAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addGap(314, 314, 314)
                        .addComponent(empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(pedidos)
                        .addGap(62, 62, 62)
                        .addComponent(facturacion)
                        .addGap(74, 74, 74)
                        .addComponent(clientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(perfilLabel)
                        .addGap(28, 28, 28)
                        .addComponent(cerrarSesionLabel)
                        .addGap(8, 8, 8)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clientes)
                            .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pedidos)
                                .addComponent(facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(empleados))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(perfilLabel)
                            .addComponent(cerrarSesionLabel))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(darAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(22, 22, 22)))
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void darAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAltaClienteActionPerformed


    }//GEN-LAST:event_darAltaClienteActionPerformed

    private void cerrarSesionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionLabelMouseClicked

        frame.show();
        this.dispose();

    }//GEN-LAST:event_cerrarSesionLabelMouseClicked

    private void crearInforme() {
        try {
            Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dam", "root", "1234");
            System.out.println(con);
            JasperPrint print = JasperFillManager.fillReport(Empleados.class.getResourceAsStream("/report5.jasper"),
                    new HashMap<>(), con);
            System.out.println("hola");
            JasperViewer view = new JasperViewer(print);
            view.setVisible(true);
        } catch (SQLException ex) {
            System.out.println("Error de la base de datos");
        } catch (JRException ex) {
            System.out.println("Error en la conversión.");
        }
    }

    public boolean testConection() {
        Connection con = null;
        boolean good = false;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dam", "root", "");
            good = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return good;
    }

    public ResultSet testResultNull() {
        Connection con = null;
        ResultSet uwu = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dam", "root", "");
            Statement sentencia = con.createStatement();
            String sql = "select * from kjsabdkasdbc";
            uwu = sentencia.executeQuery(sql);
            return uwu;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return uwu;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        crearInforme();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrarSesionLabel;
    private javax.swing.JLabel clientes;
    private javax.swing.JButton darAltaCliente;
    private javax.swing.JLabel empleados;
    private javax.swing.JLabel facturacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel pedidos;
    private javax.swing.JLabel perfilLabel;
    // End of variables declaration//GEN-END:variables
}
