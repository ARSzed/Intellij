class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        System.out.println("Перед слиянием веток dev и main");

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Числа в массиве:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("  numbers[" + i + "] = " + numbers[i]);
        }
    }
}
