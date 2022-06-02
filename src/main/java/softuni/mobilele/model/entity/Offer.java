package softuni.mobilele.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{
    //TODO fields...
    //· description – some text.
    //
    //· engine – enumerated value (GASOLINE, DIESEL, ELECTRIC, HYBRID).
    //
    //· imageUrl – the url of image.
    //
    //· mileage – a number.
    //
    //· price – the price of the offer.
    //
    //· transmission – enumerated value (MANUAL, AUTOMATIC).
    //
    //· year – the year of offered car.
    //
    //· created – a date and time.
    //
    //· modified – a date and time.
    //
    //· model – the model of a car.
    //
    //· seller – a user that sells the car.
}
