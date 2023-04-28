package br.com.objectArray.model;

import java.util.Scanner;

public class ContactManager {
  
  private Contact contacts[];

  public ContactManager(int t){
    this.contacts = new Contact[t];
  }

  public Contact createContact(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Print the Contact's name");
    String name = sc.nextLine();
    
    System.out.println("Print the Contact's number");
    int phone = sc.nextInt();

    Contact contact = new Contact(name, phone);
    return contact;
  }

  public void addContact(){
    for(int i = 0; i < contacts.length; i++){
      contacts[i] = createContact();
    }
  }

  public void printContact(){
    for (Contact contact : contacts) {
      System.out.println(contact.toString());
      System.out.println("");
    }
  }

  public void deleteContact(int number){
    Contact[] newContacts = new Contact[contacts.length - 1];
    for(int i = 0, j = 0; i < contacts.length; i++){
      if(contacts[i].getNumber() != number){
        newContacts[j++] = contacts[i];
      }
    }
    this.contacts = newContacts;
  }

  public void updateContact(int number){
    for (Contact contact : contacts) {
      if(contact.getNumber() == number){
        System.out.println("Type the new Contact Name");
        Scanner sc = new Scanner(System.in);
        contact.setName(sc.nextLine());
        sc.close();
      }   
    }
  }

}
