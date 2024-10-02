package org.example.modelos;

import java.time.LocalDate;

public class Empleado {
    private Long idEmpleado;
    private String nombreEmpleado;
    private String numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String correoElectronico;
    private LocalDate fechaContratacion;
    private String cargo;
    private String sucursal;
    private String estadoCivil;
    private String sexo;
    private String numeroCuenta;
    private String tipoContrato;

    public Empleado() {
    }

    public Empleado(Long idEmpleado, String nombreEmpleado, String numeroIdentificacion, LocalDate fechaNacimiento, String direccion, String ciudad, String telefono, String correoElectronico, LocalDate fechaContratacion, String cargo, String sucursal, String estadoCivil, String sexo, String numeroCuenta, String tipoContrato) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaContratacion = fechaContratacion;
        this.cargo = cargo;
        this.sucursal = sucursal;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.numeroCuenta = numeroCuenta;
        this.tipoContrato = tipoContrato;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getnombreEmpleado() {
        return nombreEmpleado;
    }

    public void setnombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", cargo='" + cargo + '\'' +
                ", sucursal='" + sucursal + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", sexo='" + sexo + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", tipoContrato='" + tipoContrato + '\'' +
                '}';
    }
}
