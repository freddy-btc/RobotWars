package btc.com.entities;

import btc.com.enums.Align;
import btc.com.enums.MapFieldType;
import jakarta.persistence.*;

@Entity(name = "MapField")
@Table(name = "map_field")
public class MapField {
    @Column(name = "map_field_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private MapFieldType type;
    @Column(name = "value")
    private String value;
    @Column(name = "align")
    @Enumerated(EnumType.STRING)
    private Align align;
    @ManyToOne
    @JoinColumn(name = "game_map_id") // Foreign key for GameMap
    private GameMap gameMap;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MapFieldType getType() {
        return type;
    }

    public void setType(MapFieldType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }
}
