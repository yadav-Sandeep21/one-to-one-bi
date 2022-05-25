package com.ty.CompanyGst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetGst {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Gst gst=entityManager.find(Gst.class, 1);
		System.out.println("Gst Number: "+gst.getGstNumber());
		System.out.println("Gst State: "+gst.getState());
		
		Company company=gst.getCompany();
		System.out.println("Pan Address: "+company.getName());
		System.out.println("Comapny Website:"+company.getWeb());
	}

}
