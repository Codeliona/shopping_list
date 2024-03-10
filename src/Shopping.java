import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                if (productCount < shoppingList.length) {
                    System.out.println("Какой товар добавляем? Например, молочный_шоколад.");
                    String productName = scanner.next();  //добавить товар
                    shoppingList[productCount] = productName;
                    productCount++;
                    System.out.println("Товар " + productName + " добавлен в список под номером " + (productCount));
                } else {
                    System.out.println("Список полон. Стоит отложить покупку до следующего раза");
                }
            } else if (actionNumber == 2) {
                System.out.println("Ваш список: ");
                for (int i = 0; i < productCount; i++) {
                    System.out.println((i + 1) + ". " + shoppingList[i]);
                }
                } else if (actionNumber == 3) {
                for (productCount = 0; productCount < shoppingList.length; productCount++) {
                    shoppingList[productCount] = null;
                }
                productCount = 0;
                System.out.println("Список очищен.");
            } else if (actionNumber == 4) {
                System.out.println("Работа завершена.");
                break;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}