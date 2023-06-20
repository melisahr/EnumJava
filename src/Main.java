public class Main {
    public static void main(String[] args) {
        //enum = enumerated (ordered listing of items in a collection)
        //grouping of constants that behave similarly to objects

        //Create an Object for enum
        Planet myPlanet = Planet.EARTH;

        //call the method
        canILiveHere(myPlanet);
    }
        //Method
        static void canILiveHere(Planet myPlanet){
        switch (myPlanet){
                case EARTH:
                    System.out.println("You can live here");
                    System.out.println("This is planet #"+myPlanet.number);
                    break;
                default:
                    System.out.println("You can't live here...yet");
                    System.out.println("This is planet #"+myPlanet.number);
            }
        }
}