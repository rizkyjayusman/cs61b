public class Dog {

    public int weightInPounds;

    public static String binomen = "Canis familiaris";

    public Dog(int w) {
        weightInPounds = w;
    }

    public void makeNoise() {
        if(weightInPounds < 10) {
            System.out.println("yip. yip. yip.");
        } else if (weightInPounds < 30) {
            System.out.println("Bark!");
        } else {
            System.out.println("awooooooooooo!");
        }
    }

    public static Dog maxDog(Dog dog1, Dog dog2) {
        if(dog1.weightInPounds > dog2.weightInPounds) {
            return dog1;
        }

        return dog2;
    }

    public Dog maxDog(Dog dog2) {
        if(this.weightInPounds > dog2.weightInPounds) {
            return this;
        }

        return dog2;
    }
}