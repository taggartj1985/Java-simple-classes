public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int volume(){
        return this.volume;
    }

    public int takeDrink(){
        return this.volume - 10;
    }

    public int fillBottle(){
        this.volume = 100;
        return this.volume;
    }
    public int emptyBottle(){
        this.volume = 0;
        return this.volume;
    }






}

//    Water Bottle
//    Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.
