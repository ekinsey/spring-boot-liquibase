package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "orderdetails", indexes = {
        @Index(name = "productCode", columnList = "productCode")
})
@Entity
@Getter
@Setter
public class Orderdetail extends BaseObject {
    @EmbeddedId
    private OrderdetailId id;

    @Column(name = "quantityOrdered", nullable = false)
    private Integer quantityOrdered;

    @Column(name = "priceEach", nullable = false, precision = 10, scale = 2)
    private BigDecimal priceEach;

    @Column(name = "orderLineNumber", nullable = false)
    private Integer orderLineNumber;

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