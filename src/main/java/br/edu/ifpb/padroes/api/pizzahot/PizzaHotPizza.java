package br.edu.ifpb.padroes.api.pizzahot;

public class PizzaHotPizza {

    private Float price;
    private String topping;

    public String getTopping() {
        return topping;
    }

    public Float getPrice() {
        return price;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
