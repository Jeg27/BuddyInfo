import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook(ArrayList<BuddyInfo> buddies) {
        this.buddies = new ArrayList<>();
    }

    private void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
