package grupo25.reto3.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import grupo25.reto3.interfaces.InterfaceReservacion;
import grupo25.reto3.modelo.Reservacion;

@Repository
public class RepositorioReservacion {
    @Autowired
    private InterfaceReservacion crud4;
    
    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud4.findAll();
    }
    public Optional<Reservacion> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservacion save(Reservacion reservacion){
        return crud4.save(reservacion);
    }
     public void delete(Reservacion reservacion){
        crud4.delete(reservacion);
    }
}
