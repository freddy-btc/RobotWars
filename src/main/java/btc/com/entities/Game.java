package btc.com.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "round")
    private int round;
    @Column(name = "map")
    private Map map;

}
