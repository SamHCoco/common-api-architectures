--CREATE DATABASE IF NOT EXISTS appdb;
--
--USE appdb;

DROP TABLE IF EXISTS user_account;

CREATE TABLE user_account (
  id int primary key,
  first_name varchar(255) NOT NULL,
  last_name varchar(255) NOT NULL,
  email_address VARCHAR(255) NOT NULL
);