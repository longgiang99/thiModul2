//package controlle;

//import model.Student;
//import storage.ReadToFile;
//import WriterToFile;

import java.util.*;

public class Manager {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentsList = new ArrayList<>();
    WriterToFile fn = new WriterToFile();
//    public Manager(){
//        studentsList = ReadToFile.readFile("test.csv");
//    }
    public void writerToFile(){
        fn.writeToSaveFile(studentsList);
    }
    public void readToFile(){
        ReadToFile.readFile("test.csv");
    }

    public void display() {
        System.out.println(studentsList);
    }

    public void addStudent() {
        try {
            System.out.println("Nhập mã sinh viên: ");
            String codeStudent = scanner.nextLine();
            System.out.println("Nhập tên sinh viên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi sinh viên: ");
            byte age = Byte.parseByte(scanner.nextLine());
            System.out.println("Nhập giới tính: ");
            String sex = scanner.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String adrress = scanner.nextLine();
            System.out.println("Nhập điểm trung bình: ");
            double mediumScore = Double.parseDouble(scanner.nextLine());
            Student student = new Student();
            student.setCodeStudent(codeStudent);
            student.setName(name);
            student.setAge(age);
            student.setSex(sex);
            student.setAdrress(adrress);
            student.setMediumScore(mediumScore);
            studentsList.add(student);
        } catch (NumberFormatException e){}
    }
    public void upDate() {

        System.out.println("Hãy nhập mã sinh viên cần cập nhật: ");
        String codeStudent = scanner.nextLine();
        boolean isExited = false;
        try {
            for (Student student : studentsList) {
                if (student.getCodeStudent().equals(codeStudent)) {
                    isExited = true;
                    System.out.println("Nhập mã sinh viên: ");
                    String code = scanner.nextLine();
                    System.out.println("Nhập tên sinh viên: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập tuổi sinh viên: ");
                    byte age = Byte.parseByte(scanner.nextLine());
                    System.out.println("Nhập giới tính: ");
                    String sex = scanner.nextLine();
                    System.out.println("Nhập địa chỉ: ");
                    String adrress = scanner.nextLine();
                    System.out.println("Nhập điểm trung bình: ");
                    double mediumScore = Double.parseDouble(scanner.nextLine());
                    student.setCodeStudent(code);
                    student.setName(name);
                    student.setAge(age);
                    student.setSex(sex);
                    student.setAdrress(adrress);
                    student.setMediumScore(mediumScore);
                    studentsList.add(student);
                    System.out.println("Đã cập nhật thông tin.");
                }
            }

            if (!isExited) {
                System.out.println("Không có mã nhân viên này.");
            }
        }catch (ConcurrentModificationException e){}
        catch (NumberFormatException e){}
    }

    public void remove() {
        System.out.println("Nhập mã sinh viên muốn xóa: ");
        String code = scanner.nextLine();
        for (Student student : studentsList) {
            if (student.getCodeStudent().equals(code)) {
                System.out.println("""
                        Xác nhận xóa:
                        Y: Xóa.
                        N: Thoát.
                        """);
                String check = scanner.nextLine();
                switch (check){
                    case "Y" : studentsList.remove(student);
                    break;
                    default: System.exit(0);
                }
            } else {
                System.out.println(" Không có nhân viên này.");
            }
        }
    }

    public void arrangeUp() {
        studentsList.sort(Comparator.comparing(Student::getMediumScore));
        display();
    }
    public void arrangeDown(){
        studentsList.sort(Comparator.comparing(Student:: getMediumScore).reversed());
        display();
    }

}
