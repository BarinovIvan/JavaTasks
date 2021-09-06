package Practise1;

public class Ball {
    private String type;

    public Ball() {
    }

    public Ball(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type=" + type +
                '}';
    }
}
