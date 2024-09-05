package solidprinciples.o;

public class OpenClosedImplement {

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
     * Implement an interface of Invoice Dao to extend it for extension
     *
     * Suppose I want to save somewhere else, I just have to introduce a class and implement
     */

    interface InvoiceDao{
        public void saveInvoice(Invoice invoice);
    }

    class DatabaseInvoiceDao implements InvoiceDao{
        @Override
        public void saveInvoice(Invoice invoice){
                //Save to DB
        }
    }

    class FileInvoiceDao implements  InvoiceDao{
        @Override
        public void saveInvoice(Invoice invoice){
                //Save to File
        }
    }
}
