package ejercicio2;

import ejercicio2.CentroComercialDTO;

import java.io.IOException;
import java.util.List;

public interface ICentrocomercial {
    CentroComercialDTO findById(int id);
    List<CentroComercialDTO> findAll() throws IOException, ClassNotFoundException;
    void save(CentroComercialDTO centro) throws IOException;
    void update(CentroComercialDTO centro) throws IOException;
    void delete(CentroComercialDTO centro) throws IOException;
}
