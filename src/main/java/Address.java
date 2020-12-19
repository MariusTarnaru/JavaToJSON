import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Address {

    String city;
    String street;
    Integer number;

    public Address(){

    }

}
