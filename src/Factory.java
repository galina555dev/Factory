public class Factory {
    public PIZZA getOrderedPizza(String inputos) {
        PIZZA pizza = null;
        if (inputos.equals("Hawaiian")) {
            pizza = new Hawaiian();
        } else if (inputos.equals("Margarita")) {
            pizza = new Margarita();
        } else if (inputos.equals("Diablo")) {
            pizza = new Diablo();
        }
        return pizza;
    }
}
