package rest.dtos;

import model.entities.Incidencia;

public class IncidenciaConversor {

    private IncidenciaConversor() {
    }

    public final static IncidenciaDto toIncidenciaDto(Incidencia incidencia) {

        return new IncidenciaDto(incidencia.getId(), incidencia.getDescripcion(), incidencia.getNumeroSerieProducto(),
                incidencia.getGarantia(), incidencia.getCoste(), incidencia.getAceptado(), incidencia.getFechaCita().toString(),
                incidencia.getInforme());
    }
}
