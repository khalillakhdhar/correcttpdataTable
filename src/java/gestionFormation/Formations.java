/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionFormation;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */


@ManagedBean
@RequestScoped
public class Formations {
    List<Formation> listFormations=new ArrayList<Formation>();

    public Formations() {
           Formation f1=new Formation("java", "java basique", 2000, 5);
        Formation f2=new Formation("java JSF", "java JSF", 2000, 5);
        Formation f3=new Formation("java hibernate", "java hibernate", 2000, 5);
        listFormations.add(f1);
        listFormations.add(f2);
        listFormations.add(f3);
    }

    public List<Formation> getListFormations() {
     
        return listFormations;
    }

    public void setListFormations(List<Formation> listFormations) {
        this.listFormations = listFormations;
    }
    
    
    
    
}
