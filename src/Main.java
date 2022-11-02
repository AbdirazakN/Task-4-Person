public class Main {
    public static void main(String[] args) {

        // Task N%4. Person деген класс тузунуз поляларын бериниз аты,жашы,жынысы,телефон номери жана бир метод
        //болушу керек. Студенттердин канчасы бала канчасы кыз экенин чыгаруучу метод керек.

        Person person1 = new Person();
        person1.name = "Abubakr";
        person1.age = 21;
        person1.gender = 'M';
        person1.phoneNumber = "+996777070707";

        Person person2 = new Person();
        person2.name = "Maksat";
        person2.age = 23;
        person2.gender = 'M';
        person2.phoneNumber = "+996555050505";

        Person person3 = new Person();
        person3.name = "Umar";
        person3.age = 17;
        person3.gender = 'M';
        person3.phoneNumber = "+996700700700";

        Person person4 = new Person();
        person4.name = "Aisha";
        person4.age = 16;
        person4.gender = 'F';
        person4.phoneNumber = "+996555555555";

        Person person5 = new Person();
        person5.name = "Fatima";
        person5.age = 19;
        person5.gender = 'F';
        person5.phoneNumber = "+996222020202";

        Person[] people = {person1,person2,person3,person4,person5};

        person1.getInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        person2.getInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        person3.getInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        person4.getInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        person5.getInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        person1.getQuantity(people);

    }
}