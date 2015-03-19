/*
 */
package proyectopet;

import Conexion.ConectaBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cmejuto
 */
public class Principal extends javax.swing.JFrame {

    Connection c;
    AdminUsuarios au;
    private static final String ADMIN = "admin";
    int ncolum; 
    /**
     * Creates new form Pantallas
     */
    public Principal() throws SQLException {
        // inicializamos objetos
        c = new ConectaBD().getConn();
        initComponents();
        setLocationRelativeTo(null); //para cntrar la ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bAccede = new javax.swing.JButton();
        bRegistrate = new javax.swing.JButton();
        textUser = new javax.swing.JTextField();
        textPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetFinder");
        setBounds(new java.awt.Rectangle(250, 50, 600, 400));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        jPanel7.setMinimumSize(new java.awt.Dimension(168, 138));
        jPanel7.setName(""); // NOI18N
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(130, 138));
        jPanel7.setVerifyInputWhenFocusTarget(false);
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel4.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jPanel7.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 20);
        jPanel7.add(jLabel5, gridBagConstraints);

        bAccede.setText("Accede");
        bAccede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAccedeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.insets = new java.awt.Insets(21, 0, 23, 0);
        jPanel7.add(bAccede, gridBagConstraints);

        bRegistrate.setText("Regístrate");
        bRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(21, 54, 23, 120);
        jPanel7.add(bRegistrate, gridBagConstraints);

        textUser.setPreferredSize(new java.awt.Dimension(200, 20));
        textUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanel7.add(textUser, gridBagConstraints);

        textPass.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel7.add(textPass, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrateActionPerformed

        try {
            //abre la ventana de registro
            Registro registro = new Registro(this);
            registro.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bRegistrateActionPerformed
    // botón de acceder
    private void bAccedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAccedeActionPerformed

        //si el usuario es el administrador "admin"
        if (textUser.getText().equals(ADMIN) && textPass.getText().equals(ADMIN)){
                //abrimos la tabla adminUsuarios
                au = new AdminUsuarios();
                au.setVisible(true);
            
        } else {
        //comprobamos que el usuario existe y que la contraseña es correcta
        String user = textUser.getText();
        try {

            Statement s = c.createStatement();
            s.executeQuery("select pass from usuario where usu = '" + textUser.getText() + "'");
            ResultSet rs = s.getResultSet();
            
            rs.next();

            if (textPass.getText().equals(rs.getString(1))) {

                System.out.println("LOG: usuario existe");
                Usuario usuario = new Usuario(user, this);
                usuario.setVisible(true);
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "Introduzca de nuevo su usuario y contraseña", "Usuario o contraseña inválido", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

    }//GEN-LAST:event_bAccedeActionPerformed
    

    private void textUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAccede;
    private javax.swing.JButton bRegistrate;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField textPass;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
