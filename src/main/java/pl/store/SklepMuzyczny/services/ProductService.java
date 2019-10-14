package pl.store.SklepMuzyczny.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.store.SklepMuzyczny.models.Product;
import pl.store.SklepMuzyczny.repositories.ProductRepository;

@Service
public class ProductService implements IProductService{
    @Autowired
    ProductRepository productRepository;


    @Override
    public Product getProductById(Long id) {

        return productRepository.findById(id).get();
    }
}
