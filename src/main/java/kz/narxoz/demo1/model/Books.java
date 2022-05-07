package kz.narxoz.demo1.model;

import kz.narxoz.demo1.model.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String title;

    private String author;

    private String category;

    private int year;

    @ManyToOne
    private User owner;
}
