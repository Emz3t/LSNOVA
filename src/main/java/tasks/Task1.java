package tasks;

import java.util.SortedSet;
import java.util.TreeSet;
import lombok.Getter;

@Getter
public class Task1 implements Task {

	private final SortedSet<Integer> numbers = new TreeSet<>();
	private int count = 0;

	private static final String SPACE = " ";
	private static final String MAX = "max: ";
	private static final String MIN = "min: ";
	private static final String DISTINCT = "distinct: ";
	private static final String COUNT = "count: ";

	@Override
	public void execute(String... args) {
		if (args.length == 0) {
			System.out.println("No input data");
			return;
		}
		for (String arg : args) {
			try {
				numbers.add(Integer.valueOf(arg));
				count++;
			} catch (NumberFormatException exception) {
				//wrong format
				count = 0;
				numbers.clear();
				System.out.println("Wrong inputs format");
				return;
			}
		}
		printOutput();
	}

	private void printOutput() {
		for (Integer number : numbers) {
			System.out.print(number + SPACE);
		}
		System.out.println();
		System.out.println(COUNT + count);
		System.out.println(DISTINCT + numbers.size());
		System.out.println(MIN + numbers.first());
		System.out.println(MAX + numbers.last());
	}
}
