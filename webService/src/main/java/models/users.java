package models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "account")
public class users {
    private int id;
    private String username;
    private String password;
    private String email;
    private Timestamp created_on;
    private Timestamp last_login;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }




}
