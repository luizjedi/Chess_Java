package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {

		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {

		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {

		boolean[][] mat = possibleMoves();

		// Se existir alguma posição válida dentro da matriz, a mesma irá retornar
		// o valor true.
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}

		// Se após percorrer a matriz nenhuma posição válida for encontrada, então
		// irá retornar o valor false.
		return false;
	}
}
