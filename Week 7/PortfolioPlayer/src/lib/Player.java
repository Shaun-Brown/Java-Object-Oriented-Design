package lib;

/**
 * This class imposes a new player that contains
 *  a name and a pair of dice which are parsed to
 *  the fields from external objects "Name" and
 *  "PairOfDice"
 *
 *  @author Shaun
 */
public class Player implements Comparable<Player>{

    /**
     * Fields define the name and rollable variables as a key
     * variables of the Object Class Name which both use other class elements and
     * one of Interface class Rollable which implements interface elements.
     */
    private Name name;
    private final Rollable rollable;

    /**
     * Default constructor creating new objects of type Name and type Rollable
     */
    public Player(){
        name = new Name();
        rollable = new PairOfDice();
    }

    /**
     * Constructor that creates a new name on creation
     * @param name variable is of type name and creates a new player
     * name which is allowed to use methods from the Name class and
     * with a new rollable interface which is hard set to return
     * a score of 0 and implement the roll variable.
     */
    public Player(Name name){
        this.name = name;
        rollable = new Rollable() {
            @Override
            public void roll() {

            }

            @Override
            public int getScore() {
                return 0;
            }
        };
    }

    /**
     * Constructor that creates a new name and pair of dice on creation
     * @param name variable is of type Name and creates a new player name
     * which is allowed to use methods from the Name class.
     * @param rollable variable is of type Rollable and creates a pair
     * of dice for a new player which is allowed to use methods from
     * the Rollable interface.
     */
    public Player(Name name, Rollable rollable){
        this.name = name;
        this.rollable = rollable;
    }

    /**
     * Returns the name set in either the constructor or the
     * setName method, using methods from the Name class.
     * @return type Name.
     */
    public Name getName() {
        return name;
    }

    /**
     * Setter method for the name field
     * @param name Allows the storage of a new name in the Name class.
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Returns the results of the rollable field using the
     * get method from the Rollable interface.
     * @return rollable from Rollable class.
     */
    public Rollable getRollable() {
        return rollable;
    }

    /**
     * Rolls the dice using method from the Die method
     * through the Rollable interface
     */
    public void rollDice(){
        rollable.roll();
    }

    /**
     * Returns the scores from the rollable field which
     * are changes upon use of the roll function.
     * @return rollable.
     */
    public int getDiceScore(){
        return rollable.getScore();
    }

    /**
     * This take a name argument, splits the name where
     * a space takes place and sets the names in the "firstName"
     * and "familyName" variables within the Name class.
     * @param name is a single string that gets split and
     *             set into separate methods within the "Name" class
     */
    public void setFullPlayerName(String name){
        String firstName = name.substring(0,name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1);
        this.name.setFirstName(firstName);
        this.name.setFamilyName(lastName);
    }

    /**
     * This takes an Object and compares it with another
     * objects to determine if the objects are of the same value.
     * @param obj is a string or variable that can be of any native type.
     */
    public boolean equals(Object obj){
        if (obj == null  || this.getClass() != obj.getClass())
            return false;

        Player other = (Player) obj; // downcast to a Player object

        return this.name == other.name && this.rollable == other.rollable;
    }

    /**
     * This will take class type Player and compare values lexicographically
     * against a second value. If the two values are the same the function
     * will return 0.
     * @param p is an item that can be set to the player class, of String or
     *         type rollable.
     */
    public int compareTo(Player p){
        return this.name.compareTo(p.name);
    }

    /**
     * The toString method will return a String visual representation
     * of the class and the current data in which has been input.
     * @return returns a string visual representation of the data input
     * into the class.
     */
    public String toString(){
        return "Player:[name=" + name + ", pair of dice=" + rollable + "]";
    }

}
