package cpa.cmm.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cpa.cmm.CategoryValid;

public class CategoryValidator  implements ConstraintValidator<CategoryValid, String>{

	@Override
	public void initialize(CategoryValid constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		
		
		return false;
	}

}
