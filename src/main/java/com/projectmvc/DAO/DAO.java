package com.projectmvc.DAO;

import java.util.List;

import com.projectmvc.model.Person;

public interface DAO {
	public void addTeacher(Person person);
	public void deleteByID(String ID);
	public void updateInformation(Person person);
	public Person showTeacher(String ID);
	public List<Person> showAllPersons();
	public int salary();
}
