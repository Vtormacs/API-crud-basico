package crud.basico.crud.Service;

import crud.basico.crud.Entity.Carro;
import crud.basico.crud.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public String save(Carro carro) {

        this.carroRepository.save(carro);

        return "Carro salvo no banco";
    }

    public String update(Carro carro, long id) {

        carro.setId(id);
        this.carroRepository.save(carro);

        return "Carro atualiado com sucesso!";
    }

    public String delete(long id) {

        this.carroRepository.deleteById(id);

        return "Carro deletado";
    }

    public List<Carro> findAll() {

        List<Carro> lista = this.carroRepository.findAll();

        return lista;
    }

    public Carro findById(long id) {

        Carro carro = this.carroRepository.findById(id).get();

        return carro;
    }
}
