package io.zipcoder.pets;

public class Snake extends Pet {


    public Snake(String name, String animal) {
        super(name, animal);
    }

    @Override
    public void Sound() {
        System.out.println("hisssss");

    }


}
