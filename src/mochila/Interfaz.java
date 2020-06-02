package mochila;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    int [] peso;
    int [] valor; 
    int[][] v;
    int var=0;
    int conta=1;

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PesoMochila = new javax.swing.JTextField();
        CantObjetos = new javax.swing.JTextField();
        Generar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Peso = new javax.swing.JTextField();
        Valor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RegistrarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosTabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        GenerarTablas = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Peso de la mochila:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setForeground(new java.awt.Color(255, 51, 51));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad de objetos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 30));

        PesoMochila.setBackground(new java.awt.Color(0, 0, 0));
        PesoMochila.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(PesoMochila, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 40, 30));

        CantObjetos.setBackground(new java.awt.Color(0, 0, 0));
        CantObjetos.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(CantObjetos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 40, 30));

        Generar.setBackground(new java.awt.Color(0, 0, 0));
        Generar.setForeground(new java.awt.Color(255, 51, 51));
        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        getContentPane().add(Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrar Productos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 30));

        Peso.setBackground(new java.awt.Color(0, 0, 0));
        Peso.setForeground(new java.awt.Color(255, 51, 51));
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        getContentPane().add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 40, 30));

        Valor.setBackground(new java.awt.Color(0, 0, 0));
        Valor.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 40, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Peso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 30));

        RegistrarProducto.setBackground(new java.awt.Color(0, 0, 0));
        RegistrarProducto.setForeground(new java.awt.Color(255, 51, 51));
        RegistrarProducto.setText("Registrar");
        RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, 30));

        DatosTabla.setBackground(new java.awt.Color(0, 0, 0));
        DatosTabla.setForeground(new java.awt.Color(255, 51, 51));
        DatosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(DatosTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 580, 120));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 580, 130));

        GenerarTablas.setBackground(new java.awt.Color(0, 0, 0));
        GenerarTablas.setForeground(new java.awt.Color(255, 51, 51));
        GenerarTablas.setText("Generar Tablas");
        GenerarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarTablasActionPerformed(evt);
            }
        });
        getContentPane().add(GenerarTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cool-red-wallpaper-27650-28369-hd-wallpapers.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 389));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoActionPerformed

    private void RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarProductoActionPerformed
        int n = 0;
        try{
            n = Integer.parseInt(CantObjetos.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Dijite un numero");
        }
        
        if (conta<=n){
            conta=conta+1;
            var=var+1;
            try{
                for (int i=var;i<=n;i++){                                     
                    peso[i]=Integer.parseInt(Peso.getText());
                    valor[i]=Integer.parseInt(Valor.getText());
                }  
                Peso.setText(null);
                Valor.setText(null);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"Dijite un numero");
        }            
        }else{
            RegistrarProducto.setEnabled(false);
        }   
    }//GEN-LAST:event_RegistrarProductoActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        int n=0;
        try{
            n = Integer.parseInt(CantObjetos.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"dijite un numero");
        }
        
        int w=0;
        try{
            w = Integer.parseInt(PesoMochila.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"dijite un numero");
        }
        peso = new int[n+1];
        valor = new int[n+1];
        peso[0]= 0;
        valor[0]= 0;
       
        Generar.setEnabled(false);
        PesoMochila.setEnabled(false);
        CantObjetos.setEnabled(false);
    }//GEN-LAST:event_GenerarActionPerformed

    private void GenerarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarTablasActionPerformed
        // TODO add your handling code here:
        int n=0,m=0;
        try{
            n = Integer.parseInt(CantObjetos.getText());
            m = Integer.parseInt(PesoMochila.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane,"dijite un numero");
        }
        Mochila moc = new Mochila();
        int matri [][]=moc.Mochila(n, m, peso, valor);
        String WE[][] = moc.atri();
        this.MostrarMatriz(matri, n, m);
        this.MostrarMtriz(WE, n, m);

    }//GEN-LAST:event_GenerarTablasActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    public void MostrarMatriz(int  matriz[][], int n,int m){
       
       DefaultTableModel model = (DefaultTableModel) DatosTabla.getModel(); 
       model.setRowCount(n+1);
       model.setColumnCount(m+1);
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                DatosTabla.setValueAt(matriz[i][j],i, j);
            }
        }
    }
    public void MostrarMtriz(String  matriz[][], int n,int m){
       
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
       model.setRowCount(n+1);
       model.setColumnCount(m+1);
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                jTable1.setValueAt(matriz[i][j],i, j);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantObjetos;
    private javax.swing.JTable DatosTabla;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Generar;
    private javax.swing.JButton GenerarTablas;
    private javax.swing.JTextField Peso;
    private javax.swing.JTextField PesoMochila;
    private javax.swing.JButton RegistrarProducto;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
