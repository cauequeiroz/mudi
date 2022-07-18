package br.com.cauequeiroz.springadventure.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cauequeiroz.springadventure.model.Product;
import br.com.cauequeiroz.springadventure.model.Status;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	List<Product> findByStatus(Status status);
}
