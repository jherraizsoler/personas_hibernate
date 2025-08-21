/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author herra
 */
@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer idPersona;
    
    private String nombre;
    
    private String apellido;
    
    private String email;
    
    private String telefono;
    
    private double saldo;

    public Persona() {
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }

    
    
    
    
    
    
}
