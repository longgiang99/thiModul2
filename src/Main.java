//package main;

//import controlle.Manager;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc =new Scanner(System.in);
        String choice;
        while (true){
            out.println("""
                    moi nhap lua chon:
                    1: Xem  danh sách sinh viên.
                    2: Thêm mới.
                    3: Cập nhật.
                    4: Xóa.
                    5: Sắp xếp.
                    6: Đọc từ file.
                    7: Ghi vào file.
                    8: Thoát.
                    """);
            choice = sc.nextLine();
            boolean check = true;
            switch (choice){
                case "1"->
                        manager.display();
                case "2"->  manager.addStudent();
                case "3"-> manager.upDate();
                case "4"-> manager.remove();
                case "5"->{
                    out.println("""
                            Nhập lựa chọn:
                            1: Sắp xếp điểm trung bình tăng dần.
                            1: Sắp xếp điểm trung bình giảm dần.
                            3: Thoát.
                            """);
                    while (check){
                        choice = sc.nextLine();
                        switch (choice){
                            case"1":
                                manager.arrangeUp();break;
                            case"2":
                                manager.arrangeDown();break;
                            case "3":
                                check = false;
                        }
                    }
                }
                case "6" -> manager.writerToFile();
                case "7" -> manager.readToFile();

            }


        }
    }
}
