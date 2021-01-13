package model;

public class DataFeature {
  String  name,last_name,email,city,zip,password,text_successfull;

    public DataFeature(String name, String last_name, String email, String city, String zip, String password, String text_successfull) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.city = city;
        this.zip = zip;
        this.password = password;
        this.text_successfull = text_successfull;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getText_successfull() {
        return text_successfull;
    }

    public void setText_successfull(String text_successfull) {
        this.text_successfull = text_successfull;
    }
}
