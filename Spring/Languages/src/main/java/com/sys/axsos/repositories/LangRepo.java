package com.sys.axsos.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sys.axsos.models.LangMod;


@Repository
public interface LangRepo extends CrudRepository<LangMod, Long>{
 // this method retrieves all the books from the database
 List<LangMod> findAll();
  // this method finds books with descriptions containing the search string
 List<LangMod> findByCreatorContaining(String search);
 // this method counts how many titles contain a certain string
 Long countByNameContaining(String search);
 // this method deletes a book that starts with a specific title
 Long deleteByNameStartingWith(String search);
}
