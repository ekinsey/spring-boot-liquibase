package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

@Table(name = "customers", indexes = {
        @Index(name = "salesRepEmployeeNumber", columnList = "salesRepEmployeeNumber")
})
@Entity
@Getter
@Setter
public class Customer extends BaseObject  {
    @Id
    @Column(name = "customerNumber", nullable = false)
    private Integer id;

    @Column(name = "customerName", nullable = false, length = 50)
    private String customerName;

    @Column(name = "contactLastName", nullable = false, length = 50)
    private String contactLastName;

    @Column(name = "contactFirstName", nullable = false, length = 50)
    private String contactFirstName;

    @Column(name = "phone", nullable = false, length = 50)
    private String phone;

    @Column(name = "addressLine1", nullable = false, length = 50)
    private String addressLine1;

    @Column(name = "addressLine2", length = 50)
    private String addressLine2;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "postalCode", length = 15)
    private String postalCode;

    @Column(name = "country", nullable = false, length = 50)
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salesRepEmployeeNumber")
    private Employee salesRepEmployeeNumber;

    @Column(name = "creditLimit", precision = 10, scale = 2)
    private BigDecimal creditLimit;

    @Column(name = "rating", nullable = true)
    private String rating;

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("customerName='" + customerName + "'")
                .add("contactLastName='" + contactLastName + "'")
                .add("contactFirstName='" + contactFirstName + "'")
                .add("phone='" + phone + "'")
                .add("addressLine1='" + addressLine1 + "'")
                .add("addressLine2='" + addressLine2 + "'")
                .add("city='" + city + "'")
                .add("state='" + state + "'")
                .add("postalCode='" + postalCode + "'")
                .add("country='" + country + "'")
                .add("salesRepEmployeeNumber=" + salesRepEmployeeNumber)
                .add("creditLimit=" + creditLimit)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerName, customer.customerName) && Objects.equals(contactLastName, customer.contactLastName) && Objects.equals(contactFirstName, customer.contactFirstName) && Objects.equals(phone, customer.phone) && Objects.equals(addressLine1, customer.addressLine1) && Objects.equals(addressLine2, customer.addressLine2) && Objects.equals(city, customer.city) && Objects.equals(state, customer.state) && Objects.equals(postalCode, customer.postalCode) && Objects.equals(country, customer.country) && Objects.equals(salesRepEmployeeNumber, customer.salesRepEmployeeNumber) && Objects.equals(creditLimit, customer.creditLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit);
    }

}