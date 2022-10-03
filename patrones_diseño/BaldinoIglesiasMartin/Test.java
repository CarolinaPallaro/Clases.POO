public class Test {

        public static void main(String[] args) {

            Pizza muzzarella = PizzaFactory.getInstance().crearPizza(PizzaFactory.PIZZASIMPLE);
            Pizza especial = PizzaFactory.getInstance().crearPizza(PizzaFactory.PIZZASIMPLE);
            Pizza anana = PizzaFactory.getInstance().crearPizza(PizzaFactory.PIZZASIMPLE);
            Pizza loca = PizzaFactory.getInstance().crearPizza(PizzaFactory.PIZZACOMBINADA);

            ((PizzaCombinada) loca).agregarPizza((PizzaSimple) anana);
            ((PizzaCombinada) loca).agregarPizza((PizzaSimple) especial);



            Pizzeria pizzeria = new Pizzeria("Pizza Loca");
            pizzeria.agregarPizza(muzzarella);
            pizzeria.agregarPizza(anana);
            pizzeria.agregarPizza(especial);
            pizzeria.agregarPizza(loca);
            pizzeria.mostrarPizzas();


        }

}
