package btc.com.entities;

import btc.com.enums.MapFieldType;
import jakarta.persistence.*;

@Entity
@Table(name = "MapField")
public class MapField {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "type")
    private MapFieldType type;
    @Column(name = "value")
    private String value;
}
