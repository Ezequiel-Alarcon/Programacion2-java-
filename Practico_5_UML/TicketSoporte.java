package Practico_5_UML;

import java.time.LocalDate;

public class TicketSoporte {
    private static int contadorId = 1;

    private String id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private Tecnico tecnico;

    public TicketSoporte(String descripcion) {
        this.id = "T" + contadorId++;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    public TicketSoporte(String descripcion, Usuario usuario) {
        this(descripcion);
        this.usuario = usuario;
    }

    public void cerrarTicket() {
        estado = "Cerrado";
    }

    public void asignarTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void mostrarDetalle() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║         DETALLES DEL TICKET       ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ ID:             " + id);
        System.out.println("║ Estado:         " + estado);
        System.out.println("║ Fecha creación: " + fechaCreacion);

        if (usuario != null) {
            System.out.println("║ Usuario:         " + usuario.getNombre());
        }

        if (tecnico != null) {
            System.out.println("║ Técnico:         " + tecnico.getNombre());
        }

        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Descripción:                      ");
        System.out.println("║ " + descripcion);
        System.out.println("╚════════════════════════════════════╝");
    }
}
