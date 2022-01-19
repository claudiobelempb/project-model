package br.com.surb.surb.shared.util.validator;

import br.com.surb.surb.shared.exeptions.controllers.FieldMessage;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class UtilValidator implements ConstraintValidator<UtilValid, UtilValidator> {

/*
  @Override
  public void initialize(UtilValidator ann) {
  }
*/

  @Override
  public boolean isValid(UtilValidator validator, ConstraintValidatorContext context) {

    List<FieldMessage> list = new ArrayList<>();

    // Coloque aqui seus testes de validação, acrescentando objetos FieldMessage à lista

    for (FieldMessage e : list) {
      context.disableDefaultConstraintViolation();
      context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
        .addConstraintViolation();
    }
    return list.isEmpty();
  }
}
