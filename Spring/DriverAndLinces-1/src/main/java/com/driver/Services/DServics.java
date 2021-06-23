package com.driver.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.driver.models.Lin;
import com.driver.models.Person;
import com.driver.repo.Repo;
import com.driver.repo.Repo2;


@Service
public class DServics {
	private final Repo person;
	private final Repo2 lin;

	public DServics(Repo person,Repo2 lin) {
		
		this.person = person;
		this.lin=lin;
	}
	public List<Person> findAll() {
		return person.findAll();
	}
	public Person createP(Person p) {
		return person.save(p);
	}
	public List<Lin> findAllR() {
		return lin.findAll();
		
	}
	public Lin createLin(Lin b) {
		return lin.save(b);
		
	}
	
	 public Person findBook(Long id) {
	        Optional<Person> optionalBook = person.findById(id);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
	    }
	 public int generateLicenseNumber() {
			Lin l= lin.findTopByOrderByNumberDesc();
			if(l == null)
				return 1;
			int largestNumber = l.getNumber();
			largestNumber++;
			return (largestNumber);
		}
	

}
