package io.zipcoder.pets;

public class Cat extends Pet {


    public Cat(String name, String animal) {
        super(name, animal);
    }

    @Override
    public void Sound() {
        System.out.println("meow");
    }


}
