package com.minterm.rentacar.Model;

import javax.persistence.Entity;



@Entity
public class Locations {
    int Id;
    String city;
    String address;
    String region;
    String country;

    public int getId(){
        return this.Id;
    }
    public Locations(int Id, String city, String address, String region, String country){
        this.Id = Id;
        this.city = city;
        this.address = address;
        this.region = region;
        this.country = country;
    }
    public String getCity(){
        return this.city;
    }
    public String getAddress(){
        return this.address;
    }
    public String getRegion(){
        return this.region;
    }
    public String getCountry(){
        return this.country;
    }
    public void setId(int newId){
        this.Id = newId;
    }
    public void setCity(String newCity){
        this.city = newCity;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    public void setRegion(String newRegion){
        this.region = newRegion;
    }
    public void setCountry(String newCountry){
        this.country = newCountry;
    }
}