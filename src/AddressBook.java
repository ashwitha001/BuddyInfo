import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }
//Add Buddy to Addressbook
    public void addBuddy(BuddyInfo buddy){
        if(buddy != null) {
            myBuddies.add(buddy);
        }
    }
    //Remove buddy from addressbook
    public BuddyInfo removeBuddy(int buddy){
        if(buddy >= 0 && buddy < myBuddies.size()){
            return myBuddies.remove(buddy);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("Address Book");


    }
}
