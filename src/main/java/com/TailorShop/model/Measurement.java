package com.TailorShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
	public class Measurement {
	    @Id @GeneratedValue
	    private Long id;
	    private double chest;
	    private double waist;
	    private double sleeve;
	    private double length;

	    @OneToOne
	    @JoinColumn(name = "customer_id")
	    private Customer customer;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public double getChest() {
			return chest;
		}

		public void setChest(double chest) {
			this.chest = chest;
		}

		public double getWaist() {
			return waist;
		}

		public void setWaist(double waist) {
			this.waist = waist;
		}

		public double getSleeve() {
			return sleeve;
		}

		public void setSleeve(double sleeve) {
			this.sleeve = sleeve;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

	    
	}


