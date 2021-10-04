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
	
	@Override
	public void increment() {
		super.setCount(super.getCount() + step);
	}
	
	@Override
	public void decrement() {
		super.setCount(super.getCount() - step);
	}
	
	@Override
	public String toString() {
		return super.toString() + "[step=" + step + "]";
	}
	
}
