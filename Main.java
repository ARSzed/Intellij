class Main {
    public static void main(String[] args) {
        String message = getMessage();
        System.out.print("Это добавлено в ветке main");
        System.out.println(" - " + message);
    }

    static String getMessage() {
        return "Привет от Git!";
    }
}
