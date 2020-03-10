package com.example.Practice1.Validator;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

@Service
public class ValidatorErrorCodeImpl  implements ValidatorErrorCodeService {

    public ResponseEntity checkErrorMessages(BindingResult bindingResult) {

        List<ObjectError> obj = bindingResult.getAllErrors();
        List<String> errors = new ArrayList<>();

        for (ObjectError error : obj) {
            errors.add(error.getDefaultMessage());
        }
        return ResponseEntity.badRequest().body(errors);
    }
}
