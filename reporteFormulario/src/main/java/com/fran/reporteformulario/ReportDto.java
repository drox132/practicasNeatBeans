/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fran.reporteformulario;

/**
 *
 * @author Francisco
 */
public class ReportDto {
    private String inspector;
    private String emailInspector;
    private String celInspector;
    private String consorcio;
    private String trabajador;
    private String celTrabajador;

   
    

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getEmailInspector() {
        return emailInspector;
    }

    public void setEmailInspector(String emailInspector) {
        this.emailInspector = emailInspector;
    }

    public String getCelInspector() {
        return celInspector;
    }

    public void setCelInspector(String celInspector) {
        this.celInspector = celInspector;
    }

    public String getConsorcio() {
        return consorcio;
    }

    public void setConsorcio(String consorcio) {
        this.consorcio = consorcio;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public String getCelTrabajador() {
        return celTrabajador;
    }

    public void setCelTrabajador(String celTrabajador) {
        this.celTrabajador = celTrabajador;
    }

    @Override
    public String toString() {
        return  "Inspector:    "+ inspector + ", " 
                + "Email:    "+emailInspector + ", " 
                + "Celular:    "+celInspector + ", " 
                + "Consorcio:    "+consorcio + ", " 
                + "Trabajador:    "+trabajador + ", " 
                + "Celular:    "+celTrabajador ;
    }

    
    
    
}
