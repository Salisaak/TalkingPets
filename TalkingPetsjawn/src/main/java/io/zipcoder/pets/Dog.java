package io.zipcoder.pets;

public class Dog extends Pet {


    public Dog(String name, String animal) {
        super(name, animal);
    }

    @Override
    public void Sound() {
        System.out.println("woof");
    }


}
