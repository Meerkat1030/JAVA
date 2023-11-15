package sec03.chap05;

public class AbstractExam {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());

    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
