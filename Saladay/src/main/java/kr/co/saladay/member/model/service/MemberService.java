package kr.co.saladay.member.model.service;

import kr.co.saladay.member.model.vo.Member;

public interface MemberService {

	/** 로그인 서비스
	 * @param member
	 * @return loginMember
	 */
	public Member login(Member member);

	
	/** 회원가입 서비스
	 * @param member
	 * @return result (result > 0) 성공
	 */
	int signUp(Member member);

	
	/**	이메일 중복 체크 서비스
	 * @param memberEmail
	 * @return result (중복아니면 0)
	 */
	int emailDupCheck(String memberEmail);


}
