package btc.com.entities;

import btc.com.enums.ItemType;
import jakarta.persistence.*;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "type")
    private ItemType type;
    @Column(name = "value")
    private int value;
    @Column(name = "duration")
    private int duration;
}
