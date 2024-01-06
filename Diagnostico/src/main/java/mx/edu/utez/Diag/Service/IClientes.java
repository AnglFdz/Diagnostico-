package mx.edu.utez.Diag.Service;

import mx.edu.utez.Diag.Model.Dto.ClientesDto;
import mx.edu.utez.Diag.Model.Entity.ClientesBean;

import java.util.List;
import java.util.Set;

public interface IClientes {
    ClientesBean save (ClientesDto cli);

    ClientesBean findById(Integer id);

    void delete(clientesBean cli);

    List<ClientesBean> findAll();
}
