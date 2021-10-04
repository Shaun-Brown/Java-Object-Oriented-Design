package lib.measurable;

import java.util.ArrayList;
import java.util.List;


public class DataAnalysis<E extends Measurable> {

	private List<E> objects;

	public DataAnalysis() {
		objects = new ArrayList<>();
	}

	public void addMeasurable(E m) {
		objects.add(m);
	}

	public int sum() {
		return objects.stream().mapToInt(Measurable::getMeasure).sum();
	}

	public double avg() {
		return objects.stream()
				.mapToDouble(Measurable::getMeasure)
				.average()
				.orElse(-1);
	}

	public int min(){
		return objects.stream()
				.mapToInt(Measurable::getMeasure)
				.min()
				.orElse(-1);
	}

	public int max(){
		return objects.stream()
				.mapToInt(Measurable::getMeasure)
				.max()
				.orElse(-1);
	}

	public String toString() {
		return "DataAnalysis[objects= " + objects + "]";
	}
}
