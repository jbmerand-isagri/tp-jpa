package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String street;
	private String zip;
	private String city;

	@OneToMany(mappedBy = "mainAddress")
	Set<Contact> contacts;

	/**
	 * Constructor
	 * 
	 */
	public Address() {
		super();
		contacts = new HashSet<>();
	}

	/**
	 * Constructor
	 * 
	 * @param number
	 * @param street
	 * @param zip
	 * @param city
	 */
	public Address(String number, String street, String zip, String city) {
		super();
		this.number = number;
		this.street = street;
		this.zip = zip;
		this.city = city;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Setter
	 * 
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * Getter
	 * 
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Setter
	 * 
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Getter
	 * 
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Setter
	 * 
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Getter
	 * 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Setter
	 * 
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Getter
	 * 
	 * @return the contacts
	 */
	public Set<Contact> getContacts() {
		return contacts;
	}

	/**
	 * Setter
	 * 
	 * @param contacts the contacts to set
	 */
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", number=" + number + ", street=" + street + ", zip=" + zip + ", city=" + city
				+ "]";
	}

}
