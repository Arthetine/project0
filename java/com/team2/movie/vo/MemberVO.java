package com.team2.movie.vo;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
public class MemberVO {
	
	private Long m_num;
	private String m_id;
	private String m_nick;
	private String m_pw;
	private String m_name;
	private String m_tell;
	private String m_mail;
	private int g_num;
	private String m_lev;
	
//	private List<AuthVO> authList;
	private List<GrantedAuthority> authList;
}
