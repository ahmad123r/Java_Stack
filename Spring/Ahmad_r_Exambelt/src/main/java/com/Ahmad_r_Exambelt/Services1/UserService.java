package com.Ahmad_r_Exambelt.Services1;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Ahmad_r_Exambelt.Repo.UserRepository;
import com.Ahmad_r_Exambelt.models.User;

import org.mindrot.jbcrypt.BCrypt;

@Service
public class UserService {
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    
    public User findUserById(Long id) {
    	Optional<User> u = userRepository.findById(id);
    	
    	if(u.isPresent()) {
            return u.get();
    	} else {
    	    return null;
    	    
    	}  
    }

    public boolean authenticateUser(String email, String password) {
        
        User user = userRepository.findByEmail(email);
        
        if(user == null) {
            return false;
        } else {

            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            } else {
                return false;
            }
        }
    }
    public void updateUser(User user) {
    	userRepository.save(user);
    }
}

