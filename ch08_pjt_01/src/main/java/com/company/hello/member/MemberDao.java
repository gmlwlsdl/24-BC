package com.company.hello.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MemberDao {

		private Map<String, MemberVo> memberDB = new HashMap<String, MemberVo>();
		
		public void insertMember(MemberVo memberVo) {
			System.out.println("m_id: " + memberVo.getM_id());
			System.out.println("m_pw: " + memberVo.getM_pw());
			System.out.println("m_mail: " + memberVo.getM_mail());
			System.out.println("m_phone: " + memberVo.getM_phone());
		}
}
