package kr.co.myProject.BoardDAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Inject
	SqlSession sqlSession;
	
	public int selectTest() {
		
		return sqlSession.selectOne("mapper.board.selectTest");
	}
	
}
