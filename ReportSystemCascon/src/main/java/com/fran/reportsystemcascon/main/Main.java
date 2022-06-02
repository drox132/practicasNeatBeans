package com.fran.reportsystemcascon.main;

import com.fran.reportsystemcascon.forms.FormConsortium;
import com.fran.reportsystemcascon.forms.FormInspector;
import com.fran.reportsystemcascon.forms.FormWorker;



/**
 *
 * @author Francisco
 */
public class Main {
    public static void main(String[] args){
    FormConsortium formConsortium = new FormConsortium();
    //formConsortium.show();
    
    FormInspector formInspector = new FormInspector();
    formInspector.show();
    
    FormWorker formWorker = new FormWorker ();
    formWorker.show();
    }
    
}
