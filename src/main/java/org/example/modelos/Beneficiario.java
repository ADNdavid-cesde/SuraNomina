package org.example.modelos;

import java.time.LocalDate;

public class Beneficiario {
    private Long idBeneficiario;
    private String nombrebeneficiario;
    private String numeroIdentificacion;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String correoElectronico;
    private String parentesco;
    private String sexo;

    public Beneficiario() {
    }

    public Beneficiario(Long idBeneficiario, String nombrebeneficiario, String numeroIdentificacion, LocalDate fechaNacimiento, String direccion, String ciudad, String telefono, String correoElectronico, String parentesco, String sexo) {
        this.idBeneficiario = idBeneficiario;
        this.nombrebeneficiario = nombrebeneficiario;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.parentesco = parentesco;
        this.sexo = sexo;
    }

    public Long getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(Long idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public String getNombrebeneficiario() {
        return nombrebeneficiario;
    }

    public void setNombrebeneficiario(String nombrebeneficiario) {
        this.nombrebeneficiario = nombrebeneficiario;
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

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "idBeneficiario=" + idBeneficiario +
                ", nombrebeneficiario='" + nombrebeneficiario + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", parentesco='" + parentesco + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
