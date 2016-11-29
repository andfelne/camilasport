package org.camilasport.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;

import org.camilasport.bo.PersonaBO;

import com.camilasport.dm.Persona;

@Stateless
@ManagedBean
public class PersonaController {
	
	@EJB
	private PersonaBO personaBOImpl;

	private Persona persona = new Persona();

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

}
