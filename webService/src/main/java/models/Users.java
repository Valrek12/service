package models;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "account")
public class Users {
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

    @Basic
    @Column(name = "username", nullable = false, insertable = true, updatable = true)
    public String getUsername() {
        return  username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true)
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true)
    public String getEmail(){
        return email;
    }

    public  void setEmail(String email){
        this.email=email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on", nullable = false, insertable = true, updatable = true)
    public Timestamp getCreated_on(){
        return created_on;
    }

    public void  setCreated_on(Timestamp created_on){
        this.created_on=created_on;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_login",nullable = true, insertable = true, updatable = true)
    public Timestamp getLast_login(){
        return last_login;
    }

    public void setLast_login(Timestamp last_login){
        this.last_login=last_login;
    }
}
