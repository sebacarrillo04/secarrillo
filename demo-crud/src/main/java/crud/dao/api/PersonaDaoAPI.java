package crud.dao.api;

import org.springframework.data.repository.CrudRepository;

import crud.model.Persona;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
