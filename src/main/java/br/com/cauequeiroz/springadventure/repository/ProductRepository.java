package br.com.cauequeiroz.springadventure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cauequeiroz.springadventure.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
