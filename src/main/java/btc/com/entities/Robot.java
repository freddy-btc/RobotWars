package btc.com.entities;

import btc.com.enums.Align;
import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
@Table(name = "robot")
public class Robot {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "health")
    private int health;
    @Column(name = "attack-damage")
    private int attackDamage;
    @Column(name = "attack-range")
    private int attackRange;
    @Column(name = "movement-range")
    private int movementRange;
    @Column(name = "active-items")
    private ArrayList<Item> activeItems;
}
