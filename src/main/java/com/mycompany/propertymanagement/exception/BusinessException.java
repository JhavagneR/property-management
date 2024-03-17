package com.mycompany.propertymanagement.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BusinessException extends RuntimeException{
    private List<ErrorModel> errors;
    public BusinessException(){}
    public BusinessException(List<ErrorModel> errors){
        this.errors = errors;
    }

}
