package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "offices")
@Entity
@Getter
@Setter
public class Office extends BaseObject {
    @Id
    @Column(name = "officeCode", nullable = false, length = 10)
    private String id;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;

    @Column(name = "addressLine1", nullable = false, length = 50)
    private String addressLine1;

    @Column(name = "addressLine2", length = 50)
    private String addressLine2;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "country", nullable = false, length = 50)
    private String country;

    @Column(name = "postalCode", nullable = false, length = 15)
    private String postalCode;

    @Column(name = "territory", nullable = false, length = 10)
    private String territory;

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}