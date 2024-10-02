package org.example;

import org.example.modelos.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado( 1L,
                "Juan Pérez",
                "12345678",
                LocalDate.of(1990, 5, 15),
                "Av. Libertad 123",
                "Madrid",
                "+34 612 345 678",
                "juan.perez@email.com",
                LocalDate.of(2021, 3, 1),
                "Desarrollador de Software",
                "Sucursal Central",
                "Soltero",
                "Masculino",
                "ES12345678901234567890",
                "Indefinido");

        Area area1 = new Area();
        Area area2 = new Area(1L,
                "Desarrollo",
                "Encargado del desarrollo de software y mantenimiento de sistemas.",
                "Lunes a Viernes, 9:00 - 18:00",
                "Av. Innovación 456",
                "María González",
                10,
                "Incrementar la productividad en un 20% para el próximo trimestre.",
                50000.00,
                "Proyecto X, Proyecto Y",
                "Cumplir con las normativas de calidad y seguridad.");

        Beneficiario beneficiario1 = new Beneficiario();
        Beneficiario beneficiario2 = new Beneficiario(1L,
                "Ana López",
                "87654321",
                LocalDate.of(1985, 7, 22),
                "Calle del Sol 789",
                "Barcelona",
                "+34 612 987 654",
                "ana.lopez@email.com",
                "Cónyuge",
                "Femenino");

        Sucursal sucursal1 = new Sucursal();
        Sucursal sucursal2 = new Sucursal(2L,
                "Sucursal Norte",
                "Sucursal especializada en servicios de ahorro e inversiones.",
                "+34 934 567 890",
                "Avenida de la Paz 456",
                "Barcelona",
                "Carlos Ramírez",
                "Zona norte de Barcelona",
                "Cuentas de ahorro, inversiones, asesoría patrimonial",
                "Crecimiento de cartera de clientes, retorno sobre inversión");

        Nomina nomina1 = new Nomina();
        Nomina nomina2 = new Nomina(1L,
                LocalDate.of(2024, 10, 1),
                160,
                10,
                1L,
                1500.00,
                200.00,
                250.00,
                1450.00,
                "Pago correspondiente al mes de septiembre.");

        ingresarDatosEmpleado(empleado1);

    }

    public static void ingresarDatosEmpleado(Empleado empleado){
        Scanner lea = new Scanner(System.in);
        System.out.println("**********************Bienvenido a Nomina Sura by Anderson Sepulveda**********************");

        System.out.println("Por favor ingresa tu nombre:");
        empleado.setnombreEmpleado(lea.nextLine());

        System.out.println("Por favor ingresa tu numero de identificacion:");
        empleado.setNumeroIdentificacion(lea.nextLine());


        System.out.println("Por favor ingresa tu direccion:");
        empleado.setDireccion(lea.nextLine());

        System.out.println("Por favor ingresa la ciudad donde vives:");
        empleado.setCiudad(lea.nextLine());

        System.out.println("Por favor ingresa tu telefono de contacto:");
        empleado.setTelefono(lea.nextLine());

        System.out.println("Por favor ingresa tu correoElectronico:");
        empleado.setCorreoElectronico(lea.nextLine());

        System.out.println("Por favor ingresa tu cargo:");
        empleado.setCargo(lea.nextLine());

        System.out.println("Por favor ingresa La sucural:");
        empleado.setSucursal(lea.nextLine());

        System.out.println("Por favor ingresa tu estado civil:");
        empleado.setEstadoCivil(lea.nextLine());

        System.out.println("Por favor ingresa tu sexo:");
        empleado.setSexo(lea.nextLine());

        System.out.println("Por favor ingresa tu numero de cuenta bancaria:");
        empleado.setNumeroCuenta(lea.nextLine());

        System.out.println("Por favor ingresa el tipo de contrato:");
        empleado.setTipoContrato(lea.nextLine());

        Integer diaContratacion;
        Integer mesContratacion;
        Integer anioContratacion;

        Integer diaNacimiento;
        Integer mesNacimiento;
        Integer anioNacimiento;

        System.out.println("Indica el dia en que naciste");
        diaNacimiento = lea.nextInt();

        System.out.println("Indica el mes en que naciste");
        mesNacimiento = lea.nextInt();

        System.out.println("Indica el anio en que naciste");
        anioNacimiento = lea.nextInt();

        System.out.println("Indica el dia en que fuiste contratado");
        diaContratacion = lea.nextInt();

        System.out.println("Indica el mes en que fuiste contratado");
        mesContratacion = lea.nextInt();

        System.out.println("Indica el anioen que fuiste contratado");
        anioContratacion = lea.nextInt();

        empleado.setFechaContratacion(LocalDate.of(anioContratacion,mesContratacion, diaContratacion));

        empleado.setFechaNacimiento(LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento));

        System.out.println("Ingresa un id:");
        empleado.setIdEmpleado(lea.nextLong());

        System.out.println("Se ha creado un empleado con la siguinete informacion:\n\n" + empleado);
    }

}