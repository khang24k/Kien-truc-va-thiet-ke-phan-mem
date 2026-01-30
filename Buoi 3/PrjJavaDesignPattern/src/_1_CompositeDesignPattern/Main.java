package _1_CompositeDesignPattern;

public class Main {
	public static void main(final String[] args) {
        File f1 = new File("a.txt");
        File f2 = new File("b.txt");

        Folder root = new Folder("Root");
        Folder sub = new Folder("Sub");

        sub.add(f2);
        root.add(f1);
        root.add(sub);

        root.display();
    }
}
//Composite Pattern cho phép xử lý tập tin và thư mục theo cùng một cách, giúp biểu diễn cấu trúc cây linh hoạt và dễ mở rộng.