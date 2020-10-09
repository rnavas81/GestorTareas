/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import Modelo.Usuario;


/**
 *
 * @author rodrigo
 */
public class Consultas {

      ///////////////////////////////
     //         USUARIOS          //
    ///////////////////////////////
    private static final String[] CAMPOS_AUXILIAR = {"id", "nombre","descipcion"};
    private static final String[] CAMPOS_USUARIO = {"dni","username","tipo","nombre","apellidos","email","avatar"};
    private static final String[] CAMPOS_TAREAS = {"id", "descripcion","usuario","horasPrev","horasEmpl","nivelDiff","finalizado"};
    private static final String[] CAMPOS_TAREAS_HISTORICO = {"idTarea","usuario","fechaInicio","fechaFin","horasEmpl"};

    private static String getCampos(String[] campos, String pref) {
        String response = "";
        if(!pref.isBlank()){
            boolean primero = true;
            for (String campo : campos) {
                if (!primero) {
                    response += ",";
                }
                response += pref + "." + campo;
                primero = false;
            }            
        } else {
            response = String.join(",", campos);
        }
        return response;
    }
    /**
     * Recupera los datos de todos los usuarios
     * @return 
     */
    public static String getUsuarios() {
        return "SELECT " + getCampos(CAMPOS_USUARIO, "p") + " "
            + "FROM `" + Constantes.T_USUARIOS + "` p "
            + "WHERE p.habilitado = 1 ORDER BY p.apellidos,p.nombre";
    }
    /**
     * Recupera los datos de un usuario
     * @param dni
     * @return 
     */
    public static String getUsuario(String dni) {
        return "SELECT " + getCampos(CAMPOS_USUARIO, "p") + " "
            + "FROM `" + Constantes.T_USUARIOS + "` p "
            + "WHERE dni = '" + dni + "' AND p.habilitado = 1";
    }
    /**
     * Comprueba un usuario por dni && password
     * @param dni
     * @param password
     * @return 
     */
    public static String testUsuario(String dni, String password) {
        return "SELECT " + getCampos(CAMPOS_USUARIO, "p") + " "
            + "FROM `" + Constantes.T_USUARIOS + "` p "
            + "WHERE p.dni = '" + dni + "' AND p.assword='" + password + "' AND p.habilitado = 1";
    }
    /**
     * Crea una nueva entrada de usuario
     * @param usuario
     * @return 
     */
    public static String insertUsuario(Usuario usuario) {
        String campos = "`dni`,`username`,`password`,`tipo`,`nombre`,`apellidos`,`email`,`avatar`";
        String valores = "'" + usuario.getDni()+ "','" + usuario.getUsername()+ "','" + usuario.getPassword() + "','" + usuario.getTipo()+ "','" + usuario.getNombre()+ "','" + usuario.getApellidos()+ "','" + usuario.getEmail() + "'"+ "','" + usuario.getAvatar()+ "'";

        String consulta = "INSERT INTO " + Constantes.T_USUARIOS + " (" + campos + ") VALUES (" + valores + ");";

        return consulta;
    }
    /**
     * Actualiza los datos de un usuario
     * @param usuario
     * @return 
     */
    public static String updateUsuario(Usuario usuario) {
        String consulta = "UPDATE " + Constantes.T_USUARIOS + " SET "
            + "`username` = '" + usuario.getUsername()+ "'"
            + ",`tipo` = '" + usuario.getTipo()+ "'"
            + ",`nombre` = '" + usuario.getNombre()+ "'"
            + ",`apellidos` = '" + usuario.getApellidos()+ "'"
            + ",`email` = '" + usuario.getEmail()+ "'"
            + ",`avatar` = '" + usuario.getAvatar()+ "'";
        if (!usuario.getPassword().isBlank()) {
            consulta += ",`password` = '" + usuario.getPassword() + "'";
        }
        consulta += " WHERE dni='" + usuario.getDni() + "'";
        return consulta;
    }
    /**
     * Actualiza un solo campo del usuario
     * @param dni
     * @param Campo
     * @param Valor
     * @return 
     */
    public static String updateUsuarioField(String dni, String Campo, String Valor) {
        return "UPDATE " + Constantes.T_USUARIOS + " SET `" + Campo + "` = '" + Valor + "' WHERE dni = '" + dni + "'";
    }
    /**
     * Elimina el usuario de la base de datos
     * @param dni
     * @return 
     */
    public static String deleteUsuario(String dni) {
        return "DELETE FROM " + Constantes.T_USUARIOS + " WHERE dni='" + dni + "'";
    }
    
    
      ///////////////////////////////
     //         AUXILIAR          //
    ///////////////////////////////
    
    public static String getAuxiliar(int tipo){
        return "SELECT "+String.join(",",CAMPOS_AUXILIAR)+" FROM "+Constantes.T_AUXILIAR+" WHERE habilitado=1";
    }

}
