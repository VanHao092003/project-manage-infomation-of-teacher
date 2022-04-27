package com.projectmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projectmvc.Service.Service;
import com.projectmvc.model.Person;
@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	Service service;
	
	@RequestMapping(value = "/showAllPerson", method = RequestMethod.GET)
	public String showAllPreson(HttpServletRequest request) {
		List<Person> persons = service.showAllPersons();
		request.setAttribute("persons", persons);
		return"showAllPerson";
	}
	
	@RequestMapping(value = "/addPerson", method = RequestMethod.GET)
	public String addPerson(HttpServletRequest request) {
		request.setAttribute("person", new Person());
		return"addPerson";
	}
	
	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public String addPerson(HttpServletRequest request, @ModelAttribute("person") @Valid Person person, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "addPerson";
		}
		service.addTeacher(person);
		return"redirect:/showAllPerson";
	}
	
	@RequestMapping(value="/chi-tiet-nguoi-dung/{person}", method = RequestMethod.GET)
	public String showPeronsByID(HttpServletRequest request, @PathVariable("person") String ID) {
		Person person = service.showTeacher(ID);
		request.setAttribute("person1", person);
		return"viewsPerson";
	}
	
	@RequestMapping(value = "/delete/{ID}", method = RequestMethod.GET)
	public String deletePerson(HttpServletRequest request, @PathVariable("ID") String ID) {
		service.deleteByID(ID);
		return "redirect:/showAllPerson";
	}
	
	@RequestMapping(value="/update/{ID}", method = RequestMethod.GET)
	public String updatePerson(HttpServletRequest httpServletRequest, @PathVariable("ID") String ID) {
		Person person = service.showTeacher(ID);
		httpServletRequest.setAttribute("person2", person);
		return"update";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String updatePerson(HttpServletRequest httpServletRequest, @ModelAttribute("person2") @Valid Person person, BindingResult 
			bindingResult) {
		if(bindingResult.hasErrors()) {
			return"update";
		}
		service.updateInformation(person);
		return"redirect:/showAllPerson";
	}
	
	
	
	
}
