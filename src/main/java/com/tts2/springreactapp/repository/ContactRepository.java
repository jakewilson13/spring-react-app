package com.tts2.springreactapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts2.springreactapp.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {

}