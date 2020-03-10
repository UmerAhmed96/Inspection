package com.example.Practice1.Validator;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
public interface ValidatorErrorCodeService  {

    ResponseEntity checkErrorMessages(BindingResult bindingResult);
}
