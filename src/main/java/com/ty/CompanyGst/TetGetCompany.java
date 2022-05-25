package com.ty.CompanyGst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoonebi.Pan;
import com.ty.onetoonebi.Person;

public class TetGetCompany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Company company=entityManager.find(Company.class, 1);
		System.out.println("Person Name: "+company.getName());
		System.out.println("Person Email: "+company.getWeb());
		
		Gst gst=company.getGst();
		System.out.println("Pan Address: "+gst.getGstNumber());
		System.out.println("Pan Number: "+gst.getState());
	}

}
