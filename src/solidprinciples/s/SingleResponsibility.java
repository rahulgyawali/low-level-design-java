package solidprinciples.s;


/**
 * S stands for Single Responsibility, That means a class should have only one reason to be changed.
 */
public class SingleResponsibility {

    class Marker{
        String name;
        String color;
        int year;
        int price;

        public Marker(String name,String color,int year, int price){
            this.name = name;
            this.color = color;
            this.year = year;
            this.price = price;
        }
    }

    class Invoice {
        private Marker marker;                  //HAS-A relationship: Invoice has a marker
        private int quantity;
        public Invoice(Marker marker,int quantity){
            this.marker = marker;
            this.quantity = quantity;
        }
        public int calculateTotal(){
            return marker.price*this.quantity;  //what if I add GST?
        }
        public void printInvoice(){
            //Print invoice                     //What if I change printing condition?
        }
        public void saveToDB(){
            //Save to DB                        //What if I want to save in File instead of DB?
        }

        /**
         *
         * calculateTotal(), printInvoice(), saveToDB() are three reasons that could change the Invoice class
         * We can do something better
         *
         */
    }
}
