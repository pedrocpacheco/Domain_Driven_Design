package br.com.objectArray.tests;

import br.com.objectArray.model.ContactManager;

public class TestContactManager {
  public static void main(String[] args) {
    ContactManager contactManager = new ContactManager(5);

    System.out.println("Start");
    contactManager.addContact();
    contactManager.printContact();

    System.out.println("Medium");
    contactManager.deleteContact(1);
    contactManager.printContact();

    System.out.println("Finish");
    contactManager.updateContact(2);
    contactManager.printContact();

  }
}
