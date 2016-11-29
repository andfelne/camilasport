package org.camilasport.bo;

import javax.ejb.Local;

import com.camilasport.dm.Persona;

@Local
public interface PersonaBO {
	
	public Persona guardar(Persona persona); 

}
