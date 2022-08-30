/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;
import Capa_Vista.Vista_Reserva;

import javax.swing.JOptionPane;


/**
 *
 * @author tomas
 */
public class Validar_Rut {
    
    public boolean ValidarRut(int rut)
    {
        try {
            if (rut == 9){
            Vista_Reserva v = new Vista_Reserva();
            v.setVisible(true);
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"El rut ingresado es invalido", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
        
        return false;
    }
    
}
