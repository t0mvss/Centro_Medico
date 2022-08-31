/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Controlador;

import Capa_Conexion.Conexion;
import Capa_Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tomas
 */
public class ControladorRegistroClient {
    
    public class ControladorRegistro {
    
    Connection con;
    Paciente p = new Paciente();
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarPaciente(Paciente p) {
        String sql = "Insert into paciente values(?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, 0);
            ps.setInt(2, p.getRut());
            ps.setInt(3, p.getDv());
            ps.setString(4, p.getNombre());
            ps.setString(5, p.getApellido());
            ps.execute();
            
        } catch (Exception e) {
        }
        return false;
    }
    
}
    
}
