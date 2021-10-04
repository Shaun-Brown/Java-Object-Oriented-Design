package lib.counters;

public class StepCounter extends Counter {

    private int step;

    public StepCounter() {
        super();
        step = 2;
    }

    public StepCounter(int count, int step) {
        super(count);
        this.step = step;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public void increment(){
        for (int i = 0; i < step; i++) {
            super.increment();
        }
    }

    @Override
    public void decrement(){
        for (int i = 0; i < step; i++) {
                super.decrement();
        }
    }

    @Override
    public String toString(){
        return super.toString() + "[step=" + step + "]";
    }

}
