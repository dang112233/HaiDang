package oop.encapsulation;

public class Animals {
    private String name;
    private String speak;
    private String sex;

    public Animals(String name, String speak, String sex) {
        this.name = name;
        this.speak = speak;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animals[" +
                "name='" + name + '\'' +
                ", speak='" + speak + '\'' +
                ", sex='" + sex + '\'' +
                ']';
    }
}
