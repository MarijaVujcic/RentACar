package com.minterm.rentacar;

@Entity
public class Locations{
    int Id;
    String city;
    String address;
    String region;
    String country;
}
public int getId(){
    return Id;
}
public String getCity(){
    return city;
}
public String getAddress(){
    return address;
}
public String getRegion(){
    return region;
}
public String getCountry(){
    return country;
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