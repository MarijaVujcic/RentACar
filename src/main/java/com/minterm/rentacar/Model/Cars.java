package com.minterm.rentacar.Model;

public class Cars {
    int Id;
    String brand;
    String model;
    int num_of_sitts;
    float price;
    String description;
    Bool automatic;
    int num_of_doors;
    Bool reserved;
}
public int getId(){
    return Id;
}
public String getBrand(){
    return brand;
}
public String getModel(){
    return model;
}
public int getNum_of_sitts(){
    return num_of_sitts;
}
public float getPrice(){
    return price;
}
public String getDescription(){
    return description;
}
public Bool getAutomatic(){
    return automatic;
}
public int getNum_of_doors(){
    return num_of_doors;
}
public Bool getReserved(){
    return reserved;
}
public void setId(int newId){((
    this.Id = newId;
}
public void setBrand(String newBrand){
    this.brand = newBrand;
}
public void setModel(String newModel){
    this.model = newModel;
}
public void setNum_of_sitts(int newNum_of_sitts){
    this.num_of_sitts = newNum_of_sitts;
}
public void setPrice(float newPrice){
    this.price = newPrice;
}
public void setDescription(String newDescription){
    this.description = newDescription;
}
public void setAutomatic(Bool newAutomatic){
    this.model = newAutomatic;
}
public void setNum_of_doors(int newNum_of_doors){
    this.num_of_doors = newNum_of_doors;
}
public void setReserved(Bool newReserved){
    this.reserved = newReserved;
}