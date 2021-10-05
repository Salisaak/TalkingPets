package io.zipcoder.pets;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner howMany = new Scanner(System.in);
        System.out.println("How many pets you got? ");

        int petAmount = howMany.nextInt();

        Pet[] petList = new Pet[petAmount];

        for(int i = 0; i < petAmount; i++){

            Scanner species = new Scanner(System.in);
            System.out.println("What kind?");
            String animal = species.next();


            Scanner leName = new Scanner(System.in);
            System.out.println("What is your pet's name");
            String petName = leName.next();

            switch (animal.toLowerCase()){
                case "dog" :
                    Dog dog1 = new Dog(petName, animal);
                    petList[0] = dog1;
                    dog1.Sound();
                    break;
                case "cat" :
                    Cat cat1 = new Cat(petName, animal);
                    petList[1] = cat1;
                    cat1.Sound();
                    break;
                case "snake" :
                    Snake snake1 = new Snake(petName, animal);
                    petList[3] = snake1;
                    snake1.Sound();
                    break;
                default:
                    System.out.println("Try Dog,Cat or Snake");

            }

            System.out.println(Arrays.toString(petList));


    }
}
}
