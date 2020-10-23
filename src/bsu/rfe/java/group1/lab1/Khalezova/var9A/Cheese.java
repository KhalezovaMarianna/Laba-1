package bsu.rfe.java.group1.lab1.Khalezova.var9A;
public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " съеден");
    }
// Переопределять метод equals() в данном классе не нужно, т.к. он
// не добавляет новых полей данных, а сравнение по внутреннему полю name
// уже реализовано в базовом классе
// Переопределять метод toString() в данном классе не нужно, т.к. он
// не добавляет внутренних полей данных, а возврат поля name уже
// реализован в версии toString() базового класса
}
