package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {

	@Column(name = "N")
	private Long id;
	private String number;
	private String street;
	@Column(length = 5)
	private String zip;
	@Column(name = "ville", unique = true)
	private String city;

	/**
	 * Constructor
	 * 
	 */
	public Address() {
		super();
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

	@Override
	public String toString() {
		return "Address [id=" + id + ", number=" + number + ", street=" + street + ", zip=" + zip + ", city=" + city
				+ "]";
	}

}
