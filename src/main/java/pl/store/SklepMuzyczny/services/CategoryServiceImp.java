package pl.store.SklepMuzyczny.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.store.SklepMuzyczny.repositories.CategoryRepository;

@Service
public class CategoryServiceImp {

    @Autowired
    CategoryRepository categoryRepository;


}
