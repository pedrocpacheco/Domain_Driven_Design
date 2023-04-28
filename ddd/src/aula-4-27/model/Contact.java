package br.com.objectArray.model;

public class Contact {
  
  private String name;
  private int number;

  public Contact(String name, int phone){
    this.name = name;
    this.number = phone;
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }
  public void setName(String name) {
    this.name = name;
  }

  public void setNumber(int phone) {
    this.number = phone;
  }

  @Override
  public String toString() {
    return "(Name: " + getName() + " | Phone: " + getNumber() + ")";  
  }

}
