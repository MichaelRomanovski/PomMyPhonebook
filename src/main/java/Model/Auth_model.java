package Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class Auth_model {

    public Auth_model(String email, String password) {
        this.email = email;
        this.password = password;
    }

    String email;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    String password;

}
