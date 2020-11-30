package com.minterm.rentacar.Model;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Reservations{
    int CarID;
    int UserID;
    Date StartDateTime;
    Date EndDateTime;
    String PickUpLocation;
    String LeavingLocation;
    int TotalPrice;
    String TypesOfPayments;
    Date LastDayOfCancellation;
    String ReservationChanges;
    String Insurance;


    public int getCarID(){
        return this.CarID;
    }

    public int getUserID(){
        return this.UserID;
    }

    public Reservations(int CarID, int UserID, Date StartDateTime, Date EndDateTime, String PickUpLocation, String LeavingLocation,
    int TotalPrice, String TypesOfPayments, Date LastDayOfCancellation, String ReservationChanges, String Insurance){
        this.CarID = CarID;
        this.UserID = UserID;
        this.StartDateTime = StartDateTime;
        this.EndDateTime = EndDateTime;
        this.PickUpLocation = PickUpLocation;
        this.LeavingLocation = LeavingLocation;
        this.TotalPrice =TotalPrice;
        this.TypesOfPayments = TypesOfPayments;
        this.LastDayOfCancellation = LastDayOfCancellation;
        this.ReservationChanges = ReservationChanges;
        this.Insurance = Insurance;
    }

    public void setCarID(int newCarID){
        this.CarID = newCarID;
    }

    public void setUserID(int newUserID){
        this.UserID = newUserID;
    }

    public String getPickUpLocation(){
        return this.PickUpLocation;
    }

    public void setPickUpLocation(String newPickUpLocation){
        this.PickUpLocation = newPickUpLocation;
    }

    public String getLeavingLocation(){
        return this.LeavingLocation;
    }

    public void setLeavingLocation(String newLivingLocation){
        this.LeavingLocation = newLivingLocation;
    }

    public int getTotalPrice(){
        return this.TotalPrice;
    }

    public void setTotalPrice(int newTotalPrice){
        this.TotalPrice = newTotalPrice;
    }

    public String getTypesOfPayments(){
        return this.TypesOfPayments;
    }

    public void setTypesOfPayments(String newTypesOfPayments){
        this.TypesOfPayments = newTypesOfPayments;
    }

    public String getReservationChanges(){
        return this.ReservationChanges;
    }

    public void setReservationChanges(String newReservationChanges){
        this.ReservationChanges = newReservationChanges;
    }

    public String getInsurance(){
        return this.Insurance;
    }

    public void setInsurance(String newInsurance){
        this.Insurance = newInsurance;
    }
}