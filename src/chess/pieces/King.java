package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "K";
	}

	private boolean canMove(Position position) {

		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {

		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// Above = acima

		p.setValues(position.getRow() - 1, position.getColumn());

		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// Below = abaixo

		p.setValues(position.getRow() + 1, position.getColumn());

		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// Left = esquerda

		p.setValues(position.getRow(), position.getColumn() - 1);

		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}

		// Right = direita

		p.setValues(position.getRow(), position.getColumn() + 1);

		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// NW = noroeste
		
		p.setValues(position.getRow() - 1, position.getColumn() - 1);

		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// NE = nordeste
		
		p.setValues(position.getRow() - 1, position.getColumn() + 1);

		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// SW = sudoeste
		
		p.setValues(position.getRow() + 1, position.getColumn() - 1);

		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// SE = sudeste
		
		p.setValues(position.getRow() + 1, position.getColumn() + 1);

		if (getBoard().positionExists(p) && canMove(p)) {

			mat[p.getRow()][p.getColumn()] = true;
		}
		
		

		return mat;
	}

}
