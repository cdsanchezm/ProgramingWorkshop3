package co.edu.unbosque.Controller;

import java.sql.Date;
import java.util.Calendar;

public class case_information {
	
	private String typology;
	private String species;
	private String size;
	private String locality;
	private String address;
	private String full_Name_Owner;
	private String telephone;
	private String email;
	private String comments;
	private String fecha;
	/**
     * @param typology
	 * @param species
	 * @param size
	 * @param locality
	 * @param address
	 * @param full_Name
	 * @param telephone
	 * @param email
	 * @param comments
	 * @param calendario
	 */
	public case_information(String typology, String species, String size, String locality, String address,
			String full_Name_Owner, String telephone, String email, String comments, String fecha) {
		super();
		this.typology = typology;
		this.species = species;
		this.size = size;
		this.locality = locality;
		this.address = address;
		this.full_Name_Owner = full_Name_Owner;
		this.telephone = telephone;
		this.email = email;
		this.comments = comments;
		this.fecha = fecha;
	}
	

	/**
	 * @return the typology
	 */
	public String getTypology() {
		return typology;
	}

	/**
	 * @param typology the typology to set
	 */
	public void setTypology(String typology) {
		this.typology = typology;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * @param locality the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the full_Name
	 */
	public String getFull_Name_Owner() {
		return full_Name_Owner;
	}

	/**
	 * @param full_Name the full_Name to set
	 */
	public void setFull_Name_Owner(String full_Name_Owner) {
		this.full_Name_Owner = full_Name_Owner;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	
	

    
	
	
	
}
