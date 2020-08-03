package com.jaemin.web.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jaemin.web.entity.Job;

@Mapper
public interface JobDao {

	@Select("SELECT * FROM Job WHERE ${field} LIKE '%${query}%' ORDER BY regdate ASC LIMIT 10")
	List<Job> getList(int page,@Param("query") String query, @Param("field")String field) throws ClassNotFoundException, SQLException;

	@Select("SELECT * FROM Job WHERE id=#{id}")
	Job get(int id); 
}
