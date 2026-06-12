package com.angel.helpdesk.model;

import java.time.LocalDateTime;

public class Comentario {
    private Usuario usuario;
    private Ticket ticket;
    private String comentario;
    private LocalDateTime fechaPublicado;
}
