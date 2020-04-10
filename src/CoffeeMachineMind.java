public class CoffeeMachineMind {

    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;

    void orderEspresso() {

        //water : 250
        water -= 250;

        // milk : 0

        //beans : 16
        beans -= 16;

        //cups : 1
        cups--;

        //    $ : 4
        money += 4;
    }

    String checkEspresso() {
        if (water < 250) {
            return "Sorry, not enough water!";
        }

        if (beans < 16) {
            return "Sorry, not enough coffee beans!";
        }

        if (cups < 1) {
            return "Sorry, not enough cups!";
        }

        return "I have enough resources, making you a coffee!";
    }

    void orderLatte() {

        //water : 350
        // water -= 350;

        // milk : 75
        milk -= 75;

        //beans : 20
        beans -= 20;

        //cups : 1
        cups--;

        //    $ : 6
        money += 7;

    }

    String checkLatte() {
        if (water < 350) {
            return "Sorry, not enough water!";
        }

        if (milk < 75) {
            return "Sorry, not enough milk!";
        }

        if (beans < 20) {
            return "Sorry, not enough coffee beans!";
        }

        if (cups < 1) {
            return "Sorry, not enough cups!";
        }

        return "I have enough resources, making you a coffee!";
    }

    void orderCappuccino() {

        //water : 200
        water -= 200;

        // milk : 100
        milk -= 100;

        //beans : 12
        beans -= 12;

        //cups : 1
        cups--;

        //    $ : 7
        money += 6;
    }

    String checkCappuccino() {
        if (water < 200) {
            return "Sorry, not enough water!";
        }

        if (milk < 100) {
            return "Sorry, not enough milk!";
        }

        if (beans < 12) {
            return "Sorry, not enough coffee beans!";
        }

        if (cups < 1) {
            return "Sorry, not enough cups!";
        }

        return "I have enough resources, making you a coffee!";
    }

//     String checkResources(int choice) {
//
//        return "Empty";
//    }

    void buy(int choice) {

        // This method would determine what is the order based one the choice
        // and based on the order it would call one of the order methods.

        // choice = 1 -> Espresso
        // choice = 2 -> Latte
        // choice = 3 -> Cappuccino

        switch(choice) {
            case 1:
                System.out.println(checkEspresso());
                if(checkEspresso().equalsIgnoreCase("I have enough resources, making you a coffee!")){
                    orderEspresso();
                }
                break;

            case 2:
                System.out.println(checkLatte());
                if(checkEspresso().equalsIgnoreCase("I have enough resources, making you a coffee!")){
                    orderLatte();
                }
                break;

            case 3:
                System.out.println(checkCappuccino());
                if(checkEspresso().equalsIgnoreCase("I have enough resources, making you a coffee!")){
                    orderCappuccino();
                }
                break;

            default:
                System.out.println("Invalid input!");
        }
    }

    int take() {

        // This method would return all the money
        // then would set the money to $0

        int tempMoney = money;

        money = 0;

        return tempMoney;
    }

    void fill(int wtr, int mlk, int bens, int cps) {
        // This method would add more water, milk, coffee beans, and disposable cups.
        water += wtr;
        milk += mlk;
        beans += bens;
        cups += cps;
    }

    void printMachineState() {

        // it displays the state of the machine:

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }

//    void interactWithUser() {
    // This method interacts with the user

//        // Asks the user to take an action repeatedly until the user decides to exit
//        do {
//
//            // Write action (buy, fill, take, remaining, exit):
//            System.out.println("Write action (buy, fill, take, remaining, exit): ");
//            System.out.print("> ");
//            String action = scan.next();
//
//            // buy:
//            // What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
//            if(action.equalsIgnoreCase("buy")) {
//                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
//                System.out.print("> ");
//                String choice = scan.next();
//
//                if(!choice.equalsIgnoreCase("back")) {
//                    buy(Integer.parseInt(choice));
//                }
//            }
//
//            // fill:
//                /*
//                Write how many ml of water do you want to add:
//                > 2000
//                Write how many ml of milk do you want to add:
//                > 500
//                Write how many grams of coffee beans do you want to add:
//                > 100
//                Write how many disposable cups of coffee do you want to add:
//                > 10
//                 */
//            else if(action.equalsIgnoreCase("fill")) {
//                System.out.println("Write how many ml of water do you want to add: ");
//                System.out.print("> ");
//                int water = scan.nextInt();
//
//                System.out.println("Write how many ml of milk do you want to add: ");
//                System.out.print("> ");
//                int milk = scan.nextInt();
//
//                System.out.println("Write how many grams of coffee beans do you want to add: ");
//                System.out.print("> ");
//                int beans = scan.nextInt();
//
//                System.out.println("Write how many disposable cups of coffee do you want to add: ");
//                System.out.print("> ");
//                int cups = scan.nextInt();
//
//                fill(water, milk, beans, cups);
//            }
//
//            // take:
//            // I gave you $+money
//            else if(action.equalsIgnoreCase("take")) {
//                System.out.println("I gave you $" + take());
//            }
//
//            // remaining:
//            // This prints out all the resources the machine has.
//            else if(action.equalsIgnoreCase("remaining")) {
//                System.out.println();
//                printMachineState();
//            }
//
//            // exit:
//            // This will shut down the Coffee Machine.
//            else if(action.equalsIgnoreCase("exit")) {
//                break;
//            }
//
//        } while(true);
//    }
}
