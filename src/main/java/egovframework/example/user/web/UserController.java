package egovframework.example.user.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.user.service.UserService;

@Controller
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;

	@RequestMapping(value="/userList.do")
	private String userSelectList(SampleDefaultVO searchVO)throws Exception {
		
		
		return "user/userList"; // view URL 지정
	}
}
