package bsu.rfe.java.group1.lab1.Khalezova.var9A;
public class Eggs extends Food {
    // Новое внутреннее поле данных КОЛИЧЕСТВО
    private String number;
    public Eggs(String number) {
// Вызвать конструктор предка, передав ему имя класса
        super("Eggs");
// Инициализировать количество яиц
        this.number = number;
    }
    // Переопределить способ употребления яиц
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Селектор для доступа к полю данных КОЛИЧЕСТВО
    public String getNumber() {
        return number;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.number = number;
    }
    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение количеств (Шаг 3)

    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его количество
    public String toString() {
        return super.toString() + " количество '" + number.toUpperCase() + "'";
    }
}