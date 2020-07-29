package core.oop_hw;

public class WorkPlace {
    public static void main(String[] args) {
        Man igor = new Man(40, "Игорь",true);
        Man petr = new Man(18, "Петр");
        Cup coffee = new Cup("Coffeeshop Company","черный");
        Cup tea = new Cup("Чай-не-Чай","зеленый","пиала");
        Telephone iphone = new Telephone("Apple",6,true);
        Telephone nokia = new Telephone("Nokia 3310",1.4);
        Notebook diary = new Notebook(300,"А6");
        Table bar = new Table("Красный", 0);
        Table office = new Table("Серый", 7);
        Chair chair = new Chair("Мягкий");
        Pen ballHandle = new Pen(14.6,"синий");
    }
}
