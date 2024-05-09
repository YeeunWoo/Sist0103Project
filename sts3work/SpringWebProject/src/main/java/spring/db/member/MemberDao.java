package spring.db.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao implements MemberDaoInter{
	
	@Autowired
	private SqlSession session;
	
	@Override
	public int getIdCheck(String id) {
		return session.selectOne("idCheckOfMember",id);
	}
}
