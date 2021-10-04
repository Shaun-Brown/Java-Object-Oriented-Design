package lib;

/**
 * This class imposes a new player that contains
 *  a name and a pair of dice which are parsed to
 *  the fields from external objects "Name" and
 *  "PairOfDice"
 *
 *  @author Shaun
 */
public class Player {

    /**
     * Fields define the name and pairOfDice variables as the 2 key
     * variables of the Object Class which both use other class elements.
     */
    private Name name;
    private PairOfDice pairOfDice;

    /**
     * Default constructor creating new objects of type Name and type PairOfDice
     */
    public Player(){
        name = new Name();
        pairOfDice = new PairOfDice();
    }

    /**
     * Constructor that creates a new name on creation
     * @param name variable is of type name and creates a new player
     *             name which is allowed to use methods from the Name class.
     */
    public Player(Name name){
        this.name = name;
    }

    /**
     * Constructor that creates a new name and pair of dice on creation
     * @param name variable is of type Name and creates a new player name
     *             which is allowed to use methods from the Name class.
     * @param pairOfDice variable is of type PairOfDice and creates a pair
*                        of dice for a new player which is allowed to use
*                        methods from the PairOfDice class.
     */
    public Player(Name name, PairOfDice pairOfDice){
        this.name = name;
        this.pairOfDice = pairOfDice;
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
     * Returns the results of the pairOfDice field using the
     * get method from the PairOfDice class.
     * @return pairOfDice from PairOfDice class.
     */
    public PairOfDice getPairOfDice() {
        return pairOfDice;
    }

    /**
     * Rolls the dice using method from the Die method
     * through the PairOfDice method
     */
    public void rollDice(){
        pairOfDice.roll();
    }

    /**
     * Returns the scores from the pairOfDice fields which
     * are changes upon use of the roll function.
     * @return pairOfDice.
     */
    public int getDiceScore(){
        return pairOfDice.getScore();
    }

    /**
     * This take a name argument, splits the name where
     * a space takes place and sets the names in the "firstName"
     * and "familyName" variables within the Name class.
     * @param name is a single string that gets split and
     *             set into separate methods within the "Name" class
     */
    public void setFullName(String name){
        String firstName = name.substring(0,name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1);
        this.name.setFirstName(firstName);
        this.name.setFamilyName(lastName);
    }

    /**
     * The toString method will return a String visual representation
     * of the class and the current data in which has been input.
     * @return returns a string visual representation of the data input
     * into the class.
     */
    public String toString(){
        return "Player:[name=" + name + ", pair of dice=" + pairOfDice + "]";
    }

}
