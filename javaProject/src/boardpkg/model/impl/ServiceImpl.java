package boardpkg.model.impl;

import boardpkg.control.BoardDAO;
import boardpkg.model.Board;
import boardpkg.model.Service;

public class ServiceImpl implements Service {
	
	BoardDAO dao = new BoardDAO();

	@Override
	public Board[] getBoardList() {
		return dao.selectBoards();

	}

	@Override
	public Board getBoard(int boardNo) {
		return dao.selectBoard(boardNo);
	}

	@Override
	public void createBoard(Board board) {
		dao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public void removeBoard(Board board) {
		dao.deleteBoard(board);
	}
	
}
