public class Conditionals {
    public static void main(String[] args) {
        boolean isAlien = false;

        // If statement
        if(isAlien) {
            System.out.println("You are an alien");
        } else {
            System.out.println("You are not an alien");
        }

        int topScore = 100;

        if(topScore != 100) {
            System.out.println("You got the high score");
        }

        // ternary operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;
        if(isDomestic) {
            System.out.println("It is a domestic car");
        }
    }
}
