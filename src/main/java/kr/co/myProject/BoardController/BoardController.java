package kr.co.myProject.BoardController;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.myProject.BoardService.BoardService;

@Controller
public class BoardController {
	
	@Inject
	private BoardService boardService;
	
	@RequestMapping(value= "/board", method = RequestMethod.GET)
	public void boardTest(Model model) {
		
		int num = boardService.selectTest();
		
		System.out.println(num);
		
	}
	
	@RequestMapping(value= "/main.do", method = RequestMethod.GET)
	public String main(Model model) {
		
		int num = boardService.selectTest();
		
		return "common/main";
	}

}
