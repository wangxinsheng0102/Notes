package entity;

/**
 * 花费存储模型
 *
 * @author wxs
 */
public class Spend {
    private String type;

    public Spend() {
    }

    public Spend(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    private double cost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
