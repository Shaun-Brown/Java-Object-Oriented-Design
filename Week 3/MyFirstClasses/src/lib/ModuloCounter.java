package lib;

public class ModuloCounter {

    private int count;
    private final Counter cycles = new Counter();

    public ModuloCounter(){
        count = 0;
    }

    public ModuloCounter(int count){
        this.count = count % 5;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count % 5;
    }

    public int getCycles() {
        return cycles.getCount();
    }

    public void increment(){
        count = (count +1) % 5;
        if(count % 5 == 0){
            cycles.increment();
        }
    }

    public void decrement(){
        if (count <= -1){
            count = 4;
            cycles.decrement();
        } else {
            count = count -1;
        }
    }

    @Override
    public String toString(){
        return "ModuloCounter:[count=" + count + "]";
    }

}
