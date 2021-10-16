package one.digitalinovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundExcpetion extends Exception {
    public PersonNotFoundExcpetion(Long id) {
        super("Person not found with ID " + id);
    }
}
