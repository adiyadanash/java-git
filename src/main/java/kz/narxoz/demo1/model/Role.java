package kz.narxoz.demo1.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="roles")

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;


}
