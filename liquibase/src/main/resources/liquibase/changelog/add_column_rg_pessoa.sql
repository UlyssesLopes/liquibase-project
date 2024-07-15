--liquibase formatted sql

--changeset ulysses.lopes:2
ALTER TABLE public.pessoa ADD COLUMN rg INT NOT NULL;