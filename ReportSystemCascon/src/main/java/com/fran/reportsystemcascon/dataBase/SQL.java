/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fran.reportsystemcascon.dataBase;

/**
 *
 * @author Francisco
 */
public class SQL {
    
    
    
    
   /*
    
    use report_system_cascon
    
    CREATE DATABASE Report_System_Cascon
    
    
CREATE TABLE `Inpector`
(
 `id`    int NOT NULL AUTO_INCREMENT,
 `name`  varchar(45) NOT NULL ,
 `phone` varchar(45) NOT NULL ,
 `email` varchar(45) NOT NULL ,

PRIMARY KEY (`id`)
);
    
    
    

CREATE TABLE `Worker`
(
 `id`            int NOT NULL AUTO_INCREMENT,
 `name`          varchar(45) NOT NULL ,
 `phone`         varchar(45) NOT NULL ,
 `fecha_ingreso` datetime NOT NULL ,

PRIMARY KEY (`id`)
);
    
    
    
CREATE TABLE `Consortium`
(
 `id`           int NOT NULL AUTO_INCREMENT ,
 `name`         varchar(200) NOT NULL ,
 `worker_id`    int NOT NULL ,
 `inspector_id` int NOT NULL ,

PRIMARY KEY (`id`),
FOREIGN KEY (`inspector_id`) REFERENCES `Inpector` (`id`),
FOREIGN KEY (`worker_id`) REFERENCES `Worker` (`id`)
);
*/




}
