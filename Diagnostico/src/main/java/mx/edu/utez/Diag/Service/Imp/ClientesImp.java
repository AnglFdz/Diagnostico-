package mx.edu.utez.Recup.Service.Imp;

import mx.edu.utez.Recup.Model.Dao.AutoresDao;
import mx.edu.utez.Recup.Model.Dto.AutoresDto;
import mx.edu.utez.Recup.Model.Entity.AutoresBean;
import mx.edu.utez.Recup.Service.IAutores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AutoresImp implements IAutores {

    @Autowired
    private AutoresDao dao;

    @Override
    public AutoresBean save(AutoresDto lib) {
        AutoresBean autor = AutoresBean.builder()
                .id(lib.getId())
                .nombre(lib.getNombre())
                .apellido(lib.getApellido())
                .nacionalidad(lib.getNacionalidad())
                .build();
        return dao.save(autor);
    }

    @Override
    public AutoresBean findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void delete(AutoresBean lib) {
        dao.delete(lib);
    }

    @Override
    public List<AutoresBean> findAll() {
        return (List<AutoresBean>) dao.findAll();
    }
}
