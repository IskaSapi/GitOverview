package net.iska;

public class PersonEkinshi extends Person {
    private String base;
    private String entity;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "PersonEkinshi{" +
                "base='" + base + '\'' +
                ", entity='" + entity + '\'' +
                '}';
    }
}
