public class Member {
    private String name;
    private String phone;
    private String email;
    private String membershipType;

    public Member(String name, String phone, String email, String membershipType) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.membershipType = membershipType;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ten: " + name + ", So dien thoai: " + phone + ", Email: " + email + ", Loai the: " + membershipType;
    }
}
