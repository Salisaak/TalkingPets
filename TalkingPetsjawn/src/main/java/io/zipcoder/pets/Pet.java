package io.zipcoder.pets;

public abstract class Pet {
    private String name;
    public String animal;

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }

    public Pet(String name, String animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void Sound();


}
