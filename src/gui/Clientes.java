
package gui;

import javax.swing.JFrame;

public class Clientes extends javax.swing.JFrame {

    JFrame frame;
    
    public Clientes() {
        initComponents();
        this.setTitle("City Pizza");
    }
    
    public Clientes(JFrame f) {
        initComponents();
        this.frame = f;
        this.setTitle("City Pizza");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(230, 145, 56));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setMinimumSize(new java.awt.Dimension(1070, 847));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1098, 847));
        jPanel1.setLayout(null);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/Logo_20.png"))); // NOI18N
        jPanel1.add(logoLabel);
        logoLabel.setBounds(22, 19, 0, 0);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Empleados");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(41, 118, 121, 32);

        panelPrincipal.setBackground(new java.awt.Color(255, 229, 153));
        panelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/2019-11-05 20_08_56-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(807, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelPrincipal);
        panelPrincipal.setBounds(263, 162, 1719, 798);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Clientes - Selección Pizza");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(263, 118, 278, 32);

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
            .addGroup(panelEmpleadosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelEmpleados);
        panelEmpleados.setBounds(22, 162, 215, 798);

        cerrarSesionLabel.setBackground(new java.awt.Color(255, 255, 255));
        cerrarSesionLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cerrarSesionLabel.setForeground(new java.awt.Color(0, 0, 0));
        cerrarSesionLabel.setText("Cerrar sesión");
        cerrarSesionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionLabelMouseClicked(evt);
            }
        });
        jPanel1.add(cerrarSesionLabel);
        cerrarSesionLabel.setBounds(1224, 40, 86, 19);

        perfilLabel.setBackground(new java.awt.Color(255, 255, 255));
        perfilLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        perfilLabel.setForeground(new java.awt.Color(0, 0, 0));
        perfilLabel.setText("Perfil");
        jPanel1.add(perfilLabel);
        perfilLabel.setBounds(1151, 40, 32, 19);

        empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/2019-11-05 19_34_55-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N
        jPanel1.add(empleados);
        empleados.setBounds(408, 14, 92, 0);

        pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/2019-11-05 19_35_30-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N
        jPanel1.add(pedidos);
        pedidos.setBounds(549, 14, 0, 0);

        facturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/2019-11-05 19_35_36-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N
        facturacion.setToolTipText("");
        jPanel1.add(facturacion);
        facturacion.setBounds(688, 14, 0, 74);

        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/imagenes/2019-11-05 19_35_42-Empleados - CityPizza_Cristian_Badarau - [E__CLASE_ENTORNOS_CityPizza_Cristian_B.png"))); // NOI18N
        jPanel1.add(clientes);
        clientes.setBounds(849, 12, 0, 0);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1337, 983);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionLabelMouseClicked
        
        frame.show();
        this.dispose();
        
    }//GEN-LAST:event_cerrarSesionLabelMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrarSesionLabel;
    private javax.swing.JLabel clientes;
    private javax.swing.JLabel empleados;
    private javax.swing.JLabel facturacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel pedidos;
    private javax.swing.JLabel perfilLabel;
    // End of variables declaration//GEN-END:variables
}
