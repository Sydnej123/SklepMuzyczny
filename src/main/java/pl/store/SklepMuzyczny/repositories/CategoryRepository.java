package pl.store.SklepMuzyczny.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.store.SklepMuzyczny.models.Product;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Product, Long>, CategoryRepositoryCustom {
    <S extends Product> S save(S s);

    <S extends Product> Iterable<S> saveAll(Iterable<S> iterable);

    Optional<Product> findById(Long aLong);

    boolean existsById(Long aLong);

    Iterable<Product> findAll();

    Iterable<Product> findAllById(Iterable<Long> iterable);

    long count();

    void deleteById(Long aLong);

    void delete(Product product);

    void deleteAll(Iterable<? extends Product> iterable);

    void deleteAll();

}