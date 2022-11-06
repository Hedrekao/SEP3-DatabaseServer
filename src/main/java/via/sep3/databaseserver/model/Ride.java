package via.sep3.databaseserver.model;

import javax.persistence.*;

@Entity
@Table(name="rides")
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "startlocation_id",referencedColumnName = "id")
    private Location startLocation;
    @OneToOne
    @JoinColumn(name = "destination_id",referencedColumnName = "id")
    private Location destination;
    private long startTime;
    private long endTime;
    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    private Driver driver;

    public Ride(Location startLocation, Location destination, long startTime, long endTime, Driver driver) {
        this.startLocation = startLocation;
        this.destination = destination;
        this.startTime = startTime;
        this.endTime = endTime;
        this.driver = driver;
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

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
