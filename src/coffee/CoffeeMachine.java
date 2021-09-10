package coffee;

public class CoffeeMachine {
    private String chosenCoffee;
    private int balance;

    public void pay(Integer banknoteNominal) throws Exception {
        if (!(banknoteNominal == 5 || banknoteNominal == 10)) {
            throw new Exception("Please insert correct banknote");
        }

        this.balance += banknoteNominal;
    }

    public boolean validation(int option) throws Exception {
        if (option != 1 && option != 2) {
            throw new Exception("Option doesnt exists, try again!");
        }

        if (!(option == 1 && this.balance >= 5) && !(option == 2 && this.balance >= 10)) {
            throw new Exception("Not enough balance");
        }

        return true;
    }

    public void choose(int option) throws Exception {
        validation(option);
        this.chosenCoffee = option == 1 ? "Espresso" : "Americano";
    }

    public void showInfo(String message) {
        System.out.println(message);
    }

    public void prepare() throws InterruptedException {
        Thread.sleep(2000);
    }

    public String getChosenCoffee() {
        return this.chosenCoffee;
    }

    public int getBalance() {
        return balance;
    }
}
