/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Modelo.Requerimiento_1;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_3;
import static View.VistaRequerimientos.controlador;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public final class ProyectoConstruccionGui extends javax.swing.JFrame {

    /**
     * Creates new form ProyectoConstruccionGui
     */
//    private JLabel home;
    
    public ProyectoConstruccionGui() throws SQLException {
        initComponents();
        mostrar_tablaC_1();
        mostrar_tablaC_2();
        mostrar_tablaC_3();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setSize(1150, 800);
        jLfondo_home.setSize(900,800);
        
        setLocationRelativeTo(null);
//        Imag_Boton();
        
    }
    
    public void mostrar_tablaC_1() throws SQLException {
         
        ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();

        DefaultTableModel modelo = (DefaultTableModel) jTableConsulta_1.getModel();
        //recorre cada una de los registros obtenidos en la consulta retornaUsuario

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        int numcols = modelo.getColumnCount();
        for (Requerimiento_1 requerimiento : requerimiento1) {
            Object[] fila = new Object[numcols];
          
            fila[0] = requerimiento.getConstructora();
            fila[1] = requerimiento.getCiudad();
            fila[2] = requerimiento.getBanco();
            fila[3] = requerimiento.getPorcentaje();
            fila[4] = requerimiento.getClasificacion();
            fila[5] = requerimiento.getFecha();
          

            modelo.addRow(fila);
            //ExcelAdapter myAd = new ExcelAdapter(jTableAF);

        }
    }
    
    public void mostrar_tablaC_2() throws SQLException {
        
//        ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
        ArrayList<Requerimiento_2> results = controlador.consultarRequerimiento2();
        
        DefaultTableModel modelo2 = (DefaultTableModel) jTableConsulta_2.getModel();
        
        while (modelo2.getRowCount() > 0) {
            modelo2.removeRow(0);
        }
        int numColums2 = modelo2.getColumnCount();
        
        for(Requerimiento_2 show_Req2:results){
            
            Object[] fila_Con_2= new Object[numColums2];
            
            fila_Con_2[0] =show_Req2.getProveedor();
            fila_Con_2[1] =show_Req2.getConstructora();
            fila_Con_2[2] =show_Req2.getPagado();
            
            modelo2.addRow(fila_Con_2); 
            
        }
    }
    
    public void mostrar_tablaC_3() throws SQLException {
        
//        ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
        ArrayList<Requerimiento_3> results = controlador.consultarRequerimiento3();
        
        DefaultTableModel modelo3 = (DefaultTableModel) jTableConsulta_3.getModel();
        
        while (modelo3.getRowCount() > 0) {
            modelo3.removeRow(0);
        }
        int numColums3 = modelo3.getColumnCount();
        
        for(Requerimiento_3 show_Req3:results){
            
            Object[] fila_Con_3= new Object[numColums3];
            
            fila_Con_3[0] = show_Req3.getCargo();
            fila_Con_3[1] =show_Req3.getMaxSalario();
            
            
            modelo3.addRow(fila_Con_3); 
            
        }
    }
    
//    
//    }
//      Para implementar la accion de cerrado en un boton diferente al convencional
//    public void cerrar(){
//        
//        try {
//            
//            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//            addWindowListener(new WindowAdapter() {
//                public void windowsClosing(WindowEvent e){
//                    confirmarsalida();
//                }
//            });
//            this.setVisible(true);
//                
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
//    }
//    Confirmar salida  
    private void confirmarsalida(){
        
        String botones []= {"cerrar","cancelar"};
        int valor= JOptionPane.showConfirmDialog(this, "Esta seguro de cerrar la aplicacion","Advertencia",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(valor == JOptionPane.YES_OPTION){
            System.exit(0);
        }   
        
    }
    
//    public void Imag_Boton (){
//        
//            ImageIcon home = new ImageIcon("home.png");
////            jCasita.setIcon(new ImageIcon(home.getImage()));
//            JButton boton_home= new JButton();
//            boton_home.setBounds(75, 140, 100, 120);
//            boton_home.setIcon(new ImageIcon(home.getImage().getScaledInstance(boton_home.getWidth(),
//                    boton_home.getHeight(), Image.SCALE_SMOOTH)));
//            
//            jTableConsulta1.add(boton_home);
//            
//            
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLa_home = new javax.swing.JLabel();
        jPruebahome = new javax.swing.JPanel();
        jTableConsulta1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLfondo_home = new javax.swing.JLabel();
        jConsulta1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta_1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jConsulta2 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConsulta_2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jConsulta3 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableConsulta_3 = new javax.swing.JTable();
        jMenuOpciones = new javax.swing.JMenuBar();
        jMenu_exit = new javax.swing.JMenu();
        jMenu_opciones = new javax.swing.JMenu();
        jConsulta_1 = new javax.swing.JMenuItem();
        jConsulta_2 = new javax.swing.JMenuItem();
        jConsulta_3 = new javax.swing.JMenuItem();

        jLa_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Construccion");
        setBackground(new java.awt.Color(102, 255, 255));
        setBounds(new java.awt.Rectangle(500, 500, 300, 250));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(300, 250));
        setSize(new java.awt.Dimension(300, 250));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPruebahome.setLayout(new java.awt.BorderLayout());

        jTableConsulta1.setBackground(new java.awt.Color(255, 255, 255));
        jTableConsulta1.setForeground(new java.awt.Color(0, 0, 0));
        jTableConsulta1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTableConsulta1.setToolTipText("");
        jTableConsulta1.setPreferredSize(new java.awt.Dimension(795, 992));
        jTableConsulta1.setRequestFocusEnabled(false);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLfondo_home.setBackground(new java.awt.Color(255, 255, 255));
        jLfondo_home.setForeground(new java.awt.Color(255, 255, 255));
        jLfondo_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLfondo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iamgenes/Fondo_ini_home.png"))); // NOI18N
        jLfondo_home.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLfondo_home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLfondo_home.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel7.add(jLfondo_home, java.awt.BorderLayout.CENTER);

        jTableConsulta1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/iamgenes/pagina-de-inicio (5).png")), jPanel7); // NOI18N

        jConsulta1.setBackground(new java.awt.Color(255, 255, 255));
        jConsulta1.setForeground(new java.awt.Color(0, 153, 153));
        jConsulta1.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setDividerLocation(35);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta 1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 447, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 446, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jTableConsulta_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Constructora", "Ciudad", "Banco", "Porcentaje", "Clasificacion", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTableConsulta_1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jPanel2.add(jScrollPane4, java.awt.BorderLayout.LINE_END);

        jSplitPane1.setRightComponent(jPanel2);

        jConsulta1.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jTableConsulta1.addTab("Consulta 1", jConsulta1);

        jConsulta2.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setBackground(new java.awt.Color(0, 255, 255));
        jSplitPane2.setDividerLocation(36);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 153, 51));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consulta 2");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 447, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 446, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jSplitPane2.setTopComponent(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jTableConsulta_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Proveedor", "Constructora", "Pagado"
            }
        ));
        jScrollPane2.setViewportView(jTableConsulta_2);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);
        jPanel4.add(jScrollPane5, java.awt.BorderLayout.LINE_END);

        jSplitPane2.setRightComponent(jPanel4);

        jConsulta2.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jTableConsulta1.addTab("Consulta 2", jConsulta2);

        jConsulta3.setLayout(new java.awt.BorderLayout());

        jSplitPane3.setDividerLocation(35);
        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 153, 51));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Consulta 3");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 447, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 446, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        jPanel5.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jSplitPane3.setTopComponent(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jTableConsulta_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cargo", "MaxSalario"
            }
        ));
        jTableConsulta_3.setToolTipText("");
        jScrollPane3.setViewportView(jTableConsulta_3);

        jPanel6.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jSplitPane3.setRightComponent(jPanel6);

        jConsulta3.add(jSplitPane3, java.awt.BorderLayout.CENTER);

        jTableConsulta1.addTab("Consulta 3", jConsulta3);

        jPruebahome.add(jTableConsulta1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPruebahome, java.awt.BorderLayout.CENTER);

        jMenu_exit.setBackground(new java.awt.Color(204, 204, 204));
        jMenu_exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu_exit.setForeground(new java.awt.Color(0, 0, 0));
        jMenu_exit.setText("File");
        jMenu_exit.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jMenuOpciones.add(jMenu_exit);

        jMenu_opciones.setBackground(new java.awt.Color(204, 204, 204));
        jMenu_opciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu_opciones.setForeground(new java.awt.Color(0, 0, 0));
        jMenu_opciones.setText("Edit");
        jMenu_opciones.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N

        jConsulta_1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jConsulta_1.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jConsulta_1.setText("Consulta 1");
        jConsulta_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsulta_1ActionPerformed(evt);
            }
        });
        jMenu_opciones.add(jConsulta_1);

        jConsulta_2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jConsulta_2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jConsulta_2.setText("Consulta 2");
        jConsulta_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsulta_2ActionPerformed(evt);
            }
        });
        jMenu_opciones.add(jConsulta_2);

        jConsulta_3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jConsulta_3.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jConsulta_3.setText("Consulta 3");
        jConsulta_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsulta_3ActionPerformed(evt);
            }
        });
        jMenu_opciones.add(jConsulta_3);

        jMenuOpciones.add(jMenu_opciones);

        setJMenuBar(jMenuOpciones);

        getAccessibleContext().setAccessibleName("Proyecto_Construccion");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jConsulta_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsulta_2ActionPerformed
        
        jTableConsulta1.setSelectedIndex(2);
    }//GEN-LAST:event_jConsulta_2ActionPerformed

    private void jConsulta_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsulta_3ActionPerformed
        
        jTableConsulta1.setSelectedIndex(3);
    }//GEN-LAST:event_jConsulta_3ActionPerformed

    private void jConsulta_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsulta_1ActionPerformed
        
        jTableConsulta1.setSelectedIndex(1);
    }//GEN-LAST:event_jConsulta_1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        confirmarsalida();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProyectoConstruccionGui().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProyectoConstruccionGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jConsulta1;
    private javax.swing.JPanel jConsulta2;
    private javax.swing.JPanel jConsulta3;
    private javax.swing.JMenuItem jConsulta_1;
    private javax.swing.JMenuItem jConsulta_2;
    private javax.swing.JMenuItem jConsulta_3;
    private javax.swing.JLabel jLa_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLfondo_home;
    private javax.swing.JMenuBar jMenuOpciones;
    private javax.swing.JMenu jMenu_exit;
    private javax.swing.JMenu jMenu_opciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPruebahome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTabbedPane jTableConsulta1;
    private javax.swing.JTable jTableConsulta_1;
    private javax.swing.JTable jTableConsulta_2;
    private javax.swing.JTable jTableConsulta_3;
    // End of variables declaration//GEN-END:variables
}
