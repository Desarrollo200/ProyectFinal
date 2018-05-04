/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ctlLogin;
import javax.swing.JOptionPane;
import modelo.Login;

/**
 *
 * @author XgioserX
 */
public class FrmInicio extends javax.swing.JFrame {

    
    ctlLogin ctlLog;
    /**
     * Creates new form FrmInicio
     */
    public FrmInicio() {
        initComponents();
        ctlLog = new ctlLogin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsuario = new javax.swing.JTextField();
        tfClave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bIniciar = new javax.swing.JButton();
        bCrearUsuario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N

        tfClave.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel1.setText("Secretaria de Movilidad ");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        bIniciar.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        bIniciar.setText("Iniciar Session");
        bIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarActionPerformed(evt);
            }
        });

        bCrearUsuario.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        bCrearUsuario.setText("Crear Usuario");
        bCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearUsuarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel4.setText("Departamental");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bIniciar)
                        .addGap(68, 68, 68)
                        .addComponent(bCrearUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(tfClave)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIniciar)
                    .addComponent(bCrearUsuario))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarActionPerformed
         try {
            String nickname = tfUsuario.getText();
            String clave = tfClave.getText();

            Login ciudadano = ctlLog.SolicitudIniciarSesionCiudadano(nickname, clave);
            Login cda = ctlLog.SolicitudIniciarSesionCDA(nickname, clave);
            Login admin = ctlLog.SolicitudIniciarSesionAdmin(nickname, clave);
            Login aseguradora = ctlLog.SolicitudIniciarSesionAseguradora(nickname, clave);
            Login concensionario = ctlLog.SolicitudIniciarSesionConsencionario(nickname, clave);

            if (ciudadano != null) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + ciudadano.getUsuario() + "!");
                String user = ciudadano.getUsuario();
                new FrmCiudadano(user).setVisible(true);
                this.dispose();
            }
            else if (concensionario != null) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + concensionario.getUsuario()+ "!");
                new FrmConsecionario(concensionario).setVisible(true);
                this.dispose();
            } 
            else if (admin != null) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + admin.getUsuario()+ "!");
                new FrmAdmin(admin).setVisible(true);
                this.dispose();
            } 
            else if (cda != null) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + cda.getUsuario()+ "!");
                new FrmCDA().setVisible(true);
                this.dispose();
            } 
            else if (aseguradora != null) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + aseguradora.getUsuario()+ "!");
                new FrmAseguradora().setVisible(true);
                this.dispose();
            } 
            else {
                JOptionPane.showMessageDialog(this, "NickName o clave incorrecta");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un fallo");
        }

    }//GEN-LAST:event_bIniciarActionPerformed

    private void bCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearUsuarioActionPerformed
        new FrmRegistroCiudadanos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bCrearUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCrearUsuario;
    private javax.swing.JButton bIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField tfClave;
    public static javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
