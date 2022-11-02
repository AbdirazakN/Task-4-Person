public class Person {
    String name;
    int age;
    char gender;
    String phoneNumber;

    public void getInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone Number: "+phoneNumber);
    }
    public void getQuantity(Person[] people){
        int boys = 0;
        int girls = 0;
        for (Person person:people) {
            if (person.gender == 'M') {
                boys++;
            } else if (person.gender == 'F') {
                girls++;
            }else {
                System.out.println("Error");
            }
        }
        System.out.println("Quantity the boys: "+boys);
        System.out.println("Quantity the girls: "+girls);
    }
}
