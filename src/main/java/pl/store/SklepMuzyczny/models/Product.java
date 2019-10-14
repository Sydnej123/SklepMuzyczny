package pl.store.SklepMuzyczny.models;


import lombok.Generated;

import javax.persistence.*;

@Entity
@Generated
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;
    @Column(length = 50)
    private String product_name;
    private String product_description;
    private double product_price;
    private long comment_id_section;
    private String product_picture;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category product_category;

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", product_price=" + product_price +
                ", comment_id_section=" + comment_id_section +
                ", product_picture='" + product_picture + '\'' +
                ", product_category=" + product_category +
                '}';
    }
}
