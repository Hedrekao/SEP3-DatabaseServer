package via.sep3.databaseserver.model;

import javax.annotation.Nullable;
import javax.persistence.*;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN",initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="seq-gen")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ride_id", referencedColumnName = "id")
    private Ride ride;
    @ManyToOne
    @JoinColumn(name = "passenger_id", referencedColumnName = "id")
    private User user;

    @Column(nullable=true)
    private Boolean isAccepted;

    protected Reservation()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reservation(Ride ride, User user) {
        this.ride = ride;
        this.user = user;
        isAccepted = null;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
}
