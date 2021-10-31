public class DogLauncher {
    public static void main(String [] args) {
        // Declaration Instantiationn Assignment
        Dog d = new Dog(50);
        d.makeNoise();

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);

        dogs[0].makeNoise();

        Dog bigger = Dog.maxDog(dogs[0], dogs[1]);
        bigger.makeNoise();

        Dog bigger2 = dogs[0].maxDog(dogs[1]);
        bigger2.makeNoise();

        System.out.println(Dog.binomen);
    }
}