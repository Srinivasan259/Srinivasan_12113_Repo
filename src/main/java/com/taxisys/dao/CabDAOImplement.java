package com.taxisys.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taxisys.enity.Cab;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CabDAOImplement implements CabDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Cab addcab(Cab cab) {
		Cab c=new Cab();
		
		 entityManager.persist(cab);
		 return cab;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cab> getAllCab() {
		return entityManager.createQuery("from Cab").getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cab> findCabPickup(String pickupLocation) {
		Query query1 = entityManager.createQuery("select c from Cab c where LOWER (pickupLocation) LIKE CONCAT('%',:plocation,'%')");
		query1.setParameter("plocation", pickupLocation);
		 
		return query1.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cab> findCabDrop(String dropLocation) {
		Query query2 = entityManager.createQuery("select c from Cab c where LOWER (dropLocation) LIKE CONCAT('%',:dlocation,'%')");
		query2.setParameter("dlocation", dropLocation);
		
		return query2.getResultList();
	}

	@Override
	public Cab findByCabId(int cabId) {
		return entityManager.find(Cab.class, cabId);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> findAllCabIds() {
		Query q = entityManager.createQuery("SELECT c.cabId FROM Cab c");
		
		return  q.getResultList();
	}

}
