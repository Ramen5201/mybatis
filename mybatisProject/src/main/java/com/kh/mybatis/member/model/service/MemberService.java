package com.kh.mybatis.member.model.service;

import com.kh.mybatis.member.model.vo.Member;

public interface MemberService {
	// 인터페이스 : 추상메소드(public abstract) + 상수필드(public static final)
	
	/*public abstract 생략되있음*/
	public abstract int insertMember(Member m);
	public abstract int updateMember(Member m);
	public abstract int deleteMembeR(Member m);
	public abstract Member loginMember(Member m);
}
