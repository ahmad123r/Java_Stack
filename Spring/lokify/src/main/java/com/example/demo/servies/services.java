package com.example.demo.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.models;
import com.example.demo.repo.repos;

@Service
 public class services {
	private final repos rep;
	public services(repos rep) {
		this.rep=rep;
		
	}
	public List<models> song() {
    	return rep.findAll();
    }
	
	 public models findsong(Long id) {
	        Optional<models> optionalsong = rep.findById(id);
	        if(optionalsong.isPresent()) {
	            return optionalsong.get();
	        } else {
	            return null;
	        }
	    }
	 
	 public models createsong(models b) {
	        return rep.save(b);
	    }
	 public void deleteLang(Long id) {
			rep.deleteById(id);
			
		}
	 
	 public Optional<models> findById(Long id) {

		    return rep.findById(id);
		}
	 public models findByName(String name) {
		 Optional<models> optionalBook = rep.findByName(name);
	        if(optionalBook.isPresent()) {
	            return optionalBook.get();
	        } else {
	            return null;
	        }
		}
	 public List<models> topTenByRating() {
			return rep.findTop10ByOrderByRatingDesc();
		}
}
