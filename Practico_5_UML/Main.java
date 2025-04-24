package Practico_5_UML;

public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario(1, "Carlos Pérez", "carlos@example.com");
        Usuario usuario2 = new Usuario(2, "Laura Gómez", "laura@example.com");
        Usuario usuario3 = new Usuario(3, "José Martínez", "jose@example.com");
        Usuario usuario4 = new Usuario(4, "Ana Ruiz", "ana@example.com");

        // Crear técnicos
        Tecnico tecnico1 = new Tecnico(1, "Ana López", "Redes");
        Tecnico tecnico2 = new Tecnico(2, "Marcos Díaz", "Sistemas");

        // Crear tickets
        TicketSoporte ticket1 = new TicketSoporte("No puedo conectarme a internet", usuario1);
        ticket1.asignarTecnico(tecnico1);
        ticket1.cerrarTicket();

        TicketSoporte ticket2 = new TicketSoporte("Error al abrir un archivo", usuario2);
        ticket2.asignarTecnico(tecnico2);

        TicketSoporte ticket3 = new TicketSoporte("Problema con impresora", usuario3);
        ticket3.asignarTecnico(tecnico1);
        ticket3.cerrarTicket();

        TicketSoporte ticket4 = new TicketSoporte("Sistema se reinicia solo", usuario4);
        // Este queda sin técnico

        // Agregar al sistema
        SistemaSoporte sistema = new SistemaSoporte();
        sistema.agregarTicket(ticket1);
        sistema.agregarTicket(ticket2);
        sistema.agregarTicket(ticket3);
        sistema.agregarTicket(ticket4);

        // Mostrar todos los tickets
        sistema.listarTickets();
    }
}
