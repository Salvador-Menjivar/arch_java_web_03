package model;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String nombre;
    private String email;
    private int edad;

    //Constructor vacío
    public Usuario() {
    }

    //Constructor con todos sus atributos
    public Usuario(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    //Métodos Set y Get
    public String getNombre() {
        return nombre;
    }  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    } 
}
