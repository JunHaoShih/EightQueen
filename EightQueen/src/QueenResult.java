import java.util.Arrays;

public class QueenResult {
	private int queenIndexes[] = new int[8];
	
	public QueenResult(int queenIndexes[]) {
		setQueenIndexes(queenIndexes);
	}

	public int[] getQueenIndexes() {
		return queenIndexes;
	}

	public void setQueenIndexes(int queenIndexes[]) {
		this.queenIndexes = Arrays.copyOf(queenIndexes, queenIndexes.length);
	}
	
	public void printResult() {
		for (int queenIndex: queenIndexes) {
			for (int i = 0; i < queenIndexes.length; i++) {
				if (i == queenIndex)
					System.out.print("Q");
				else
					System.out.print(".");
			}
			System.out.println();
		}
	}
}
