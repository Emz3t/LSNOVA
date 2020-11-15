package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lombok.Getter;

@Getter
public class Task3 implements Task {

	private final List<HashSet<Integer>> graphs = new ArrayList<>();
	private int pointsNumber = 0;

	@Override
	public void execute(String[] args) {
		try {
			if (areIncorrect(args)) {
				System.out.println("No input data or first number not matching following numbers");
				return;
			}
			pointsNumber = Integer.parseInt(args[0]) * 2;

			setUpGraphs(args);
			printOutput();
		} catch (NumberFormatException exception) {
			//wrong format
			pointsNumber = 0;
			graphs.clear();
			System.out.println("Wrong inputs format");
		}
	}

	private void printOutput() {
		System.out.println(graphs.size());
	}

	private void setUpGraphs(String[] args) {
		for (int i = 1; i < pointsNumber; i += 2) {
			int firstNumber = Integer.parseInt(args[i]);
			int secondNumber = Integer.parseInt(args[i + 1]);
			HashSet<Integer> firstMatch = null;
			HashSet<Integer> secondMatch;
			boolean foundAny = false;
			for (HashSet<Integer> graph : graphs) {
				if (graph.contains(firstNumber) || graph.contains(secondNumber)) {
					foundAny = true;
					if (firstMatch == null) {
						firstMatch = graph;
					} else {
						secondMatch = graph;
						firstMatch.addAll(secondMatch);
						graphs.remove(secondMatch);
					}
				}
			}
			if (foundAny) {
				firstMatch.add(firstNumber);
				firstMatch.add(secondNumber);

			} else {
				HashSet<Integer> newHashSet = new HashSet<>();
				newHashSet.add(firstNumber);
				newHashSet.add(secondNumber);
				graphs.add(newHashSet);
			}
		}
	}

	private boolean areIncorrect(String[] args) {
		return args.length % 2 == 0;
	}
}
