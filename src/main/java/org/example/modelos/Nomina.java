package org.example.modelos;


import java.time.LocalDate;

public class Nomina {
    private Long idNomina;
    private LocalDate fechaEmision;
    private Integer horasTrabajadas;
    private Integer horasExtra;
    private Long idEmpleado;
    private Double salarioBasico;
    private Double bonificaciones;
    private Double deducciones;
    private Double totalPagar;
    private String notas;

    public Nomina() {
    }

    public Nomina(Long idNomina, LocalDate fechaEmision, Integer horasTrabajadas, Integer horasExtra, Long idEmpleado, Double salarioBasico, Double bonificaciones, Double deducciones, Double totalPagar, String notas) {
        this.idNomina = idNomina;
        this.fechaEmision = fechaEmision;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.idEmpleado = idEmpleado;
        this.salarioBasico = salarioBasico;
        this.bonificaciones = bonificaciones;
        this.deducciones = deducciones;
        this.totalPagar = totalPagar;
        this.notas = notas;
    }

    public Long getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Long idNomina) {
        this.idNomina = idNomina;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Integer getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(Integer horasExtra) {
        this.horasExtra = horasExtra;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(Double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public Double getBonificaciones() {
        return bonificaciones;
    }

    public void setBonificaciones(Double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }

    public Double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(Double deducciones) {
        this.deducciones = deducciones;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Nomina{" +
                "idNomina=" + idNomina +
                ", fechaEmision=" + fechaEmision +
                ", horasTrabajadas=" + horasTrabajadas +
                ", horasExtra=" + horasExtra +
                ", idEmpleado=" + idEmpleado +
                ", salarioBasico=" + salarioBasico +
                ", bonificaciones=" + bonificaciones +
                ", deducciones=" + deducciones +
                ", totalPagar=" + totalPagar +
                ", notas='" + notas + '\'' +
                '}';
    }
}
