package btc.com.entities;
import jakarta.persistence.*;

import java.awt.*;
@Entity
@Table(name = "map")
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "width")
    private int width;
    @Column(name = "map")
    private MapField[] map;

}
