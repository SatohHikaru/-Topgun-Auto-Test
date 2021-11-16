package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private String userName="quangtestauto";
    private String password="123Quang!";

    private String firstName="Vinh Quang";
    private String middleName="Van";
    private String lastName="Nguyen";

    private String suffix="Mr";

    private String Month= "10";
    private String Day= "9";
    private String Year= "99";
}
