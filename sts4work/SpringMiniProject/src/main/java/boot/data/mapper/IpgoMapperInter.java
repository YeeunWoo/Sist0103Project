package boot.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.IpgoDto;

@Mapper
public interface IpgoMapperInter {

	public int getTotalCount(); // 메서드명이 sql의 id

	public void insertIpgo(IpgoDto dto);

	public List<IpgoDto> getAllDatas();
	
	public IpgoDto getData(String num);
	
	public void updateIpgo(IpgoDto dto);
}