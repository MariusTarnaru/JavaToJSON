import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSONUtil {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }

    public static String convertJavaToJson(Object obj){
        String resultAsJson = "";

        try {
            resultAsJson = mapper.writeValueAsString(obj);
        }
        catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return resultAsJson;
    }

    public static <T>  T convertJsonToJava(String jsonString , Class<T> cls){
        T resultAsJavaObject = null;
        try{
            resultAsJavaObject = mapper.readValue(jsonString, cls);
        }
        catch (JsonProcessingException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultAsJavaObject;
    }

    public static void main(String[] args) {
        // Person object as JSON
        Person person1 = new Person();
        person1.setName("Nick");
        person1.setAge(28);
        person1.setProfession("student");
        Address address1 = new Address();
        address1.number = 4;
        address1.street = "Petru Vintila";
        address1.city = "Iasi";

        person1.setAddress(address1);

        String personAsJson = convertJavaToJson(person1);
        System.out.println("Person Object as JSON: " + personAsJson + "\n");

        // JSON as Person Object
        Person person2 = convertJsonToJava(personAsJson, Person.class);
        System.out.println("JSON as Person Object " + person2);

    }
}
