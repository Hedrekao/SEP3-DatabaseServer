package via.sep3.databaseserver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    private String name;
    private String phone;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "driver")
    private List<Ride> rides;

    public Driver(String name, String phone, List<Ride> rides) {
        this.name = name;
        this.phone = phone;
        this.rides = rides;
    }

    protected Driver()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }
}
