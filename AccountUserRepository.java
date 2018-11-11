package com.rabobank.account.transaction.validation.accounttransactionvalidator.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabobank.account.transaction.validation.accounttransactionvalidator.entity.AccountUsersEntity;

/**
 * @author Indronil Chawkroborty
 *         <H1>This repository extends JpaRepository which provides most of the
 *         crud operations method required in the database</H1>
 *         <P>
 * 		</P<H1>Thus this interface currently does not carry any method
 *         because all the methods are inherited and on run time Spring AOP will
 *         use reflection and Dynamic Proxy Pattern to generate implementation
 *         for necessary crud operation for data interactions</H1>
 *         <P>
 *         <H1>This interface AccountUsersEntity on whom it will be perform the
 *         database related CRUD operations on call from service as the Generics
 *         parameter and long as the surrogate id for identifying the row which
 *         is user_id -> as the other parameter</H1>
 * 
 *
 */
public interface AccountUserRepository extends JpaRepository<AccountUsersEntity, Long> {

}
