package btc.com;

import btc.com.entities.*;
import btc.com.enums.Align;
import btc.com.enums.MapFieldType;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        try (Session session = factory.openSession()) {
            session.beginTransaction();

            // Create MapField objects
            MapField field1 = new MapField();
            field1.setType(MapFieldType.EMPTY);
            field1.setValue("");
            field1.setAlign(Align.N);
            MapField field2 = new MapField();
            field2.setType(MapFieldType.EMPTY);
            field2.setValue("");
            field2.setAlign(Align.N);
            // Create a GameMap and associate fields
            GameMap map = new GameMap();
            map.setWidth(2);
            List<MapField> fields = new ArrayList<>();
            fields.add(field1);
            fields.add(field2);
            map.setMapFields(fields);


            session.persist(field1);

            session.getTransaction().commit();
            System.out.println("GameMap and its fields saved successfully!");
        } finally {
            factory.close();
        }
    }
}