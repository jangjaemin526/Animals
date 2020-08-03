package com.jaemin.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jaemin.web.entity.Behaviorintention;

@Mapper
public interface BehaviorintentionDao {
	
	
	@Select("SELECT * FROM Behaviorintention WHERE ${field} LIKE '%${query}%' ORDER BY regdate ASC LIMIT 10 OFFSET #{page}")
	List<Behaviorintention> getList(int page,@Param("query") String query, @Param("field")String field) throws ClassNotFoundException, SQLException;
	
	@Select("SELECT * FROM Behaviorintention WHERE id=#{id}")
	Behaviorintention get(int id); 
	
}
