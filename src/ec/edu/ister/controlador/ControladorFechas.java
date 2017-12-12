/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hp
 */
public class ControladorFechas {
    public  static synchronized int diferenciaFachas( Date fechaInicial,Date fechaFinal){
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
       String fechaInicioString = df.format(fechaInicial);
       
        try {
            fechaInicial= df.parse(fechaInicioString);
        } catch (Exception e) {
            
        }
            String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal= df.parse(fechaFinalString);
            
        } catch (ParseException e) {
            
        }
        long msInicial = fechaInicial.getTime();
        long msFinal= fechaFinal.getTime();
        long diferencia= msFinal-msInicial;
        double dias = Math.floor(diferencia/(1000*60*60*24));
       
        
        return (int)dias;
        
    
    
}
}