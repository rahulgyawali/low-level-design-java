package solidprinciples.i;

/**
 * I stands for Interface Segmented.
 *
 * Interface should be such that client should not implement unnecessary functions they do not need.
 */
public class InterfaceSegmented {

    interface RestuarantEmployee {

        void washDishes();
        void serveCustomers();
        void cookFood();
    }


    /**
     * We are implementing unnecessary functionality we do not need
     */
    class Waiter implements RestuarantEmployee{

        @Override
        public void washDishes(){
            /**
             * Unnecessary as Waiter does not wash dishes
             */
        }

        @Override
        public void serveCustomers(){
            /**
             * This is the only necessary for Staff
             */
        }

        @Override
        public void cookFood(){
            /**
             * Unnecessary as Waiter Does not CookFood
             */
        }

    }

}
