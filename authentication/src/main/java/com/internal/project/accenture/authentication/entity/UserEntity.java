package com.internal.project.accenture.authentication.entity;

public class UserEntity {

    private Integer id;
    private String username;
    private String description;

    public UserEntity(){}

    public UserEntity(Integer id, String username, String description){
        super();
        this.id = id;
        this.username = username;
        this.description = description;
    }

    public Integer getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(){
        this.username = username;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description = description;
    }

}
