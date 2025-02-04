package com.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}
	
	public void insertStrudent(Student stu) {
		String query = "insert into student values(?,?,?)";
		jdbcTemplate.update(query,stu.getSid(),stu.getSname(),stu.getMarks());
		System.out.println("Record inserted..!");
	}
	public Map<String, Object> getRecordById(int i) {
		String query = "select * from student where sid=?";
		return jdbcTemplate.queryForMap(query,i);
	
	}
	
	String query = "select * from student";
	public List<Map<String, Object>> getAllRecord() {
	return jdbcTemplate.queryForList(query);

	}

	public void deleteById(int i) {
	String query= "delete from student where sid=?";
	jdbcTemplate.update(query, i);
	System.out.println("Record Deleted..!");
	}

	public void updateStudent (Student stu) {
	String query = "update student set name=?, marks? where sid=?";
	jdbcTemplate.update(query, stu.getSname(), stu.getMarks(), stu.getSid());
	System.out.println("Record Updated..!");

	
	}
	}