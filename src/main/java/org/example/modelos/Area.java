package org.example.modelos;

public class Area {
    private Long idArea;
    private String nombreArea;
    private String descripcionArea;
    private String horario;
    private String direccion;
    private String jefeArea;
    private Integer cantidadEmpleados;
    private String objetivos;
    private Double presupuestoAsignado;
    private String proyectosEnCurso;
    private String politicasInternas;

    public Area() {
    }

    public Area(Long idArea, String nombreArea, String descripcionArea, String horario, String direccion, String jefeArea, Integer cantidadEmpleados, String objetivos, Double presupuestoAsignado, String proyectosEnCurso, String politicasInternas) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
        this.descripcionArea = descripcionArea;
        this.horario = horario;
        this.direccion = direccion;
        this.jefeArea = jefeArea;
        this.cantidadEmpleados = cantidadEmpleados;
        this.objetivos = objetivos;
        this.presupuestoAsignado = presupuestoAsignado;
        this.proyectosEnCurso = proyectosEnCurso;
        this.politicasInternas = politicasInternas;
    }

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getDescripcionArea() {
        return descripcionArea;
    }

    public void setDescripcionArea(String descripcionArea) {
        this.descripcionArea = descripcionArea;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getJefeArea() {
        return jefeArea;
    }

    public void setJefeArea(String jefeArea) {
        this.jefeArea = jefeArea;
    }

    public Integer getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(Integer cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public Double getPresupuestoAsignado() {
        return presupuestoAsignado;
    }

    public void setPresupuestoAsignado(Double presupuestoAsignado) {
        this.presupuestoAsignado = presupuestoAsignado;
    }

    public String getProyectosEnCurso() {
        return proyectosEnCurso;
    }

    public void setProyectosEnCurso(String proyectosEnCurso) {
        this.proyectosEnCurso = proyectosEnCurso;
    }

    public String getPoliticasInternas() {
        return politicasInternas;
    }

    public void setPoliticasInternas(String politicasInternas) {
        this.politicasInternas = politicasInternas;
    }

    @Override
    public String toString() {
        return "Area{" +
                "idArea=" + idArea +
                ", nombreArea='" + nombreArea + '\'' +
                ", descripcionArea='" + descripcionArea + '\'' +
                ", horario='" + horario + '\'' +
                ", direccion='" + direccion + '\'' +
                ", jefeArea='" + jefeArea + '\'' +
                ", cantidadEmpleados=" + cantidadEmpleados +
                ", objetivos='" + objetivos + '\'' +
                ", presupuestoAsignado=" + presupuestoAsignado +
                ", proyectosEnCurso='" + proyectosEnCurso + '\'' +
                ", politicasInternas='" + politicasInternas + '\'' +
                '}';
    }
}
