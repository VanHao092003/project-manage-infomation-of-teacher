package com.projectmvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projectmvc.DAO.DAO;
import com.projectmvc.model.Person;
@org.springframework.stereotype.Service
public class ServiceImplmentation implements com.projectmvc.Service.Service{

	@Autowired
	DAO dao;

	@Override
	public void addTeacher(Person person) {
		dao.addTeacher(person);
	}

	@Override
	public void deleteByID(String ID) {
		dao.deleteByID(ID);
	}

	@Override
	public void updateInformation(Person person) {
		dao.updateInformation(person);
	}

	@Override
	public List<Person> showAllPersons() {
		return dao.showAllPersons();
	}


	@Override
	public Person showTeacher(String ID) {
		return dao.showTeacher(ID);
	}
}
