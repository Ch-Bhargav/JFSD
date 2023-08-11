package com.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("contract")
public class Contract_employee extends Employee {
	double pay_per_hour;
	String contract_period;
	public double getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(double pay_per_hour2) {
		this.pay_per_hour = pay_per_hour2;
	}
	public String getContract_period() {
		return contract_period;
	}
	public void setContract_period(String contract_period) {
		this.contract_period = contract_period;
	}
	
}
