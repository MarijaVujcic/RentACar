package com.minterm.rentacar.Model;

import javax.persistence.Entity;

@Entity
public class Payments {
    int ID;
    String TypesOfPayments;

    
    public int getID(){
        return this.ID;
    }

    public Payments(int ID, String TypesOfPayments){
        this.ID = ID;
        this.TypesOfPayments = TypesOfPayments;
    }

    public void setID(int newID){
        this.ID = newID;
    }
    
    public String TypesOfPayments(){
        return this.TypesOfPayments;
    }

    public void setTypesOfPayments(String newTypesOfPayments){
        this.TypesOfPayments = newTypesOfPayments;
    }
}