package com.hillel.somov.javaPRO.lessons.HW16;


public class Homework {
    private int id;
    private String name;
    private String description;

    public int getId() {

        return id;
    }
    public String getName() {

        return name;
    }
    public String getDescription() {

        return description;
    }
    public void setId(int id) {

        this.id = Integer.parseInt(String.valueOf(id));
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setDescription(String description) {

        this.description = description;
    }
    @Override
    public String toString() {
        return "Homework{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


}
