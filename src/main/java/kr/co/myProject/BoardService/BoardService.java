package kr.co.myProject.BoardService;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.myProject.BoardDAO.BoardDAO;

@Service
public class BoardService {

	@Inject
	public BoardDAO boardDAO;
	
	public int selectTest() {
		
		return boardDAO.selectTest();
	}
	
}
