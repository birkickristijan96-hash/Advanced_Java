package com.itacademy.six.Demo;

public enum Gender {
    MALE ("musko"),
    FEMALE("zenski"),
    UNKNOWN("transrodni");

    private final String description;

    Gender (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public  static Gender fromDescription(String description){
      return   switch(description) {
            case "M" -> Gender.MALE;
            case "F" -> Gender.FEMALE;
            default -> Gender.UNKNOWN;
        };
    }
}
