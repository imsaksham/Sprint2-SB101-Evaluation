package SingleTable.Bean;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Hotstar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String rating;
    @Enumerated
    private ActiveInactive activeInactive;


}
