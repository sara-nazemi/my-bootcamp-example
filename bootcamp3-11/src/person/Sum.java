package person;

public class Sum {
    Person[] persons = new Person[3];

    public void setOfAge() {
        Person person1 = new Person();
        person1.setAge(23);
        persons[0] = person1;

        Person person2 = new Person();
        person2.setAge(34);
        persons[1] = person2;

        Person person3 = new Person();
        person3.setAge(26);
        persons[2] = person3;

    }

    public void sumOfAge() {
        double sum = 0;
        for (int i = 0; i < persons.length; i++) {
            sum += persons[i].getAge();
        }
        sum = sum / persons.length;
        System.out.println("Average of ages is = " + sum);
    }
}
