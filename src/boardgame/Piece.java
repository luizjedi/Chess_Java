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

		// Se existir alguma posi��o v�lida dentro da matriz, a mesma ir� retornar
		// o valor true.
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}

		// Se ap�s percorrer a matriz nenhuma posi��o v�lida for encontrada, ent�o
		// ir� retornar o valor false.
		return false;
	}
}
