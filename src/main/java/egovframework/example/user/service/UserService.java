package egovframework.example.user.service;

import java.util.List;

import egovframework.example.sample.service.SampleDefaultVO;

public interface UserService {
	
	List<?> userSelectList(SampleDefaultVO searchVO) throws Exception;

}
