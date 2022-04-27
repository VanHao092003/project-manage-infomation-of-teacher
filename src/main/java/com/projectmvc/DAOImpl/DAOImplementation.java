package com.projectmvc.DAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.projectmvc.DAO.DAO;
import com.projectmvc.model.Person;
import com.projectmvc.personRowmapper.PersonRowMapper;
@Repository
public class DAOImplementation implements DAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addTeacher(Person person) {
		String mySQL = "insert into Person (ID, fullName, age, homeTown, hardSalary, bonus, fine) value(?,?,?,?,?,?,?)";
		jdbcTemplate.update(mySQL,person.getCode(),person.getName(),person.getAge(),person.getHomeTown(),person.getHardSalary(),person.getBonus(),person.getFine());
	}

	@Override
	public void deleteByID(String ID) {
		String mySQL = "delete from Person where ID=?";
		jdbcTemplate.update(mySQL,ID);
	}

	@Override
	public void updateInformation(Person person) {
		String mySQl = "update Person set fullName = ?, age=?, homeTown=?, hardSalary=?, bonus=?, fine=? where ID = ?";
		jdbcTemplate.update(mySQl,person.getName(),person.getAge(),person.getHomeTown(),person.getHardSalary(),person.getBonus(),person.getFine(), person.getCode());
	}

	@Override
	public List<Person> showAllPersons() {
		String mySQL = "select * from Person";
		return jdbcTemplate.query(mySQL , new PersonRowMapper());
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Person showTeacher(String ID) {
		String mySQL = "select * from Person where ID =" + ID;
		return jdbcTemplate.queryForObject(mySQL, new PersonRowMapper());	
	}
}
