package com.tts2.springreactapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tts2.springreactapp.repository.ContactRepository;

//tells spring to run this first
@Component
public class DemoLoader implements CommandLineRunner {
	
	@Autowired
	private final ContactRepository contactRepository;
	
	@Autowired
	public DemoLoader(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	
	//passing strings, if it has an issue it throws an exception
	//saving pre made data to ensure repository is working
	@Override
	public void run(String... strings)throws Exception {
		this.contactRepository.save(new Contact("Jake", "Wilson", "jakewilson@gmail.com"));
	}
}
