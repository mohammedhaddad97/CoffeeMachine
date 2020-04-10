import java.util.Scanner;

public class CoffeeMachine {

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        CoffeeMachineMind coffeeMachine = new CoffeeMachineMind();

        // Everything was handled in the CoffeeMachineMine class
        // But then i think it's kinda a bad practice to get inputs
        // through a class.
//        coffeeMachine.interactWithUser();

        // Asks the user to take an action repeatedly until the user decides to exit
        do {

            // Write action (buy, fill, take, remaining, exit):
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            System.out.print("> ");
            String action = scan.next();

            // buy:
            // What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
            if(action.equalsIgnoreCase("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                System.out.print("> ");
                String choice = scan.next();

                if(!choice.equalsIgnoreCase("back")) {
                    coffeeMachine.buy(Integer.parseInt(choice));
                }
            }

            // fill:
                /*
                Write how many ml of water do you want to add:
                > 2000
                Write how many ml of milk do you want to add:
                > 500
                Write how many grams of coffee beans do you want to add:
                > 100
                Write how many disposable cups of coffee do you want to add:
                > 10
                 */
            else if(action.equalsIgnoreCase("fill")) {
                System.out.println("Write how many ml of water do you want to add: ");
                System.out.print("> ");
                int water = scan.nextInt();

                System.out.println("Write how many ml of milk do you want to add: ");
                System.out.print("> ");
                int milk = scan.nextInt();

                System.out.println("Write how many grams of coffee beans do you want to add: ");
                System.out.print("> ");
                int beans = scan.nextInt();

                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                System.out.print("> ");
                int cups = scan.nextInt();

                coffeeMachine.fill(water, milk, beans, cups);
            }

            // take:
            // I gave you $+money
            else if(action.equalsIgnoreCase("take")) {
                System.out.println("I gave you $" + coffeeMachine.take());
            }

            // remaining:
            // This prints out all the resources the machine has.
            else if(action.equalsIgnoreCase("remaining")) {
                System.out.println();
                coffeeMachine.printMachineState();
            }

            // exit:
            // This will shut down the Coffee Machine.
            else if(action.equalsIgnoreCase("exit")) {
                break;
            }

        } while(true);
    }
}