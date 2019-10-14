package pl.store.SklepMuzyczny.models;


import lombok.Generated;

import javax.persistence.*;
import java.util.List;

@Entity
@Generated
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;

    @Column(length = 15)
    private String user_login;
    @Column(length = 60)
    private String user_hashed_password;
    @Column(length = 40)
    private String user_email;
    @Column(length = 50)
    private String user_street;
    @Column(length = 50)
    private String user_city;
    @Column(length = 10)
    private String user_zip_code;
    @Column(length = 20)
    private String user_name;
    @Column(length = 20)
    private String user_last_name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order_user")
    private List<Order> user_order;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "comment_id")
    private List<Comment> user_coment;
}
