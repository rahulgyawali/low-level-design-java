package solidprinciples.d;

import java.awt.*;

public class DependencyInversionImplement {

    class MacBook{
        private final Keyboard keyboard;   //Depending on Interface classes
        private final Mouse mouse;         //Depending on Interface classes

        public MacBook(Keyboard keyboard, Mouse mouse){
            this.keyboard = keyboard;    //Depending on Interface classes
            this.mouse = mouse;         //Depending on Interface classes
        }

        interface Keyboard{

        }

        class WiredKeyboard implements Keyboard {

        }

        class WirelessKeyboard implements Keyboard {

        }


        interface Mouse {

        }

        class WiredMouse implements Mouse {

        }

        class WirelessMouse implements Mouse {

        }
    }
}
