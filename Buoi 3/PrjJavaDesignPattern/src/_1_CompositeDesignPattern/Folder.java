package _1_CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void display() {
        System.out.println("Folder: " + name);
        for (FileComponent c : children) {
            c.display();
        }
    }
}