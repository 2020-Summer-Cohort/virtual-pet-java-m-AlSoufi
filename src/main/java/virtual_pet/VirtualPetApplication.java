package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;

    public VirtualPetApplication(int hunger, int thirst, int waste, int boredom, int sickness) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.sickness = sickness;
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
