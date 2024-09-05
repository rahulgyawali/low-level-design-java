package solidprinciples.o;

import solidprinciples.s.SingleResponsibility;
import solidprinciples.s.SingleResponsibilityImplement;

/**
 * O Stands for open for extension,closed for modification
 */
public class OpenClosed {

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
        public Invoice(Marker marker, int quantity){
            this.marker = marker;
            this.quantity = quantity;
        }
        public int calculateTotal(){
            return marker.price*this.quantity;
        }
    }

    /**
     * Suppose InvoiceDao is live and I want to save the Invoice in File as well in addition to DB
     */

    class InvoiceDao{

        Invoice invoice;

        public InvoiceDao(Invoice invoice){
            this.invoice = invoice;
        }

        public void saveToDB(){
            //Save to DB
        }

        public void saveToFile(){
            //Save to DB
            /**
             * This Clearly violates the open closed principle, Since It is modified and and not extended.
             */
        }
    }
}
