public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "Bob";
        this.address = "192 Main Street";
        this.phoneNumber = "613-123-4567";
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Homer", "123 Somewhere Lane", "012-345-6789");
        System.out.println("Hello " + buddy.getName()); // this comment is a change
    }
}
