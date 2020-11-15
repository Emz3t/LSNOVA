package tasks;
import java.util.ArrayList;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
public class Task2 implements Task {

	private static final int NUMBER_TO_SUM_UP = 13;
	private ArrayList<Integer> numbers = new ArrayList<>();
	private int pairs = 0;

	@Override
	public void execute(String[] args) {
		if (args.length == 0) {
			System.out.println("No input data");
			return;
		}
		for (String arg : args) {
			try {
				numbers.add(Integer.valueOf(arg));
			} catch (NumberFormatException exception) {
				//wrong format
				numbers.clear();
				pairs = 0;
				System.out.println("Wrong inputs format");
				return;
			}
		}
		numbers = numbers.stream().parallel().sorted().collect(Collectors.toCollection(ArrayList::new));
		if (numbers.size() != 0) {
			getAndPrintOutput();
		}
	}

	private void getAndPrintOutput() {
		int i = 0;
		int j = numbers.size() - 1;
		while (i != j) {
			int number = numbers.get(i) + numbers.get(j);
			if (foundNumber(number)) {
				printPair(numbers.get(i), numbers.get(j));
				pairs ++;
				i++;
			} else if (number < NUMBER_TO_SUM_UP) {
				i++;
			} else {
				j--;
			}
			if (i == j) {
				break;
			}
		}
	}

	private boolean foundNumber(int number) {
		return number == NUMBER_TO_SUM_UP;
	}

	private void printPair(Integer integer, Integer integer1) {
		System.out.println(integer + " " + integer1);
	}
}
