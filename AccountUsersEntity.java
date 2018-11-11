package com.rabobank.account.transaction.validation.accounttransactionvalidator.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * @author Indronil Chawkroborty
 * <H1>This is the JPA Entity class in the application corressponding to the table present in the database
 * for fetching or updating data in the tables in H2 Database</H1>
 *
 */
@Entity
@Table(name = "account_users")
public class AccountUsersEntity {
	
	@Id
    @GeneratedValue
    @Column(name = "user_id", nullable = false)
    private Long userId;
 
    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public AccountDetailsMasterEnttity getAcountDetailsMasterEntity() {
		return acountDetailsMasterEntity;
	}

	public void setAcountDetailsMasterEntity(AccountDetailsMasterEnttity acountDetailsMasterEntity) {
		this.acountDetailsMasterEntity = acountDetailsMasterEntity;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getUpdation_date() {
		return updation_date;
	}

	public void setUpdation_date(Date updation_date) {
		this.updation_date = updation_date;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(name = "login_user_name", length = 50, nullable = false)
    private String customerId;
    
    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "accountUserEntity")
    private AccountDetailsMasterEnttity acountDetailsMasterEntity;

   
    @Column(name = "password", length = 10, nullable = false)
    private String password;
 
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    
    @Column(name = "address", length = 200, nullable = false)
    private String address;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date", nullable = false)
    private Date creation_date;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "updation_date", nullable = false)
    private Date updation_date;
    
    @Version
    @Column(name = "version")
    private int version;

}
