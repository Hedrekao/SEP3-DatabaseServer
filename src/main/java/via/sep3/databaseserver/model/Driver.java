package via.sep3.databaseserver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="drivers")
public class Driver {

    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN",initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="seq-gen")    @Column(name="id")
    private int id;
    private String name;

    private int phone;

    private int licenseNo;

    private String email;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "driver")
    private List<Ride> rides;

    public Driver(String name, int phone, List<Ride> rides, int licenseNo, String email, String password) {
        this.name = name;
        this.phone = phone;
        this.rides = rides;
        this.licenseNo = licenseNo;
        this.email = email;
        this.password = password;
    }



    public int getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(int licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRides(List<Ride> rides) {
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }
}
