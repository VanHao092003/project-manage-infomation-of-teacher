package com.projectmvc.personRowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.projectmvc.model.Person;

public class PersonRowMapper implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setCode(rs.getString("ID"));
		person.setName(rs.getString("fullName"));
		person.setAge(rs.getInt("age"));
		person.setHomeTown(rs.getString("homeTown"));
		person.setHardSalary(rs.getInt("hardSalary"));
		person.setBonus(rs.getInt("bonus"));
		person.setFine(rs.getInt("fine"));
		return person;
	}
	
}
