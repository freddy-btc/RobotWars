package btc.com.entities;

import jakarta.persistence.*;

@Entity(name = "Game")
@Table(name = "game")
public class Game {
    @Column(name= "game_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "round")
    private int round;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "game_map_id", referencedColumnName = "game_map_id")
    private GameMap gameMap;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }
}
