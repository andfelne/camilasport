package com.camilasport.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.camilasport.dao.PersonaDAO;

import com.camilasport.dm.Persona;

public class PersonaDAOImpl implements PersonaDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Persona guardar(Persona persona) {
		em.persist(persona);
		return persona;
	}

}
