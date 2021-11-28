package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "employees", indexes = {
        @Index(name = "officeCode", columnList = "officeCode"),
        @Index(name = "reportsTo", columnList = "reportsTo")
})
@Entity
@Getter
@Setter
public class Employee extends BaseObject {
    @Id
    @Column(name = "employeeNumber", nullable = false)
    private Integer id1;

    @Column(name = "lastName", nullable = false, length = 50)
    private String lastName;

    @Column(name = "firstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "extension", nullable = false, length = 10)
    private String extension;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "officeCode", nullable = false)
    private Office officeCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reportsTo")
    private Employee reportsTo;

    @Column(name = "jobTitle", nullable = false, length = 50)
    private String jobTitle;

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