package com.rabobank.account.transaction.validation.accounttransactionvalidator.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

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
@Table(name = "account_transaction_details")
public class AccountTransactionDetailsEntity {
	
	@Id
    @GeneratedValue
    @Column(name = "transaction_id", nullable = false)
    private Long transactionId;
 
	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public int getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(int transactionReference) {
		this.transactionReference = transactionReference;
	}

	public AccountUsersEntity getAccountUserEntity() {
		return accountUserEntity;
	}

	public void setAccountUserEntity(AccountUsersEntity accountUserEntity) {
		this.accountUserEntity = accountUserEntity;
	}

	public AccountDetailsMasterEnttity getAccountDetailsMasterEnttity() {
		return accountDetailsMasterEnttity;
	}

	public void setAccountDetailsMasterEnttity(AccountDetailsMasterEnttity accountDetailsMasterEnttity) {
		this.accountDetailsMasterEnttity = accountDetailsMasterEnttity;
	}

	public BigInteger getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(BigInteger startBalance) {
		this.startBalance = startBalance;
	}

	public BigDecimal getMutation() {
		return mutation;
	}

	public void setMutation(BigDecimal mutation) {
		this.mutation = mutation;
	}

	public BigDecimal getEndBalance() {
		return endBalance;
	}

	public void setEndBalance(BigDecimal endBalance) {
		this.endBalance = endBalance;
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

	@Column(name = "transaction_reference", nullable = false)
	private int transactionReference;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private AccountUsersEntity accountUserEntity;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_number", nullable = false)
    private AccountDetailsMasterEnttity accountDetailsMasterEnttity;
	
    @Column(name = "start_balance", nullable = false)
	private BigInteger startBalance;

	@Column(name = "mutation", nullable = false)
	private BigDecimal mutation;

	@Column(name = "end_balance", nullable = false)
	private BigDecimal endBalance;

    
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
