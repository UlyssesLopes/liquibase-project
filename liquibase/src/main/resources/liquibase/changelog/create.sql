--liquibase formatted sql

--changeset ulysses.lopes:1
CREATE TABLE test_table (test_id INT NOT NULL, test_column INT, PRIMARY KEY (test_id));
