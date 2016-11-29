package com.camilasport.bo.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.camilasport.bo.PersonaBO;

import com.camilasport.dm.Persona;

@Stateless
public class PersonaBOImpl implements PersonaBO {
	
	@EJB
	private PersonaBO personaBOImpl;

	@Override
	public Persona guardar(Persona persona) {
		return personaBOImpl.guardar(persona);
	}

}
