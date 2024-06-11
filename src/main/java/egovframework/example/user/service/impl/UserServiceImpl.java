package egovframework.example.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.user.service.UserService;

@Service("userService")
public class UserServiceImpl extends EgovAbstractServiceImpl implements UserService {
	
	@Resource(name="userMapper")
	private UserMapper userDAO;

	@Override
	public List<?> userSelectList(SampleDefaultVO searchVO) throws Exception {
		// TODO Auto-generated method stub
		
		return userDAO.userSelectList(searchVO);
	}

}
