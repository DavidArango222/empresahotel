package co.edu.uniquindio.empresahotel;

import co.edu.uniquindio.empresahotel.Factory.ModelFactory;
import co.edu.uniquindio.empresahotel.Model.TipoHabitacion;

public class MainEmpresaHotel {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        reservar(modelFactory);
        mostrarReservas(modelFactory);
        serviciosCliente(modelFactory);
        mostrarServiciosCliente(modelFactory);
        costoEstadia(modelFactory);
        crudCliente(modelFactory);
        crudHabitacion(modelFactory);
        crudServicio(modelFactory);
    }

    private static void crudServicio(ModelFactory modelFactory){
        crearServicio(modelFactory);
        obtenerServicio(modelFactory);
        updateServicio(modelFactory);
        eliminarServicio(modelFactory);
        System.out.println("-----------------------------------");
    }

    private static void obtenerServicio(ModelFactory modelFactory){
        String nombre = "Spa";
        int numeroHabitacion = 100;
        String dniCliente = "123456789";
        String servicio = modelFactory.obtenerServicio(nombre, numeroHabitacion, dniCliente);
        System.out.println(servicio);
    }

    private static void crearServicio(ModelFactory modelFactory) {
        String nombre = "Spa";
        int numeroHabitacion = 100;
        String dniClente = "123456789";
        boolean resultado = modelFactory.crearServicio(nombre, numeroHabitacion, dniClente);
        notificacionServicio(resultado, "crear");
    }

    private static void updateServicio(ModelFactory modelFactory){
        String nombre = "Spa";
        int numeroHabitacion = 100;
        String dniClente = "123456789";
        boolean resultado = modelFactory.updateServicio(nombre, numeroHabitacion, dniClente);
        notificacionServicio(resultado, "update");
    }

    private static void eliminarServicio(ModelFactory modelFactory){
        String nombre = "Spa";
        int numeroHabitacion = 100;
        String dniClente = "123456789";
        boolean resultado = modelFactory.eliminarServicio(nombre, numeroHabitacion, dniClente);
        notificacionServicio(resultado, "eliminar");
    }

    private static void notificacionServicio(boolean resultado, String mensaje) {
        if (resultado){
            System.out.println("Servicio " + mensaje + " correctamente. ");
        } else {
            System.out.println("Servicio NO " + mensaje + ".");
        }
    }

    private static void crudHabitacion(ModelFactory modelFactory) {
        crearHabitacion(modelFactory);
        obtenerHabitacion(modelFactory);
        updateHabitacion(modelFactory);
        eliminarHabitacion(modelFactory);
        System.out.println("-----------------------------------");
    }

    private static void obtenerHabitacion(ModelFactory modelFactory){
        int numero = 8000;
        String habitacion = modelFactory.obtenerHabitacion(numero);
        System.out.println(habitacion);
    }

    private static void crearHabitacion(ModelFactory modelFactory){
        int numero = 8000;
        TipoHabitacion tipoHabitacion = TipoHabitacion.DOBLE;
        int precio = 250;
        boolean resultado = modelFactory.crearHabitacion(numero, tipoHabitacion, precio);
        notificacionHabitacion(resultado, "creado");
    }

    private static void updateHabitacion(ModelFactory modelFactory){
        int numero = 8000;
        TipoHabitacion tipoHabitacion = TipoHabitacion.DOBLE;
        int precio = 250;
        boolean resultado = modelFactory.updateHabitacion(numero, tipoHabitacion, precio);
        notificacionHabitacion(resultado, "update");
    }

    private static void eliminarHabitacion(ModelFactory modelFactory){
        int numero = 8000;
        boolean resultado = modelFactory.eliminarHabitacion(numero);
        notificacionHabitacion(resultado, "eliminado");
    }

    private static void notificacionHabitacion(boolean resultado, String mensaje) {
        if (resultado){
            System.out.println("Habitación " + mensaje + " correctamente. ");
        } else {
            System.out.println("Habitación NO " + mensaje + ".");
        }
    }

    private static void crudCliente(ModelFactory modelFactory) {
        crearCLiente(modelFactory);
        obtenerCliente(modelFactory);
        updateCliente(modelFactory);
        eliminarCliente(modelFactory);
        System.out.println("-----------------------------------");
    }

    private static void obtenerCliente(ModelFactory modelFactory){
        String dni = "1124312510";
        String cliente = modelFactory.obtenerCliente(dni);
        System.out.println(cliente);
    }

    private static void eliminarCliente(ModelFactory modelFactory) {
        String dni = "1124312510";
        boolean resultado = modelFactory.eliminarCliente(dni);
        notificacionCliente(resultado, "eliminado");
    }

    private static void notificacionCliente(boolean resultado, String mensaje) {
        if (resultado){
            System.out.println("Cliente " + mensaje + " correctamente. ");
        } else {
            System.out.println("Cliente NO " + mensaje + ".");
        }
    }

    private static void updateCliente(ModelFactory modelFactory) {
        String nombre = "Alberto";
        String dni = "1124312510";
        boolean resultado = modelFactory.updateCliente(nombre, dni);
        notificacionCliente(resultado, "update");
    }

    private static void crearCLiente(ModelFactory modelFactory) {
        String nombre = "Anderson";
        String dni = "1124312510";
        boolean resultado = modelFactory.crearCliente(nombre, dni);
        notificacionCliente(resultado, "creado");
    }

    private static void reservar(ModelFactory modelFactory){
        String dni = "1124312515";
        String dniReserva = "0003";
        modelFactory.reservar(dni, dniReserva);
    }

    private static void mostrarReservas(ModelFactory modelFactory){
        modelFactory.mostrarReservas();
    }

    private static void serviciosCliente(ModelFactory modelFactory){
        System.out.println("---------------------------------------");
        String dni = "123456789";
        int numeroHabitacion = 100;
        int opcion = 4;
        String nombreServicio = "Masaje especial";
        modelFactory.serviciosCliente(dni, numeroHabitacion, opcion, nombreServicio);
        System.out.println("--------------------------------------");
    }

    private  static void mostrarServiciosCliente(ModelFactory modelFactory){
        String dni = "123456789";
        int habitacionNumero = 100;
        modelFactory.mostrarServiciosCliente(dni, habitacionNumero);
        System.out.println("--------------------------------------");
    }

    private static void costoEstadia(ModelFactory modelFactory){
        String dni = "123456789";
        String idReserva = "0001";
        modelFactory.costoEstadia(dni, idReserva);
        System.out.println("-------------------------------------");
    }

}
