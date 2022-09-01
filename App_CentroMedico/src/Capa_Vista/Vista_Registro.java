/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;
import Capa_Controlador.ControladorRegistroClient;
import Capa_Modelo.Paciente;
import Capa_Modelo.TextPrompt;
import javax.swing.JOptionPane;

/**
 *
 * @author tomas
 */
public class Vista_Registro extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Registro
     */
    public Vista_Registro() {
        initComponents();
        TextPrompt txtP = new TextPrompt("sin puntos", txtRut);
        TextPrompt txtPe = new TextPrompt("Ej: Jhon", txtNombre);
        TextPrompt txtPr = new TextPrompt("Ej: Doe", txtApellido);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtDV = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Rut");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        txtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutKeyTyped(evt);
            }
        });
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, -1));

        txtDV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDVKeyTyped(evt);
            }
        });
        getContentPane().add(txtDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 20, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 130, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 130, -1));

        jLabel5.setText("-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folder/fondo-villagran.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' && c > '9')evt.consume();
        if (txtRut.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRutKeyTyped

    private void txtDVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDVKeyTyped
        char c = evt.getKeyChar();
        if(c > 'K' && c > '0')evt.consume();
        if (txtDV.getText().length() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDVKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))evt.consume();
        if (txtNombre.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))evt.consume();
        if (txtNombre.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        
        String rut1 = txtRut.getText();
        String dv1 = txtDV.getText();
        String nom1 = txtNombre.getText();
        String ape1 = txtApellido.getText();
        
        if ((rut1.equals("")) || dv1.equals("") || nom1.equals("") || ape1.equals("")){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos","Precaución", JOptionPane.WARNING_MESSAGE);
            txtNombre.requestFocus();
        }
        else{
            ControladorRegistroClient crc = new ControladorRegistroClient();
            int rut = Integer.parseInt(txtRut.getText());
            int dv = Integer.parseInt(txtDV.getText());
            String nom = txtNombre.getText();
            String ape = txtApellido.getText();
            Paciente p = new Paciente(0,rut,dv,nom,ape);
            try {
                if (crc.RegistrarPaciente(p) == true){
                    crc.RegistrarPaciente(p);
                    JOptionPane.showMessageDialog(this,"¡Registro Exitoso!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
                    Vista_Inicial vi = new Vista_Inicial();
                    vi.setVisible(true);
                    this.dispose();   
                }
                else if (crc.RegistrarPaciente(p) == false){
                    JOptionPane.showMessageDialog(null,"Rut duplicado, por favor ingrese uno nuevo", "Aviso", JOptionPane.WARNING_MESSAGE);
                    txtRut.requestFocus();
                    txtRut.setText("");
                    txtDV.setText("");
                    txtNombre.setText("");
                    txtApellido.setText("");
                }
            } catch (Exception e) {
            }
        }
        
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDV;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
