package model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

	@Query("select p from Produto p where p.nome like %:nome%")
	public Iterable<Produto> searchBynameLike(@Param("Nome") String nome);

}
