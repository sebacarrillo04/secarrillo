package crud.dao.api;

import org.springframework.data.repository.CrudRepository;

import crud.model.Usuario;

public interface UsuarioDaoAPI extends CrudRepository<Usuario, Long> {

	Usuario findByUsuario(String usuario);
}
