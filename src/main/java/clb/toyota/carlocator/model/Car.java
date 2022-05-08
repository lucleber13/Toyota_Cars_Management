package clb.toyota.carlocator.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "car")
@SequenceGenerator(name = "seq-car", sequenceName = "seq-car", allocationSize = 1, initialValue = 1)
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq-car")
    private Long id;

    private String chassiNumber;
    private String regNumber;
    private int keysNumber;
    private String modelName;
    private String color;
    private boolean fuelStatus;
    private Date dateIn;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getChassiNumber() {

        return chassiNumber;
    }

    public void setChassiNumber(String chassiNumber) {

        this.chassiNumber = chassiNumber;
    }

    public String getRegNumber() {

        return regNumber;
    }

    public void setRegNumber(String regNumber) {

        this.regNumber = regNumber;
    }

    public int getKeysNumber() {

        return keysNumber;
    }

    public void setKeysNumber(int keysNumber) {

        this.keysNumber = keysNumber;
    }

    public String getModelName() {

        return modelName;
    }

    public void setModelName(String modelName) {

        this.modelName = modelName;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public boolean isFuelStatus() {

        return fuelStatus;
    }

    public void setFuelStatus(boolean fuelStatus) {

        this.fuelStatus = fuelStatus;
    }

    public Date getDateIn() {

        return dateIn;
    }

    public void setDateIn(Date dateIn) {

        this.dateIn = dateIn;
    }

}
