package btc.com.entities;

import btc.com.enums.ItemType;
import jakarta.persistence.*;

@Entity(name ="Item")
@Table(name = "item")
public class Item {
    @Column(name ="item_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ItemType type;
    @Column(name = "value")
    private int value;
    @Column(name = "duration")
    private int duration;
    @ManyToOne
    @JoinColumn(name="robot_id", nullable=true)
    private Robot robot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}