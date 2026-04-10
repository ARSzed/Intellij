class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        System.out.println("Перед слиянием веток dev и main");

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Числа в массиве:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("  numbers[" + i + "] = " + numbers[i]);
        }

        System.out.print("Это добавлено в ветке dev");

        String[] names = {"Анна", "Борис", "Виктор", "Галина"};

        System.out.println("Приветствия:");
        for (String name : names) {
            greet(name);
        }

        int count = names.length;
        System.out.println("Всего приветствий: " + count);
    }

    static void greet(String name) {
        System.out.println("Привет, " + name + "!");

    }
}
