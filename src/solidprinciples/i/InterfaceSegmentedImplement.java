package solidprinciples.i;

public class InterfaceSegmentedImplement {
    /**
     * Seperate Interface into smaller chunks to avoid unnecessary implementation from the base class
     */
    interface WaiterInterface{
        void serveCustomers();
        void takeOrders();
    }

    interface ChefInterface {
        void cookFood();
        void decideMenu();
    }

    class Waiter implements WaiterInterface{

        @Override
        public void serveCustomers(){

        }

        @Override
        public void takeOrders(){

        }
    }

    class Chef implements ChefInterface{

        @Override
        public void cookFood(){

        }

        @Override
        public void decideMenu(){

        }
    }

}
