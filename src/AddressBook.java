import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    private void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    private BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }

    private ArrayList<BuddyInfo> getBuddies() {
        return buddies;
    }

    private String newMethod() {
        return "words";
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy); // BREAKPOINT HERE
        addressBook.removeBuddy(0); // this comment is a change
        // this comment is a change on github
    }
}
