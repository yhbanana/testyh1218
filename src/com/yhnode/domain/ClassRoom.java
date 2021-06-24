package com.yhnode.domain;

public class ClassRoom {
    private String name;
    private String classroomid;

    public ClassRoom() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(String classroomid) {
        this.classroomid = classroomid;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", classroomid='" + classroomid + '\'' +
                '}';
    }
}
