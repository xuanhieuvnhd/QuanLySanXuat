import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true) {
            System.out.println("---------Can bo quan ly--------");
            System.out.println("1. Them nhan vien moi");
            System.out.println("2. Tim kiem nhan theo ten");
            System.out.println("3. Hien thi thong tin nhan vien");
            System.out.println("4. Thoat chuong trinh");
            System.out.println("-----------------------------------");
            System.out.print("------> Chon chuc nang: ");
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> {
                    System.out.println("a. Them ki su");
                    System.out.println("b. Them cong nhan");
                    System.out.println("c. Them nhan vien");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a" -> {
                            System.out.print("Nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int age = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhap chi nhanh: ");
                            String branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            managerOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());

                        }
                        case "b" -> {
                            System.out.print("Nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhap tuoi:");
                            int age = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhap bac nghe: ");
                            int level = scanner.nextInt();
                            Officer worker = new Worker(name, age, gender, address, level);
                            managerOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                            scanner.nextLine();
                        }
                        case "c" -> {
                            System.out.print("Nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int age = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhap nhiem vu: ");
                            String task = scanner.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            managerOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                        }
                        default -> System.err.println("Khong hop le!");
                    }
                }
                case "2" -> {
                    System.out.print("Nhap ten nhan vien can tim: ");
                    String name = scanner.nextLine();
                    managerOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                }
                case "3" -> {
                    managerOfficer.showListInforOfficer();
                }
                case "4" -> {
                    return;
                }
                default -> {
                    System.err.println("Khong hop le");
                }
            }
        }
    }
}
