import java.util.List;

public class Main {

	public static void main(String[] args) {
		EightQueenSolver mapper = new EightQueenSolver();
		List<QueenResult> results = mapper.getResult();
		for (int i = 0; i < results.size(); i++) {
			System.out.println("//Solution " + (i + 1));
			results.get(i).printResult();
			System.out.println();
		}
		System.out.println("Solutoin count: " + results.size());
	}

}
