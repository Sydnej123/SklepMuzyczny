package pl.store.SklepMuzyczny.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.store.SklepMuzyczny.models.Product;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Product, Long>, UserRepositoryCustom {
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
