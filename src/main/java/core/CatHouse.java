package core;

public class CatHouse {

    public static void main(String[] args) {
        Cat cat = new Cat();

        Lion leo = new Lion();
        leo.sayMeow();


        Cat bagira = new Panther();
        bagira.sayMeow();


        HomeCat murochka = new HomeCat("Murochka",3.0,true);


        System.out.println(murochka.getName());

    }


}
