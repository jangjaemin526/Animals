package com.jaemin.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jaemin.web.entity.Catrecommend;

@Mapper
public interface CatrecommendDao {

	@Select("SELECT * FROM Catrecommend WHERE ${field} LIKE '%${query}%' ORDER BY regdate ASC LIMIT 10 OFFSET #{page}")
	List<Catrecommend> getList(int page,@Param("query") String query, @Param("field")String field) throws ClassNotFoundException, SQLException;
	
	@Select("SELECT * FROM Catrecommend WHERE id=#{id}")
	Catrecommend get(int id);
	
}