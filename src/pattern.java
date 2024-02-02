abstract class Animal {
    protected SoundStrategy soundStrategy;

    public Animal(SoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }

    public void makeSound() {
        soundStrategy.makeSound();
    }
    
    public void walk() {
        System.out.println("walking");
    }
}

interface SoundStrategy {
    void makeSound();
}

// CatSound.java
class CatSound implements SoundStrategy {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Cat extends Animal {
    public Cat(SoundStrategy soundStrategy) {
        super(soundStrategy);
    }
}

// DogSound.java
class DogSound implements SoundStrategy {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Dog extends Animal {
    public Dog(SoundStrategy soundStrategy) {
        super(soundStrategy);
    }
}

class SmallDog extends Animal {
    public SmallDog(SoundStrategy soundStrategy) {
        super(soundStrategy);
    }
}


class Main {
    public static void main(String[] args) {
        // Creating a cat with a sound strategy
        Cat cat = new Cat(new CatSound());
        cat.makeSound(); // Meow
        
        // Creating a dog with a sound strategy
        Dog dog = new Dog(new DogSound());
        dog.makeSound(); // Woof
        
        // Creating a dog with a sound strategy
        SmallDog smalldog = new SmallDog(new DogSound());
        smalldog.makeSound(); // Woof
    }
}