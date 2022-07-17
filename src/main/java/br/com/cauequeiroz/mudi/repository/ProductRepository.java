package br.com.cauequeiroz.mudi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.cauequeiroz.mudi.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
