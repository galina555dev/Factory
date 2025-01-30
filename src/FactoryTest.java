public class FactoryTest {//тест
    public static void main(String[] args){
        String p = "Diablo";
        Factory factory = new Factory();
        PIZZA pizza = factory.getOrderedPizza(p);
        pizza.getPIZZA();

    }
}