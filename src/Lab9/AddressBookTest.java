package Lab9;

import java.util.Scanner;

public class AddressBookTest {
    AddressBookTest() {
        int input;
        String Name = "", Address = "", Phone = "", Email = "";
        AddressBook addressbook = new AddressBook();
        boolean isDone = false;
        Scanner inScan = new Scanner(System.in);

        do {
            try {
                String[] menus = {"-----------------------", "Add Entry", "Delete Entry", "View All Entries", "Update An Entry"};
                System.out.println(String.format("Main Menu \n%s\n1. %s\n2. %s\n3. %s\n4. %s\n5. Exit", menus));
                input = Integer.parseInt(inScan.nextLine());

                if(input !=1 && addressbook.getDataCount() == 0) {
                    System.out.print("Option is not Available when database is empty.\nPlease try again.\n");
                    continue;
                }

                switch(input) {
                    case 1:
                        System.out.print("Name: ");
                        Name = inScan.next();
                        addressbook.setName(Name);

                        System.out.print("Address: ");
                        Address = inScan.next();
                        addressbook.setAddress(Address);

                        System.out.print("Phone: ");
                        Phone = inScan.next();
                        addressbook.setPhone(Phone);

                        System.out.print("Email: ");
                        Email = inScan.next();
                        addressbook.setEmail(Email);

                        System.out.println((addressbook.saveEntry())? "Entry Added\n" : "Something's wrong, please try again.\n");
                        break;
                    case 2:
                        int entryno;
                        System.out.println("Delete Entry no.");
                        entryno = inScan.nextInt();
                        System.out.println((addressbook.deleteEntry(entryno))? "Entry Deleted\n" : "Something's wrong, please try again.\n");
                        break;
                    case 3:
                        addressbook.viewEntry();
                        break;
                    case 4:
                        boolean isUpdateDone = false;
                        int UpdateEntryNumber, DatatoEdit;

                        System.out.println("Entry number to Update");
                        UpdateEntryNumber = inScan.nextInt();

                        addressbook.getData(UpdateEntryNumber);

                        Name = addressbook.getName();
                        Address = addressbook.getAddress();
                        Phone = addressbook.getPhone();
                        Email = addressbook.getEmail();
                        Object[] getAddressData = { Name, Address, Phone, Email};
                        do {
                            System.out.println(String.format("INFORMATION: \n1) Name: %s\n2) Address: %s\n3) Phone: %s\n4) Email: %s\n5) Save Data\n6) Exit", getAddressData));
                            DatatoEdit = inScan.nextInt();
                            switch(DatatoEdit) {
                                case 1:
                                    System.out.print("Name: ");
                                    Name = inScan.next();
                                    addressbook.setName(Name);
                                    break;
                                case 2:
                                    System.out.print("Address: ");
                                    Address = inScan.next();
                                    addressbook.setAddress(Address);
                                    break;
                                case 3:
                                    System.out.print("Phone: ");
                                    Phone = inScan.next();
                                    addressbook.setPhone(Phone);
                                    break;
                                case 4:
                                    System.out.print("Email: ");
                                    Email = inScan.next();
                                    addressbook.setEmail(Email);
                                    break;
                                case 5:
                                    System.out.println((addressbook.updateEntry(UpdateEntryNumber))? "Entry Updated\n" : "Something's wrong, please try again.\n");
                                    isUpdateDone = true;
                                    break;
                                case 6:
                                    isUpdateDone = true;
                                    break;
                            }
                        } while(!isUpdateDone);
                        break;
                    case 5:
                        isDone = true;
                        break;
                }
            } catch(Exception e) { System.out.println("ERROR! " + e.getMessage() + "\nInput correct number again.\n");}

        } while(!isDone);
    }
}