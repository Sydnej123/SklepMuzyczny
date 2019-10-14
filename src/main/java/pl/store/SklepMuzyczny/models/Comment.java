package pl.store.SklepMuzyczny.models;


import lombok.Generated;

import javax.persistence.*;
import java.util.Date;

@Entity
@Generated
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long comment_id;
    @ManyToOne(fetch = FetchType.LAZY)
    private User comment_author;
    @Column(length = 255)
    private String comment_content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date comment_date;
    private int comment_rate;
}
