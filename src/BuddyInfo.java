public class BuddyInfo {

    private String name, address, phoneNo;

    public String getName(){
        return name;
    }

    public BuddyInfo(String name, String address, String phoneNo){
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public BuddyInfo(){
        address = "123 Carleton Pl";
        name = "Ash";
        phoneNo = "6474582022";
    }

    public static void main(String[] args) {
        BuddyInfo myBuddies = new BuddyInfo("Ash", "Toronto", "613");
        System.out.println("Hello, " + myBuddies.getName());
    }
}