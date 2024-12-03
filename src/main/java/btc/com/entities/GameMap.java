package btc.com.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity(name = "GameMap")
@Table(name = "game_map")
public class GameMap {
    @Column(name = "game_map_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "width")
    private int width;

    @OneToMany(mappedBy = "gameMap", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MapField> mapFields;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public List<MapField> getMapFields() {
        return mapFields;
    }

    public void setMapFields(List<MapField> mapFields) {
        this.mapFields = mapFields;
    }
}
