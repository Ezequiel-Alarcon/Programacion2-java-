package Practico_5;

import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets = new ArrayList<>();

    public void agregarTicket(TicketSoporte ticket) {
        tickets.add(ticket);
    }

    public void listarTickets() {
        for (TicketSoporte t : tickets) {
            t.mostrarDetalle();
        }
    }

    public void listarTicketsAbiertos() {
        for (TicketSoporte t : tickets) {
            if (t.getEstado().equals("Abierto")) {
                t.mostrarDetalle();
            }
        }
    }

    public void listarTicketsCerrados() {
        for (TicketSoporte t : tickets) {
            if (t.getEstado().equals("Cerrado")) {
                t.mostrarDetalle();
            }
        }
    }
}
