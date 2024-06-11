package egovframework.example.user.service.impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.sample.service.SampleDefaultVO;

@Mapper("userMapper")
public interface UserMapper {
	
	List<?> userSelectList(SampleDefaultVO searchVO) throws Exception;

}
