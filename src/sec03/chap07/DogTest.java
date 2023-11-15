package sec03.chap07;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {
        ArrayList<Dog> dogList = new ArrayList<>();

        dogList.add(new Dog("빵돌이", "웰시코기"));
        dogList.add(new Dog("뽀", "웰시코기"));
        dogList.add(new Dog("영웅이", "푸들"));
        dogList.add(new Dog("설이", "포메라니안"));
        dogList.add(new Dog("장군이", "시고르자브종"));

        for(int i=0; i< dogList.size(); i++){
            System.out.println(dogList.get(i).showDog());
        }
        System.out.println("======================");
        for(Dog dog : dogList){
            System.out.println(dog.showDog());
        }
    }
}
