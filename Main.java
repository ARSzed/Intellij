class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке dev");

        String[] names = {"Анна", "Борис", "Виктор", "Галина"};

        System.out.println("Приветствия:");
        for (String name : names) {
            greet(name);
        }
    }

    static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }
}
