/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

/**
 *
 * @author fernando
 */
public class Constantes {
    // CLAVES DE SESION
    public static final String S_USUARIOS = "usuarios";
    public static final String S_TAREAS = "tareas";
    
    //BASE DE DATOS
    public static final String DB_NAME="Tareas";
    public static final String DB_USER="rodrigo";
    public static final String DB_PASS="Chubaca2020";
    //public static final String ficheroBitacora="bitacora.txt";
    //MAIL
    public static final String EMAIL_ADDRESS = "auxiliardaw2@gmail.com";
    public static final String EMAIL_PASSWORD = "Chubaca20";
    public static final String EMAIL_HOST = "smtp.gmail.com";
    public static final int    EMAIL_PORT = 587;
    public static final String EMAIL_AUTH = "true";
    
    //TABLAS
    public static final String T_USUARIOS = "Usuarios";
    public static final String T_AUXILIAR = "Auxiliar";
    public static final String T_TAREAS = "Tareas";
    public static final String T_TAREAS_HISTORICO = "Tareas_Historico";
    
    //DIRECTORIOS
    public static final String ROOT = "/Usuarios";
    public static final String ROOT_FILES= "/home/rodrigo/particionLinux/DWEBS/GestorTareas/GestorTareas/web";
    public static final String RECURSOS_DIR = ROOT+"/Recursos";
    public static final String CSS_DIR = ROOT + "/CSS";
    public static final String VISTAS_DIR = ROOT + "/Vista";
    public static final String CONTROLADOR_DIR = ROOT + "/Controlador";
    
    //VISTAS
    public static final String V_INDEX = ROOT + "/index.jsp";
    public static final String V_ERROR = VISTAS_DIR + "/error.jsp";
    /*
    public static final String V_BIENVENIDO = VISTAS_DIR + "/bienvenido.jsp";
    public static final String V_BIENVENIDO_ADMIN = VISTAS_DIR + "/bienvenidoAdmin.jsp";
    public static final String V_REGISTRAR = VISTAS_DIR + "/registrar.jsp";
    public static final String V_LISTAR = VISTAS_DIR + "/listar.jsp";
    public static final String V_EDITAR = VISTAS_DIR + "/editar.jsp";
    public static final String V_RECUPERAR = VISTAS_DIR + "/recuperar.jsp";
    public static final String V_BUSCAMINAS = VISTAS_DIR + "/buscaminas.jsp";
    public static final String V_BUSCAMINAS_JUEGO = VISTAS_DIR + "/buscaminasJuego.jsp";
    public static final String V_EDITAR_PERFIL = VISTAS_DIR + "/editarPerfil.jsp";
    */
    //CONTROLADORES
    /*
    public static final String C_CONTROLADOR = CONTROLADOR_DIR + "/controlador.jsp";
    public static final String C_CONTROLADOR_ADMIN = CONTROLADOR_DIR + "/controladorAdmin.jsp";
    public static final String C_CONTROLADOR_PERFIL = CONTROLADOR_DIR + "/controladorPerfil.jsp";
    */
    //CSS
    /*
    public static final String CSS_GLOBAL = CSS_DIR+ "/style.css";
    public static final String CSS_FORMULARIO = CSS_DIR+ "/formulario.css";
    public static final String CSS_LISTAR = CSS_DIR+ "/listar.css";
    */
    //IMAGENES
    /*
    public static final String IMG_USER_DEFAULT = RECURSOS_DIR + "/default.png";
    public static final String HOST_AVATAR = ROOT + "/Avatar";
    public static final String DIR_AVATAR = ROOT_FILES + "/Avatar";
    */
    
}
