import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

    String name;
    Integer age;
    String profession;
    Address address;

    public Person() {
    }
}
