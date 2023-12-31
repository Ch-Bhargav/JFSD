package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "regemp")
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name = "id")),
	@AttributeOverride(name = "name", column = @Column(name = "name"))
})
public class RegularEmployee extends Employee {
	double salary;
	int bonus;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
