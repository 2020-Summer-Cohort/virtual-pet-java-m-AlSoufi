package virtual_pet;

public class VirtualPet {

    private String name;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;

    public VirtualPet(String name, int hunger, int thirst, int waste, int boredom, int sickness) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.waste = waste;
        this.boredom = boredom;
        this.sickness = sickness;
    }

    public void feeding(){
        System.out.println(hunger - 10);

    }
    public void watering(){
        System.out.println(thirst -10);

    }
    public void goForaWalk(){
        System.out.println(waste -10);

    }
    public void playing(){
        System.out.println(boredom - 10);

    }
    public void takeToDoctor(){
        System.out.println(sickness -10);

    }

    public void tick() {
        hunger++;
        thirst++;
        waste++;
        boredom++;
        sickness++;
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




