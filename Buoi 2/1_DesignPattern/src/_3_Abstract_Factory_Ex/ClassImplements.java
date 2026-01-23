package _3_Abstract_Factory_Ex;

class WindowsButton implements Button {
    public void render() {
        System.out.println("Render Windows Button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Render Windows Checkbox");
    }
}

// Mac
class MacButton implements Button {
    public void render() {
        System.out.println("Render Mac Button");
    }
}

class MacCheckbox implements Checkbox {
    public void render() {
        System.out.println("Render Mac Checkbox");
    }
}