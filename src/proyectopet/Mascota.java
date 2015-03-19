/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopet;

import Conexion.ConectaBD;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.imgscalr.Scalr;

/**
 *
 * @author cmejuto
 */
public class Mascota extends javax.swing.JFrame {

    String user;
    Connection c;
    Usuario usuario;
    FileInputStream fis;
    int longitudBytes;
    File foto;
    //SeleccionaArchivo sa;

    /**
     * Creates new form Mascota
     */
    public Mascota(String user, Usuario usuario) throws SQLException {
        this.user = user;
        this.usuario = usuario;

        c = new ConectaBD().getConn();
        initComponents();
        setLocationRelativeTo(null); //para cntrar la ventana
        //sa = new SeleccionaArchivo();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tnombre = new javax.swing.JTextField();
        tespecie = new javax.swing.JTextField();
        traza = new javax.swing.JTextField();
        tchip = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jicono = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setTitle("Mascota");
        setPreferredSize(new java.awt.Dimension(470, 260));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de tu mascota"));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 0, 30);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel3.setText("Especie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 0, 30);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Raza");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 0, 30);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Código chip");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 0, 30);
        jPanel1.add(jLabel5, gridBagConstraints);

        tnombre.setMinimumSize(new java.awt.Dimension(200, 20));
        tnombre.setPreferredSize(new java.awt.Dimension(200, 20));
        tnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnombreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(tnombre, gridBagConstraints);

        tespecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tespecieActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(tespecie, gridBagConstraints);

        traza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(traza, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(tchip, gridBagConstraints);

        jButton1.setText("Selecciona fotografía");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jPanel2, gridBagConstraints);

        jicono.setIcon(new javax.swing.ImageIcon("C:\\Users\\cmejuto\\Documents\\WorkSpace\\Programacion\\ProyectoPet\\imagenes\\icono.jpg")); // NOI18N
        jicono.setMaximumSize(new java.awt.Dimension(90, 90));
        jicono.setMinimumSize(new java.awt.Dimension(90, 90));
        jicono.setPreferredSize(new java.awt.Dimension(90, 90));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jicono, gridBagConstraints);

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // botón que selecciona una fotografía de nuestro equipo
        //http://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html
        JFileChooser fc = new JFileChooser(); //creamos objeto JFileChooser
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);// le decimos que sólo puede seleccionar ficheros, no directorios
        int estado = fc.showOpenDialog(this);
        //si el botón seleccionado es el de aceptar
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(fc.getSelectedFile()); //foto en flujo
                longitudBytes = (int) fc.getSelectedFile().length();// tamaño de la foto
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Mascota.class.getName()).log(Level.SEVERE, null, ex);
            }
            foto = fc.getSelectedFile(); //guardo la foto en un objeto tipo File
            
            //escalamos la foto
            //para escalar tenemos que importar la siguiente librería http://www.thebuzzmedia.com/software/imgscalr-java-image-scaling-library/#download
            File smallfoto = new File(foto.getPath());
            try {
                BufferedImage bfoto = ImageIO.read(foto);
                BufferedImage bsmallfoto = Scalr.resize(bfoto, 80);
                ImageIO.write(bsmallfoto, "png", smallfoto);
            } catch (IOException ex) {
                Logger.getLogger(Mascota.class.getName()).log(Level.SEVERE, null, ex);
            }
            //mostramos la foto
            ImageIcon icono = new ImageIcon(smallfoto.getPath());
            jicono.setIcon(icono);
                       
        } else {
            System.out.println("operación cancelada por el usuario");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnombreActionPerformed

    private void tespecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tespecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tespecieActionPerformed

    private void trazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trazaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
// guardamos los campos en la bd
        String nombre = tnombre.getText();
        String especie = tespecie.getText();
        String raza = traza.getText();
        String chip = tchip.getText();

        System.out.println("nombre: " + nombre + " especie: " + especie + " raza: " + raza + " chip: " + chip + " usuario: " + user);

        // comprobamos si los campos obligatorios están cubiertos 
        if (nombre.equals("") || especie.equals("")){
            JOptionPane.showMessageDialog(null, "Complete los campos obligatorios", "", JOptionPane.WARNING_MESSAGE);
        } else {
        try {
            Statement stm = c.createStatement();
            PreparedStatement ps = c.prepareStatement("insert into mascota (mnombre, chip, especie, raza, usuario, foto) values (?,?,?,?,?,?)");

            ps.setString(1, nombre);
            ps.setString(2, chip);
            ps.setString(3, especie);
            ps.setString(4, raza);
            ps.setString(5, user);
            ps.setBinaryStream(6, fis, longitudBytes); // posición, flujo, tamaño
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Mascota.class.getName()).log(Level.SEVERE, null, ex);
        }
        //limpiamos los campos
        tnombre.setText("");
        tespecie.setText("");
        traza.setText("");
        tchip.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        //ocultamos la pantalla y activamos la anterior
        usuario.setVisible(true);
        usuario.mm.refrescarTabla();
    }//GEN-LAST:event_formComponentHidden

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                //              new Mascota().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jicono;
    private javax.swing.JTextField tchip;
    private javax.swing.JTextField tespecie;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField traza;
    // End of variables declaration//GEN-END:variables



}
