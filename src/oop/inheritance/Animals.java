package oop.inheritance;

public class Animals {
    protected String name;
    protected String speak;

    public Animals(String name, String speak) {
        this.name = name;
        this.speak = speak;
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

    @Override
    public String toString() {
        return "Animals[" +
                "name='" + name + '\'' +
                ", speak='" + speak + '\'' +
                ']';
    }
}
