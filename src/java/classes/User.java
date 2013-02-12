/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author CaioHen
 */
public final class User implements Serializable{
    private String firstName;
    private String lastName;
    private String nickname;
    private String password;
    private int age;
    private String email;
    private String address;
    
    public User(String user, String password){
        setFirstName("Desconhecido");
        setLastName("Anônimo");
        setNickName(user);
        setPassword(password);
    }
    
    public User(String firstname, String lastname, String nickname, int age, String email, String address){
        this.setFirstName(firstname);
        this.setLastName(lastname);
        this.setNickName(nickname);
        this.setPassword(null);
        this.setAge(age);
        this.setEmail(email);
        this.setAddress(address);
    }
    
    
    public void setFirstName(String name){
        this.firstName = name;
    }
    
    public void setLastName(String name){
        this.lastName = name;
    }
    
    public void setNickName(String nick){
        this.nickname = nick;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setPassword(String pass){
        this.password = pass;
    }
    
    public void setEmail(String mail){
        this.email = mail;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    
    
    public String getNome(){
        return (String) this.firstName + " " + this.lastName;
    }
    
    public String getNickName(){
        return (String) this.nickname;
    }
    
    public int getAge(){
        return (int) this.age;
    }
    
    public String getPassword(){
        return (String) this.password;
    }
    
    public String getEmail(){
        return (String) this.email;
    }
    
    public String getAddress(){
        return (String) this.address;
    }
    
}
