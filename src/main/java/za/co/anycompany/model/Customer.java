package za.co.anycompany.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Long id;
    private String name;
    private String country;
    private Date dateOfBirth;

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', country='%s',, dateOfBirth='%s']",
                id, name, country, dateOfBirth);
    }
}
