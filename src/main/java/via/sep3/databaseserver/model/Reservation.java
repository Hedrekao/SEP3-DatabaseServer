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
    private String passengerName;
    private String passengerPhone;

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

    public Reservation(Ride ride, String passengerName, String passengerPhone) {
        this.ride = ride;
        this.passengerName = passengerName;
        this.passengerPhone = passengerPhone;
        isAccepted = null;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone;
    }

    public Boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }
}
