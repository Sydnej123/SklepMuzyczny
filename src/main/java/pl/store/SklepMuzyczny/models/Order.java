package pl.store.SklepMuzyczny.models;


import lombok.Generated;

import javax.persistence.*;
import java.util.Date;

@Entity
@Generated
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long order_id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date order_date;

    @ManyToOne(fetch = FetchType.LAZY)
    private User order_user;
}
