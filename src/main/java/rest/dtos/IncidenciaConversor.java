package rest.dtos;

public class IncidenciaConversor {

    private IncidenciaConversor() {
    }

    public final static IncidenciaDto toIncidenciaDto(Incidencia incidencia) {

        return new IncidenciaDto(incidencia.getId(), incidencia.getDescripcion(), incidencia.getNumeroSerieProducto(),
                incidencia.getGarantia() ? 1 : 0, incidencia.getCoste(), incidencia.getAceptado() ? 1 : 0, incidencia.getFechaCita().toString(),
                incidencia.getInforme());
    }
}
