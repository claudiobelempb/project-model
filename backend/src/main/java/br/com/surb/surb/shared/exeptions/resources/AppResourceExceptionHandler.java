package br.com.surb.surb.shared.exeptions.resources;

import br.com.surb.surb.shared.exeptions.services.AppNotFoundException;
import br.com.surb.surb.shared.exeptions.services.AppDataBaseException;
import br.com.surb.surb.shared.exeptions.services.AppForbiddenException;
import br.com.surb.surb.shared.exeptions.services.AppUnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.time.Instant;

@ControllerAdvice
public class AppResourceExceptionHandler implements Serializable {
  private static final long serialVersionUID = 1L;
  private final AppStandarError error = new AppStandarError();

  @ExceptionHandler(AppNotFoundException.class)
  public ResponseEntity<AppStandarError> entityNotFound(
    AppNotFoundException e, HttpServletRequest request) {
    HttpStatus status = HttpStatus.NOT_FOUND;
    AppStandarError err = new AppStandarError();
    err.setTimestamp(Instant.now());
    err.setStatus(status.value());
    err.setError("Resource not found");
    err.setMessage(e.getMessage());
    err.setPath(request.getRequestURI());
    return ResponseEntity.status(status).body(err);
  }

  @ExceptionHandler(AppDataBaseException.class)
  public ResponseEntity<AppStandarError> database(AppDataBaseException e, HttpServletRequest request) {
    HttpStatus status = HttpStatus.BAD_REQUEST;
    AppStandarError err = new AppStandarError();
    err.setTimestamp(Instant.now());
    err.setStatus(status.value());
    err.setError("Database exception");
    err.setMessage(e.getMessage());
    err.setPath(request.getRequestURI());
    return ResponseEntity.status(status).body(err);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<AppValidationErrorApp> validation(
    MethodArgumentNotValidException e, HttpServletRequest request) {
    HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
    AppValidationErrorApp err = new AppValidationErrorApp();
    err.setTimestamp(Instant.now());
    err.setStatus(status.value());
    err.setError("Validation exception");
    err.setMessage(e.getMessage());
    err.setPath(request.getRequestURI());

    for (FieldError field : e.getBindingResult().getFieldErrors()) {
      err.addError(field.getField(), field.getDefaultMessage());
    }

    return ResponseEntity.status(status).body(err);
  }

  @ExceptionHandler(AppForbiddenException.class)
  public ResponseEntity<AppOAuthCustomError> forbidden(AppForbiddenException e, HttpServletRequest request) {
    HttpStatus status = HttpStatus.FORBIDDEN;
    AppOAuthCustomError customError = new AppOAuthCustomError("Forbidden", e.getMessage());
    return ResponseEntity.status(status).body(customError);
  }

  @ExceptionHandler(AppUnauthorizedException.class)
  public ResponseEntity<AppOAuthCustomError> unauthorized(AppUnauthorizedException e, HttpServletRequest request) {
    HttpStatus status = HttpStatus.UNAUTHORIZED;
    AppOAuthCustomError customError = new AppOAuthCustomError("Unauthorized", e.getMessage());
    return ResponseEntity.status(status).body(customError);
  }

}
