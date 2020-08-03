package com.jaemin.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jaemin.web.entity.Taboofood;

@Mapper
public interface TaboofoodDao {
	
	
	@Select("SELECT * FROM Taboofood WHERE ${field} LIKE '%${query}%' ORDER BY regdate ASC LIMIT 10 OFFSET #{page}")
	List<Taboofood> getList(int page,@Param("query") String query, @Param("field")String field) throws ClassNotFoundException, SQLException;
	
	@Select("SELECT * FROM Taboofood WHERE id=#{id}")
	Taboofood get(int id); 
	
}
