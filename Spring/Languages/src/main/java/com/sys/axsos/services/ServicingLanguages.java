package com.sys.axsos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sys.axsos.models.LangMod;
import com.sys.axsos.repositories.LangRepo;

@Service
public class ServicingLanguages {
    private final LangRepo langrr;

    public ServicingLanguages(LangRepo langrr) {
		super();
		this.langrr = langrr;
	}
    
	public List<LangMod> langs() {
    	return langrr.findAll();
    }
    // retrieves a Language
    public LangMod findLang(Long id) {
        Optional<LangMod> optionalBook = langrr.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // creates a book
    public LangMod createLang(LangMod b) {
        return langrr.save(b);
    }

	public void deleteLang(Long id) {
		langrr.deleteById(id);
		
	}
    public LangMod updateLang(LangMod b) {
    	LangMod changethisbook = findLang(b.getId());
    	changethisbook.setName(b.getName());
    	changethisbook.setCreator(b.getCreator());
    	changethisbook.setVersion(b.getVersion());
    	return langrr.save(changethisbook);
    }
}

//public class service {
//    // adding the book repository as a dependency
//    
//    public service(BookInterfaceRepo bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//    // returns all the books
//    
//    public UpdateHere updateBook(Long id, String title, String desc, String lang,Integer numOfPages) {
//    	UpdateHere changable = findBook(id);
//    	changable.setTitle(title);
//    	changable.setDescription(desc);
//    	changable.setLanguage(lang);
//    	changable.setNumberOfPages(numOfPages);
//    	return bookRepository.save(changable);
//    }

//    
//    public void deleteBook(Long id) {
//		bookRepository.deleteById(id);
//    }
//    
//}