package boot.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.data.mapper.MemBoardMapperInter;

@Service
public class MemBoardService {
	@Autowired
	MemBoardMapperInter mapperInter;
	
	@Override
	public void getTotalCount() {
		
	}
}
