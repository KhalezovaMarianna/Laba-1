package bsu.rfe.java.group1.lab1.Khalezova.var9A;
public class Main {
    public static void main(String[] args) throws Exception {
        int CheeseType = 0, AppleType = 0, EggsType = 0;
        Cheese CompC = new Cheese(); // Создаем экземпляры класса, чтобы найти кол-во продуктов по типам
        Eggs CompL = new Eggs(null);
        Apple CompA = new Apple(null);

        Food[] breakfast = new Food[20];

        int itemsSoFar = 0;

        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Eggs")) {
                breakfast[itemsSoFar] = new Eggs(parts[1]);
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            itemsSoFar++;
        }

        System.out.println("Давайте посчитаем количество продуктов разного типа.");
        for (int i =0; i<20;i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(CompC)) {
                    CheeseType++;
                } else
                if (breakfast[i].equals(CompL)) {
                    EggsType++;
                } else
                if (breakfast[i].equals(CompA)) {
                    AppleType++;
                }
            } else
                break;
        }
        System.out.println("Ваш завтрак состоит из "+AppleType+" яблок, "+EggsType+" яиц и "+CheeseType+ " сыров.");

        for (Food item: breakfast) {
            if (item != null) {
                item.consume();
            } else
                break;
        }
        System.out.println("Всего хорошего!");
    }
}