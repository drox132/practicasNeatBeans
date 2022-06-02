/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fran.ejerciciosjavaswitch;

import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class javaSwitch {
    
    public static void main (String [] args){
    
        //VARIABLES GLOBALES
        
        double saldoInicial=10000;
        double saldoActual=saldoInicial;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre completo");
            String name=entrada.nextLine();
            
            
        while(name.isEmpty()|| name.isBlank() || javaSwitch.isNumeric(name)){
            System.out.println("Por favor ingrese un nombre completo");
             name= entrada.nextLine();
        }
        
        System.out.println("======================================================================");
        System.out.println("======================================================================");
               
        System.out.println("BIENVENIDOS AL CAJERO AUTOMATICO SEC "
                + "\nSr. "+ name.toUpperCase()); 
         
        
        boolean reinicio=true;
        while(reinicio){
            
            
            double montoDeposito;
            double montoRetiro;
            String decisionContinuar;
        System.out.println("======================================================================");
        System.out.println("POR FAVOR SELECCIONES UNA DE LAS SIGUIENTES OPCIONES"
                + "\n 1.) INGRESAR DINERO"
                + "\n 2.) RETIRAR DINERO"
                + "\n 3.) SALIR");
        
                System.out.println("======================================================================");
                  
        int operacion= entrada.nextInt();
        while(operacion>3 || operacion <1 ){
            System.out.println("POR FAVOR SELECCIONES UNA OPCION CORRECTA");
            operacion= entrada.nextInt();
        }
        
        switch(operacion){
            case 1: 
                System.out.println("Sr. "+name+" BIENVENIDO AL MODULO DE DEPOSITOS");
                System.out.println("======================================================================");
                System.out.println("======================================================================");
                System.out.println("SU SALDO INICIAL ES DE: $" + saldoActual);
                
                System.out.println("INGRESE EL MONTO QUE DESEA DEPOSITAR");
                System.out.println("======================================================================");
                
                montoDeposito=entrada.nextDouble();
                
                System.out.println("EL MONTO QUE DESEA DEPOSITAR ES: $"+ montoDeposito);
                System.out.println("INDIQUE SI -> PARA CONTINUAR");
                System.out.println("INDIQUE NO -> PARA CANCELAR LA OPERACION");
                System.out.println("======================================================================");
                decisionContinuar=entrada.nextLine();
                decisionContinuar=entrada.nextLine();
                if (decisionContinuar.equalsIgnoreCase("si")) {
                     saldoActual=montoDeposito+saldoActual;
                    System.out.println("EL DEPOSITO FUE REALIZADO CORRECTAMENTE"
                            + "\n SU NUEVO SALDO DISPONIBLE ES: $"+saldoActual);
                    
                } else {
                    System.out.println("LA OPERACION FUE CANCELADA");
                    System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                    System.out.println("===================================================================");
                    System.out.println("===================================================================");
                }
                reinicio=true;
                break;
            case 2:
                System.out.println("Sr. "+name+" BIENVENIDO AL MODULO DE RETIROS");
                System.out.println("======================================================================");
                System.out.println("======================================================================");
                System.out.println("SU SALDO INICIAL ES DE: $" + saldoActual);
                System.out.println("======================================================================");
                
                System.out.println("INGRESE EL MONTO QUE DESEA RETIRAR ");
                
                montoRetiro=entrada.nextDouble();
                
                System.out.println("======================================================================");
                System.out.println("EL MONTO QUE DESEA RETIRAR ES: $"+ montoRetiro);
                System.out.println("INDIQUE SI -> PARA CONTINUAR");
                System.out.println("INDIQUE NO -> PARA CANCELAR LA OPERACION");
                
                System.out.println("======================================================================");
                decisionContinuar=entrada.nextLine();
                decisionContinuar=entrada.nextLine();
                if (decisionContinuar.equalsIgnoreCase("si")) {
                    if (montoRetiro>saldoActual) {
                        System.out.println("EL MONTO QUE DESEAS RETIRAR ES MAYOR AL DISPONIBLE");
                        reinicio=true;
                    }else{
                        saldoActual=saldoActual-montoRetiro;
                        System.out.println("EL RETIRO FUE REALIZADO CORRECTAMENTE"
                            + "\n SU NUEVO SALDO DISPONIBLE ES: $"+saldoActual);
                       
                    }
                } else {
                    System.out.println("LA OPERACION FUE CANCELADA");
                    System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS");
                    System.out.println("===================================================================");
                    System.out.println("===================================================================");
                }
                reinicio=true;
                break;
            case 3:
                System.out.println("GRACIAS POR USAS NUESTRO CAJERO SEC");
                System.out.println("QUE TENGA UN EXCELENTE DIA");
               
                    reinicio=false;
                    
        }
        
        }
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    //METODOS ESTATICOS PARA VERIFICACIONES ENCAPSULADAS
    
    private static boolean isNumeric(String name){
	try {
		Integer.parseInt(name);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
     /*private static boolean isString(Integer operacion){
	try {
		operacion.equals(String.valueOf(operacion));
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    */
}
