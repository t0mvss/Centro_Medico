/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Modelo;

/**
 *
 * @author tomas
 */
public class Paciente {
    
    int Rut;
    char dv;
    String nombre;
    String apellido;

    public Paciente() {
    }

    public Paciente(int Rut, char dv, String nombre, String apellido) {
        this.Rut = Rut;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public char getDv() {
        return dv;
    }

    public void setDv(char dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
