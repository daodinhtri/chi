import java.util.ArrayList;
import java.util.Scanner;

public class GymManagement {
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Schedule> schedules = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Thêm thành viên mới
    public void addMember() {
        System.out.println("Nhap ten thanh vien:");
        String name = scanner.nextLine();
        System.out.println("Nhap so đien thoai:");
        String phone = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap loai the thanh vien (Standard/VIP):");
        String membershipType = scanner.nextLine();
        Member member = new Member(name, phone, email, membershipType);
        members.add(member);
        System.out.println("Thanh vien moi đa đuoc them.");
    }

    // Hiển thị danh sách thành viên
    public void showMembers() {
        if (members.isEmpty()) {
            System.out.println("Chua co thanh vien nao.");
        } else {
            System.out.println("Danh sach thanh vien:");
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }

    // Đặt lịch tập cho thành viên
    public void scheduleTraining() {
        System.out.println("Nhap ten thanh vien de dat lich:");
        String memberName = scanner.nextLine();
        Member foundMember = null;
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(memberName)) {
                foundMember = member;
                break;
            }
        }

        if (foundMember == null) {
            System.out.println("Khong tim thay thanh vien.");
            return;
        }

        System.out.println("Nhap ngay tap dd/MM/yyyy):");
        String date = scanner.nextLine();
        System.out.println("Nhap gio tap (hh:mm):");
        String time = scanner.nextLine();
        Schedule schedule = new Schedule(date, time, foundMember);
        schedules.add(schedule);
        System.out.println("Lich tap da duoc dat.");
    }

    // Hiển thị lịch tập
    public void showSchedules() {
        if (schedules.isEmpty()) {
            System.out.println("Chua co lich tap nao.");
        } else {
            System.out.println("Danh sach lich tap:");
            for (Schedule schedule : schedules) {
                System.out.println(schedule);
            }
        }
    }
}
