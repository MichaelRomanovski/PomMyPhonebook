package Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class AddContactmodel {
    String name;
    String lastName;
    String phone;
    String email;
    String address;
    String description;





}
