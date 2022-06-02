/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fran.lambdajava;

import java.time.LocalDate;


public class Person {
    
    private String name;
    private LocalDate fechaNacimiento;
    boolean isProgramer;

    public Person() {
    }

    public Person(String name, LocalDate fechaNacimiento, boolean isProgramer) {
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
        this.isProgramer = isProgramer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isIsProgramer() {
        return isProgramer;
    }

    public void setIsProgramer(boolean isProgramer) {
        this.isProgramer = isProgramer;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", fechaNacimiento=" + fechaNacimiento + ", isProgramer=" + isProgramer + '}';
    }

    
    
}
