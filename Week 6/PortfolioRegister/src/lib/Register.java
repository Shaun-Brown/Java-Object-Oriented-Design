package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * This JAVADOC needs doing!
 * @author Shaun
 */

public class Register implements Iterable<Name>{

    private ArrayList<Name> register;

    public Register(){
        register = new ArrayList<>();
    }

    public Register(ArrayList<Name> register){
        this.register = register;
    }

    public Name getName(int n) {
        return register.get(n);
    }

    public void addName(Name n) {
        register.add(n);
    }

    public Name removeName(int n) {
        return register.remove(n);
    }

    public int registerSize(){
        return register.size();
    }

    public void clearRegister(){
        register.clear();
    }

    public boolean isRegisterEmpty(){
        return register.isEmpty();
    }

    public Boolean searchRegisterByFamilyName(String name) {
        return register.stream().anyMatch(a -> a.getFamilyName().equals(name));
    }

    public int countFirstNameOccurrences(char f){
        return (int) register.stream().filter(name -> name.getFirstName().charAt(name.getFirstName().length()-1) == f).count();
    }

    public void sortRegister(){
        Collections.sort(register);
    }

    public String toString(){
        return "Register:[register=" + register + "]";
    }

    @Override
    public Iterator<Name> iterator() {
        return register.iterator();
    }

}
