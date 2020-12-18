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

    public Person() {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
}
