package com.rabobank.account.transaction.validation.accounttransactionvalidator.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * @author Indronil Chawkroborty
 *         <H1>This is the JPA Entity class in the application corressponding to
 *         the table present in the database</H1>
 * 
 */
@Entity
@Table(name = "account_details_master")
public class AccountDetailsMasterEnttity {

	@Id
	@GeneratedValue
	@Column(name = "account_id", nullable = false)
	private Long accountId;

	public AccountTransactionDetailsEntity getAccountTransactionDetails() {
		return accountTransactionDetails;
	}

	public void setAccountTransactionDetails(AccountTransactionDetailsEntity accountTransactionDetails) {
		this.accountTransactionDetails = accountTransactionDetails;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public AccountUsersEntity getAccountUserEntity() {
		return accountUserEntity;
	}

	public void setAccountUserEntity(AccountUsersEntity accountUserEntity) {
		this.accountUserEntity = accountUserEntity;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "customer_id", nullable = false)
	private AccountUsersEntity accountUserEntity;

	@Column(name = "account_number", length = 50, nullable = false)
	private String accountNumber;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "accountDetailsMasterEnttity")
	private AccountTransactionDetailsEntity accountTransactionDetails;

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
