package backend.rest.dtos;

import javax.validation.constraints.NotNull;

public class AgregarInformeParamsDto {

    private String informe;

    @NotNull
    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
}
