package com.example.LoginRegstraion.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.LoginRegstraion.models.User;

@Component
public class UserValidator implements Validator {
    
//    // 1
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
//    
    // 2
    @Override
    public void validate(Object target, Errors errors) {
        User user= (User) target;
        
        if (!(user.getPasswordConfirmation()==user.getPassword())) {
            // 3
            errors.rejectValue("passwordConfirmation", "Match");
        }         
    }

	
}