package coffee;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        try {
            coffeeMachine.showInfo("Please insert banknote");
            coffeeMachine.pay(5);
            coffeeMachine.showInfo("Current balance = " + coffeeMachine.getBalance());
            coffeeMachine.showInfo("Choose option");
            coffeeMachine.choose(1);
            coffeeMachine.showInfo("Chosen coffee is " + coffeeMachine.getChosenCoffee());
            coffeeMachine.showInfo("Preparing...");
            coffeeMachine.prepare();
            coffeeMachine.showInfo("Coffee is ready!");
            coffeeMachine.showInfo("Balance Rest = " + coffeeMachine.getBalance());
        } catch (Exception e) {
            coffeeMachine.showInfo(e.getMessage());
        }
    }
}
