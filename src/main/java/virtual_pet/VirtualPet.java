package virtual_pet;

public class VirtualPet {

    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;

    public VirtualPet(String name, int hunger, int thirst, int waste, int boredom, int sickness) {

        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.sickness = sickness;
    }

    public void feeding() {
        System.out.println(hunger -= 35);

    }

    public void watering() {
        System.out.println(thirst -= 35);

    }

    public void goForaWalk() {
        System.out.println(waste -= 45);

    }

    public void playing() {
        System.out.println(boredom -= 15);

    }

    public void takeToDoctor() {
        System.out.println(sickness -= 25);

    }

    public void tick() {
        hunger += 5;
        thirst += 5;
        waste += 5;
        boredom += 5;
        sickness += 5;
    }


    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWaste() {
        return waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getSickness() {
        return sickness;
    }
}




