package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);

	}

	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {

		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// Above = acima

		p.setValues(position.getRow() - 1, position.getColumn());
		// Teste se a posição p existe e se não há nenhuma peça ocupando o lugar.
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			// Após o teste ele muda o valor da posição p para a linha de cima.
			p.setRow(p.getRow() - 1);
		}

		// Testa se a peça existente na posição p é aliada ou do oponente.
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Left = esquerda

		p.setValues(position.getRow(), position.getColumn() - 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;

			p.setColumn(p.getColumn() - 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Right = direita

		p.setValues(position.getRow(), position.getColumn() + 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;

			p.setColumn(p.getColumn() + 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Below = Abaixo

		p.setValues(position.getRow() + 1, position.getColumn());

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;

			p.setRow(p.getRow() + 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// NW = noroeste

		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		// Teste se a posição p existe e se não há nenhuma peça ocupando o lugar.
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			// Após o teste ele muda o valor da posição p para a linha de cima.
			p.setValues(p.getRow() - 1, p.getColumn() - 1);
		}

		// Testa se a peça existente na posição p é aliada ou do oponente.
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// NE = nordeste

		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		// Teste se a posição p existe e se não há nenhuma peça ocupando o lugar.
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			// Após o teste ele muda o valor da posição p para a linha de cima.
			p.setValues(p.getRow() - 1, p.getColumn() + 1);
		}

		// Testa se a peça existente na posição p é aliada ou do oponente.
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// SW = sudoeste

		p.setValues(position.getRow() + 1, position.getColumn() - 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;

			p.setValues(p.getRow() + 1, p.getColumn() - 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// SE = sudeste

		p.setValues(position.getRow() + 1, position.getColumn() + 1);

		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;

			p.setValues(p.getRow() + 1, p.getColumn() + 1);
		}

		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}

}
