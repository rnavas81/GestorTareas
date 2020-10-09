/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author rodrigo
 */
public class Usuario {
    ///CAMPOS
    private String dni = null;
    private String username = null;
    private int tipo = -1;
    private String nombre = null;
    private String apellidos = null;
    private String email = null;
    private String avatar = null;
    private String password = null;
    
    ///CONSTRUCTOR

    public Usuario(String dni, String username, int tipo, String nombre, String apellidos, String email, String avatar, String password) {
        this.dni = dni;
        this.username = username;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.avatar = avatar;
        this.password = password;
    }
    
    ///GETTER && SETTER

    public String getDni() {
        return dni;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    ///FUNCIONES AUXILIARES
    public void actualizarBD(){
        ConexionEstatica.actualizarUsuario(this);
    }
    public void agregarBD(){
        ConexionEstatica.agregarUsuario(this);
    }
    
}
