Drop Table if Exists account_users;
create table account_users
(
user_id int not null auto_increment,
login_user_name varchar(30) NOT NULL, /* This is the customer id with which the customer will use his mobile or Internet account */
user_name varchar(100) NOT NULL,
password varchar(10) NOT NULL,
date_of_birth date NOT NULL,
address varchar(200) NOT NULL,
creation_date date NOT NULL,
updation_date date NULL,
version int NOT NULL,
 primary key(login_user_name)
);

Drop Table if Exists account_details_master;
create table account_details_master
(
account_id int not null auto_increment,
customer_id varchar(30) NOT NULL,
account_number varchar(50) NOT NULL,
account_type varchar(15) NOT NULL,
balance number NOT NULL,
creation_date date NOT NULL,
updation_date date NULL,
version int NOT NULL,
 primary key(account_number)
);
/* Although this could have been done along with the table, but as the table was created when I missed it, 
I had created it as a two step process with alter table statement */
 ALTER TABLE account_details_master  ADD FOREIGN KEY (customer_id)  REFERENCES account_users(login_user_name);

 
Drop Table if Exists account_transaction_details;
create table account_transaction_details
(
transaction_id int not null auto_increment,
transaction_reference int null,
account_number varchar(50) NOT NULL,
customer_id varchar(30) NOT NULL,
start_balance number not null,
mutation number null,
end_balance number null,
creation_date date NOT NULL,
updation_date date NULL,
version int NOT NULL,
primary key(transaction_reference)
);

/* Although this could have been done along with the table, but I preferred two step process for setting relationship with table */
 ALTER TABLE account_transaction_details  ADD FOREIGN KEY (customer_id)  REFERENCES account_users(login_user_name);
 ALTER TABLE account_transaction_details  ADD FOREIGN KEY (account_number)  REFERENCES account_details_master(account_number);
 