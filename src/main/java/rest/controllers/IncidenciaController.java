package rest.controllers;

import model.services.IncidenciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import rest.dtos.*;

import javax.management.InstanceNotFoundException;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/incidencias")
public class IncidenciaController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private IncidenciaService incidenciaService;

    @GetMapping("/detallesCompra/{numeroSerieProducto}")
    public DetallesCompraDto findDetallesCompraByNumeroSerieProducto(@PathVariable String numeroSerieProducto) throws InstanceNotFoundException {

        return DetallesCompraConversor.toDetallesCompraDto(incidenciaService.findDetallesCompraByNumeroSerieProducto(numeroSerieProducto));

    }

    @PostMapping("/crearIncidencia")
    public LocalDateTime crearIncidencia(@RequestBody CrearIncidenciaParamsDto params) {

        return incidenciaService.createIncidencia(params.getDescripcion(), params.getNumeroSerieProducto(),
                params.getGarantia(), params.getCoste(), params.getAceptado());

    }

    @PostMapping("/agregarInforme/{idIncidencia}")
    public void agregarInforme(@PathVariable Long idIncidencia, @RequestBody String informe) throws InstanceNotFoundException {

        incidenciaService.agregarInforme(informe, idIncidencia);

    }

}
