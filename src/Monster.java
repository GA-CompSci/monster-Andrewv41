public class Monster {
    // INSTANCE VARIABLES (properties / data variables)
    private int health;
    private double damage;
    private int speed;
    private String special;

    //CONSTRUCTOR
    public Monster(){
        // randomly generate health, damage, speed
        health = (int)(Math.random()*80 + 1) + 20;
        // random 10 - 50
        damage = (double)(Math.random()*41) + 10;
        //random 1 - 10
        speed = (int)(Math.random()*10) + 1;
        //by default the monster has no special move
        special = "";
}
    //OVERLOADED CONSTRUCTOR
    public Monster(String special){
        this();
        this.special = special;
    }
    //ACCESSOR METHODS
    public int health(){return health; }
    public double damage() {return Math.round(damage*100.0/100.0);}
    public int speed() {return speed;}
    public String special(){return this.special;}
}
