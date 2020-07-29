package core.oop_hw;

public class CawField {
    public static void main(String[] args) {
        Caw murka = new Caw("Абердин-Ангус", "Черная");
        Caw murka1 = new Caw("Хайленд", "Белая");
        Caw murka2 = new Caw("Абердин-Ангус", "Белая");
        Caw murka3 = new Caw("Декстер", "Белая");
        Caw murka4 = new Caw("Декстер", "Черная");


        System.out.println("murka.getNameBreed() = " + murka.getNameBreed());
        murka.setNameBreed("Брангус");
        System.out.println("murka.getNameBreed() = " + murka.getNameBreed());
        System.out.println("murka3.getNameBreed() = " + murka3.getNameBreed());
        murka3.setNameBreed("Абердин-Ангус");
        System.out.println("murka3.getNameBreed() = " + murka3.getNameBreed());
    }
}
