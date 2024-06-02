package bg.softuni.smartphone_shop.model;

import bg.softuni.smartphone_shop.model.enums.PaymentType;
import bg.softuni.smartphone_shop.model.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private Set<Phone> phone;

    private int quantity;

    @ManyToOne
    private User user;

    private Double subtotal;

    private Double total;

    private String billingAddress;

    private String shippingAddress;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    private LocalDate created;

    private LocalDate updated;

}
