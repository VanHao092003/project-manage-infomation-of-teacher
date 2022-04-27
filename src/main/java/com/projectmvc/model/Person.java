package com.projectmvc.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Person {
	@NotEmpty
    private String name;
	@NotNull
    private int age;
	@NotEmpty
    private String homeTown;
	@Length(min = 8, max = 8)
    private String code;
	@NotNull
    protected int hardSalary;
    protected int bonus;
    protected int fine;

    

    public Person() {
		super();
	}
	public Person(String name, int age, String homeTown, String code, int hardSalary, int bonus, int fine) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.code = code;
        this.hardSalary = hardSalary;
        this.bonus = bonus;
        this.fine = fine;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getHomeTown() {
        return homeTown;
    }
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getHardSalary() {
        return hardSalary;
    }
    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getFine() {
        return fine;
    }
    public void setFine(int fine) {
        this.fine = fine;
    }
    
    @Override
    public String toString() {
        return "Information of teacher[ name: " + name + ", age: " + age + ", home town: " + homeTown + ", code: " + code + ", hard salary: "+ hardSalary + ", bonus salary: " + bonus + ", fine: " + fine + "]"; 
    }
}


