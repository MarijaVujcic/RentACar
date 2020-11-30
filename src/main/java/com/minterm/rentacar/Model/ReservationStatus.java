package com.minterm.rentacar.Model;

import javax.persistence.Entity;

@Entity
public class ReservationStatus {
    String cancel;
    String confirm;
    String change;
    String done;

    public String getCancel() {
        return this.cancel;
    }

    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    public String getConfirm() {
        return this.confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getChange() {
        return this.change;
    }

    public ReservationStatus(String cancel, String confirm, String change, String done) {
        this.cancel = cancel;
        this.confirm = confirm;
        this.change = change;
        this.done = done;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getDone() {
        return this.done;
    }

    public void setDone(String done) {
        this.done = done;
    }
    
}