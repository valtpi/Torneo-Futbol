package Torneo.Futbol.Repositorio;

import Torneo.Futbol.Modelo.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepositorio extends CrudRepository<Equipo,Integer> {
}
