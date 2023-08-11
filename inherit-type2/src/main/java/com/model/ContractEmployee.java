package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "contemp")
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name = "id")),
	@AttributeOverride(name = "name", column = @Column(name = "name"))
})
public class ContractEmployee extends Employee {
	double payperhour;
	String duration;
	public double getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(double payperhour) {
		this.payperhour = payperhour;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
}
