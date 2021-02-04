package Lab9;
import java.util.ArrayList;

public class AddressBook {
    private String Name, Address, Phone, Email;
    private ArrayList<Object[]> data;

    public AddressBook() {
        data = new ArrayList<Object[]>();
    }

    public void setName(String data) {
        Name = data;
    }

    public String getName() {
        return Name;
    }

    public void setAddress(String data) {
        Address = data;
    }

    public String getAddress() {
        return Address;
    }

    public void setPhone(String data) {
        Phone = data;
    }

    public String getPhone() {
        return Phone;
    }

    public void setEmail(String data) {
        Email = data;
    }

    public String getEmail() {
        return Email;
    }

    public boolean saveEntry() {
        Object[] AddressData = { Name, Address, Phone, Email};
        if (data.size() >= 100) {
            System.out.println("Cannot Add our is full");
        }
        data.add(AddressData);
        return true;
    }

    public void viewEntry() {
        for(int x = 0; data.size() - 1 >= x; x++) {
            System.out.println(String.format("%s) Name: %s | Address: %s | Mobile no.: %s | Email: %s", (x + 1), data.get(x)[0], data.get(x)[1], data.get(x)[2], data.get(x)[3]));
        }
    }

    public void getData(int entryNumber) {
        Name = (String) data.get(entryNumber - 1)[0];
        Address = (String) data.get(entryNumber - 1)[1];
        Phone = (String) data.get(entryNumber - 1)[2];
        Email = (String) data.get(entryNumber - 1)[3];
    }

    public boolean updateEntry(int dataIndex) {
        Object[] saveAddressData = { Name, Address, Phone, Email};
        data.set(dataIndex - 1, saveAddressData);
        return true;
    }

    public boolean deleteEntry(int entryNumber) {
        data.remove(entryNumber - 1 );
        return true;
    }

    public int getDataCount() {
        return data.size();
    }
}
