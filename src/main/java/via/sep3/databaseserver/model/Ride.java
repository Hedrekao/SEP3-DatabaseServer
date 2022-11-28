package via.sep3.databaseserver.model;

import javax.persistence.*;

@Entity
@Table(name="rides")
public class Ride {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN",initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="seq-gen")
    @Column(name="id")
    private int id;
    @OneToOne
    @JoinColumn(name = "startlocation_id",referencedColumnName = "id")
    private Location startLocation;
    @OneToOne
    @JoinColumn(name = "destination_id",referencedColumnName = "id")
    private Location destination;
    private long startTime;
    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    private Driver driver;

    private int capacity;

    public Ride(Location startLocation, Location destination, long startTime, long endTime, Driver driver, int capacity) {
        this.startLocation = startLocation;
        this.destination = destination;
        this.startTime = startTime;
        this.driver = driver;
        this.capacity = capacity;
    }

    protected Ride()
    {

    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
