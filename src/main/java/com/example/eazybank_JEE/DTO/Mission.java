package com.example.eazybank_JEE.DTO;

public class Mission {
    private String code;
    private String name;
    private String description;

    private Affectation affectation;

    public Mission(String Code, String Name, String Description) {
        this.code = Code;
        this.name = Name;
        this.description = Description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
