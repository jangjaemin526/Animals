package com.jaemin.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jaemin.web.entity.Gosumdochirecommend;

@Mapper
public interface GosumdochirecommendDao {

	@Select("SELECT * FROM Gosumdochirecommend WHERE ${field} LIKE '%${query}%' ORDER BY regdate ASC LIMIT 10 OFFSET #{page}")
	List<Gosumdochirecommend> getList(int page,@Param("query") String query, @Param("field")String field) throws ClassNotFoundException, SQLException;
	
	@Select("SELECT * FROM Gosumdochirecommend WHERE id=#{id}")
	Gosumdochirecommend get(int id);
	
}