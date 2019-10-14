package pl.store.SklepMuzyczny.models;

import lombok.Generated;

import javax.persistence.*;
import java.util.List;

@Entity
@Generated
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long category_id;
    private String category_icon;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product_category")
    private List<Product> category_products;
}
