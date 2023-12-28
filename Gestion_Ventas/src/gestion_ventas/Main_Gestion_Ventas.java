/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_ventas;

import AccesoADatos.Conexion;
import Vistas.MiTiendaGUI;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;

/**
 *
 * @author Ed Le Franc
 */
public class Main_Gestion_Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FlatCarbonIJTheme.setup();
        MiTiendaGUI appInit = new MiTiendaGUI();
        appInit.setVisible(true); 
        
        Conexion conex = new Conexion();
        conex.Conexion_Maria();
    }
    
    
               
  
    
}
