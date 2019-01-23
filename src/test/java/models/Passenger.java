package models;

import lombok.Data;

@Data
public class Passenger {
  String firstName;
  String lastName;

  public Passenger(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
