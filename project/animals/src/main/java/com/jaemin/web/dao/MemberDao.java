package com.jaemin.web.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.jaemin.web.entity.Member;

@Mapper
public interface MemberDao {

	@Insert("INSERT INTO Member(uid, pwd, name, gender, birthday, phone, email ) VALUES(#{uid},#{pwd},#{name},#{gender},#{birthday},#{phone},#{email})")
	int insert(Member member);

}
