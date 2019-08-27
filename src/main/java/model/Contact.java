package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
// utiliser au maximum javax.persistence plutôt que hibernate pour éviter adhérence
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Contact")
public class Contact implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	// @Transient
	@Temporal(TemporalType.DATE)
	private Date birth;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "address_id") // correspond au nom de colonne qui resprésente la clé étrangère de l'adresse
	private Address mainAddress;

	/**
	 * Constructor
	 * 
	 */
	public Contact() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public Contact(String name) {
		super();
		this.name = name;
	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 * @param birth
	 */
	public Contact(String name, Date birth) {
		super();
		this.name = name;
		this.birth = birth;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter
	 * 
	 * @return the birth
	 */
	public Date getBirth() {
		return birth;
	}

	/**
	 * Setter
	 * 
	 * @param birth the birth to set
	 */
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	/**
	 * Getter
	 * 
	 * @return the mainAddress
	 */
	public Address getMainAddress() {
		return mainAddress;
	}

	/**
	 * Setter
	 * 
	 * @param mainAddress the mainAddress to set
	 */
	public void setMainAddress(Address mainAddress) {
		this.mainAddress = mainAddress;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}

}
