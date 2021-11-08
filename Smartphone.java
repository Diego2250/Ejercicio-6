public class Smartphone extends Producto {

    boolean portable = true;

    public Smartphone(int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        
    }

    public void doCall(int phone_number){
        //método de la vista para llamar. 
    }

    public void doPicture(){
        //método de la vista para tomar pic. 
    }
    
}
