/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Modelo.TextPrompt;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Vista_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Inicial
     */
    public Vista_Inicial() {
        initComponents();
        TextPrompt textP = new TextPrompt("sin puntos, con guión", txt_Rut);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btn_Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_Rut = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("BIENVENIDO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 170, 40));

        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Rut");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txt_Rut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_RutKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder/fondo-villagran.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        String rut1 = txt_Rut.getText();
        if (rut1.length() > 0) {
            if(rut1.length() < 8) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un rut de 9 digitos\n para continuar", "Aviso", JOptionPane.WARNING_MESSAGE);
            txt_Rut.setText(null);
            txt_Rut.requestFocus();
        } 
            // Creamos un arreglo con el rut y el digito verificador
            String[] rut_dv = rut1.split("-");
            // Las partes del rut (numero y dv) deben tener una longitud positiva
            if (rut_dv.length == 2) {
                // Capturamos error (al convertir un string a entero)
                try {
                    int rut = Integer.parseInt(rut_dv[0]);
                    char dv = rut_dv[1].charAt(0);
                    ;
                    // Validamos que sea un rut valido según la norma
                    if (Capa_Modelo.ValidarRut.ValidarRut(rut, dv)) {
                        JOptionPane.showMessageDialog(rootPane, "Rut correcto");
                        Vista_Reserva vr = new Vista_Reserva();
                        vr.setVisible(true);
                        this.dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(rootPane, "Rut incorrecto");
                    }
                } catch (Exception ex) {
                    System.out.println(" Error " + ex.getMessage());
                }

            }
        }
        else if (rut1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar su rut para continuar", "Aviso", JOptionPane.WARNING_MESSAGE);
            txt_Rut.requestFocus();
        } 
        
        
    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void txt_RutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RutKeyTyped

//        char c = evt.getKeyChar();
//        if(c < '0' || c > '9' || c < ' ')evt.consume();
        if (txt_Rut.getText().length() >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_txt_RutKeyTyped

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
            java.util.logging.Logger.getLogger(Vista_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_Rut;
    // End of variables declaration//GEN-END:variables
}
