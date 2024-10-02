package org.example.modelos;

public class Sucursal {
    private Long idSucursal;
    private String nombreSucursal;
    private String descripcionSucursal;
    private String telefonoContacto;
    private String direccion;
    private String ciudad;
    private String gerenteSucursal;
    private String zonaCobertura;
    private String serviciosOfrecidos;
    private String metricasKPI;

    public Sucursal() {
    }

    public Sucursal(Long idSucursal, String nombreSucursal, String descripcionSucursal, String telefonoContacto, String direccion, String ciudad, String gerenteSucursal, String zonaCobertura, String serviciosOfrecidos, String metricasKPI) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.descripcionSucursal = descripcionSucursal;
        this.telefonoContacto = telefonoContacto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.gerenteSucursal = gerenteSucursal;
        this.zonaCobertura = zonaCobertura;
        this.serviciosOfrecidos = serviciosOfrecidos;
        this.metricasKPI = metricasKPI;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDescripcionSucursal() {
        return descripcionSucursal;
    }

    public void setDescripcionSucursal(String descripcionSucursal) {
        this.descripcionSucursal = descripcionSucursal;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getGerenteSucursal() {
        return gerenteSucursal;
    }

    public void setGerenteSucursal(String gerenteSucursal) {
        this.gerenteSucursal = gerenteSucursal;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public String getServiciosOfrecidos() {
        return serviciosOfrecidos;
    }

    public void setServiciosOfrecidos(String serviciosOfrecidos) {
        this.serviciosOfrecidos = serviciosOfrecidos;
    }

    public String getMetricasKPI() {
        return metricasKPI;
    }

    public void setMetricasKPI(String metricasKPI) {
        this.metricasKPI = metricasKPI;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "idSucursal=" + idSucursal +
                ", nombreSucursal='" + nombreSucursal + '\'' +
                ", descripcionSucursal='" + descripcionSucursal + '\'' +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", gerenteSucursal='" + gerenteSucursal + '\'' +
                ", zonaCobertura='" + zonaCobertura + '\'' +
                ", serviciosOfrecidos='" + serviciosOfrecidos + '\'' +
                ", metricasKPI='" + metricasKPI + '\'' +
                '}';
    }
}
