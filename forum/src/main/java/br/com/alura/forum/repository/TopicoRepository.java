package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findByCurso_Nome(String nomeCurso);

    // Segunda forma sem utilizar diretamente o spring data
   /* @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso ")
    List<Topico> carregarPorNomedoCurso(@Param("nomeCurso") String nomeCurso); */

}
