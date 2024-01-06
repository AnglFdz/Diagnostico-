package mx.edu.utez.Diag.Model.Dao;

import mx.edu.utez.Recup.Model.Entity.ClientesBean;
import org.springframework.data.repository.CrudRepository;

public interface AutoresDao extends CrudRepository<ClientesBean, Integer> {
}
