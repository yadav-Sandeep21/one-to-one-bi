package com.ty.CompanyGst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCompanyGst {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Company company=new Company();
		company.setName("Test Yantra");
		company.setWeb("iKare");
		
		Gst gst=new Gst();
		gst.setGstNumber(21);
		gst.setState("Karnataka");
		
		gst.setCompany(company);
		company.setGst(gst);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
