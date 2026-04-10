class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке dev");

        String[] names = {"Анна", "Борис", "Виктор", "Галина"};

        System.out.println("\nСписок пользователей:");
        for (String name : names) {
            System.out.println("* " + name);
        }
    }
}
