import java.util.ArrayList;
import java.util.List;

public class EightQueenSolver {
	
	List<QueenResult> results = new ArrayList<QueenResult>();

	private int queenIndexes[] = new int[8];
	
	public List<QueenResult> getResult() {
		// ��Ĥ@��Ѥl
		putQueen(0);
		return results;
	}
	
	private void putQueen(int column) {
		if (column < queenIndexes.length) {
			for (int i = 0; i < queenIndexes.length; i++) {
				// ��m�ӦZ
				queenIndexes[column] = i;
				if (isValid(column)) {
					// ��U�@��Ѥl
					putQueen(column + 1);
				}
			}
		} else {
			results.add(new QueenResult(queenIndexes));
		}
	}
	
	private boolean isValid(int column) {
		for (int i = 0; i < column; i++) {
			if (queenIndexes[i] == queenIndexes[column])
				return false;
			if (queenIndexes[i] - queenIndexes[column] == i - column ||
					(queenIndexes[i] - queenIndexes[column]) * -1 == i - column) 
				return false;
		}
		return true;
	}
}
