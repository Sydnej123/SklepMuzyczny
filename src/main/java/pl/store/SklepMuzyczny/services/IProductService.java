package pl.store.SklepMuzyczny.services;

import pl.store.SklepMuzyczny.models.Product;

public interface IProductService {
    Product getProductById(Long id);
}
