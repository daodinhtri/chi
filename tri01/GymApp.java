import java.util.Scanner;

public class GymApp {
    public static void main(String[] args) {
        GymManagement gymManagement = new GymManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Quan ly phong tap ---");
            System.out.println("1. Them thanh vien");
            System.out.println("2. Hien thi thanh vien");
            System.out.println("3. Dat lich tap");
            System.out.println("4. Hien thi lich tap");
            System.out.println("5. Thoat");
            System.out.print("Chon mot tuy chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự newline

            switch (choice) {
                case 1:
                    gymManagement.addMember();
                    break;
                case 2:
                    gymManagement.showMembers();
                    break;
                case 3:
                    gymManagement.scheduleTraining();
                    break;
                case 4:
                    gymManagement.showSchedules();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
