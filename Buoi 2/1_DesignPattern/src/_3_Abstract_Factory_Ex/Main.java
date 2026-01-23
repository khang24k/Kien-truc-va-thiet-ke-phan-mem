package _3_Abstract_Factory_Ex;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new WindowsFactory();
        Application app = new Application(factory);
        app.render();
    }
}
//Ứng dụng hỗ trợ 2 giao diện người dùng:
//Windows
//Mac
//
//Mỗi giao diện có:
//Button
//Checkbox
//
//Ý tưởng Abstract Factory:
//Mỗi hệ điều hành = một factory
//Factory tạo ra nhóm object liên quan

