package shelter;


public class VirtualPet {

    private int hunger;
    private int thirst;
    private int boredom;
    private String name;
    private String description;

    public VirtualPet(String name, String description){
        this.name = name;
        this.description = description;
        this.boredom = 5;
        this.thirst = 5;
        this.hunger = 5;

    }

    public VirtualPet(String name, String description, int boredom, int hunger, int thirst) {
        this.name = name;
        this.description = description;
        this.boredom = boredom;
        this.thirst = thirst;
        this.hunger = hunger;

    }
    public void playWithPet(){
        System.out.println("Name: " + this.name);
        this.boredom--;
    }
    public void waterPet(){
        this.thirst--;
    }
    public void feedPet(){
        this.hunger--;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst(){
        return thirst;
    }
    public int getBoredom(){
        return boredom;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

}
