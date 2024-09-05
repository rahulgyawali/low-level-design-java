package solidprinciples.s;

public class SingleResponsibilityImplement {
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

    /**
     * Each class Now has only one responsibility
     */

    class Invoice {
        private SingleResponsibility.Marker marker;                  //HAS-A relationship: Invoice has a marker
        private int quantity;
        public Invoice(SingleResponsibility.Marker marker, int quantity){
            this.marker = marker;
            this.quantity = quantity;
        }
        public int calculateTotal(){
            return marker.price*this.quantity;
        }
    }

    class InvoiceDao{

        Invoice invoice;

        public InvoiceDao(Invoice invoice){
            this.invoice = invoice;
        }

        public void saveToDB(){
            //Save to DB
        }
    }

    class InvoicePrinter{

        Invoice invoice;

        public InvoicePrinter(Invoice invoice){
            this.invoice = invoice;
        }

        public void printInvoice(){
            //Print invoice
        }
    }


}
