package mx.edu.utez.Diag.Controller;

import mx.edu.utez.Diag.Model.Dto.ClientesDto;
import mx.edu.utez.Diag.Model.Entity.ClientesBean;
import mx.edu.utez.Diag.Service.IClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/v1/clientes")
public class ClientesController  {

    @Autowired
    private IClientes au;

    @GetMapping("/")
    @Transactional(readOnly = true)
    public List<ClientesBean> getClientes(){
        return au.findAll();
    }

    @GetMapping("/{id}")
    @Transactional(readOnly = true)
    public AutoresBean showById(@PathVariable Integer id){
        return au.findById(id);
    }
    @PostMapping("/")
    @Transactional
    public ClientesDto create(@RequestBody ClientesDto cli){
        ClientesBean client = au.save(cli);
        return ClientesDto.builder()
                .id(autor.getId())
                .nombre(client.getNombre())
                .apellido(client.getApellido())
		.curp(client.getCurp)
                .fechaNac(client.getFechaNac())
                .build();
    }
    @PutMapping("/")
    @Transactional
    public AutoresDto update(@RequestBody ClientesDto cli){
        ClientesBean client = au.save(cli);
        return ClientesDto.builder()
                .id(autor.getId())
                .nombre(client.getNombre())
                .apellido(client.getApellido())
		.curp(client.getCurp)
                .fechaNac(client.getFechaNac())
                .build();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Integer id){
        ClientesBean cli = au.findById(id);
        au.delete(cli);
    }
}
