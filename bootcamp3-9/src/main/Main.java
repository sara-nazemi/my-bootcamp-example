package main;

import person.Person;

public class Main {
    public static void main(String[] args) {

        Person[] persons = new Person[5];

        Person person = new Person();
        person.setName("x");
        person.setAge(23);
        person.setAddress("تهران");
        persons[0] = person;

        Person person1 = new Person();
        person1.setName("y");
        person1.setAge(30);
        person1.setAddress("شیراز");
        persons[1] = person1;

        Person person2 = new Person();
        person2.setName("z");
        person2.setAge(36);
        person2.setAddress("اصفهان");
        persons[2] = person2;

        Person person3 = new Person();
        person3.setName("a");
        person3.setAge(27);
        person3.setAddress("رشت");
        persons[3] = person3;

        Person person4 = new Person();
        person4.setName("b");
        person4.setAge(34);
        person4.setAddress("اهواز");
        persons[4] = person4;

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Name =" + persons[i].getName() +
                    " Age=" + persons[i].getAge());
        }

    }
}
