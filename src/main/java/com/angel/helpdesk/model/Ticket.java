package com.angel.helpdesk.model;

import com.angel.helpdesk.enums.EstadoTicket;
import com.angel.helpdesk.enums.PrioridadTicket;

import java.time.LocalDateTime;
import java.util.List;

public class Ticket {
    private Usuario usuario;
    private Usuario tecnico;
    private String titulo;
    private String descripcion;
    private Long id;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaFinalizado;
    private EstadoTicket estado;
    private PrioridadTicket prioridad;
    private List<Comentario> comentarios;
}
