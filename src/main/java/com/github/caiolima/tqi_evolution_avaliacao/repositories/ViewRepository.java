package com.github.caiolima.tqi_evolution_avaliacao.repositories;

import com.github.caiolima.tqi_evolution_avaliacao.entities.User;
import com.github.caiolima.tqi_evolution_avaliacao.entities.ViewJoin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("viewRepository")
public interface ViewRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT u.email, e.Codigo_Emprestimo, e.total_Emprestimo, e.quant_Parcela, e.primeira_Parcela, u.renda\n" +
            "FROM emprestimo e\n" +
            "INNER JOIN User u ON e.email = u.email", nativeQuery = true)
    List<ViewJoin> join();
}
