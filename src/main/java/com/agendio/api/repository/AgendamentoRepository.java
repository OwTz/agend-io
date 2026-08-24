package com.agendio.api.repository;

import com.agendio.api.models.Agendamento;
import com.agendio.api.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
