package solidprinciples.d;

/**
 * D stands for Dependency Inversion
 * A class should depend on interfaces rather than concrete classes
 */
public class DependencyInversion {

    class MacBook{
        private final WiredKeyboard keyboard;   //Depending on concrete classes
        private final WiredMouse mouse;         //Depending on concrete classes

        /**
         * This violates the dependency inversion.
         */

        public MacBook(){
            keyboard = new WiredKeyboard();     //Depending on concrete classes
            mouse = new WiredMouse();           //Depending on concrete classes
        }

        interface Keyboard{

        }

        class WiredKeyboard implements Keyboard{

        }

        interface Mouse {

        }

        class WiredMouse implements Mouse {

        }
    }


}
