package ejercicio2;

import java.io.IOException;
import java.util.List;

public abstract class ICentrocomercial {
    public abstract CentroComercialDTO findById(int id);

    public abstract List<CentroComercialDTO> findAll() throws IOException, ClassNotFoundException;

    public abstract void save(CentroComercialDTO centro) throws IOException;

    public abstract void update(CentroComercialDTO centro) throws IOException;

    public abstract void delete(CentroComercialDTO centro) throws IOException;
}
