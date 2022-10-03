public class Main {
    public static void main (String[] args){

            SalarioXHora contrato1 = new SalarioXHora (new Persona("Omar", "Saheicha",32805620,34),10,"10/10/2020",true,10,200.00);
            SalarioXHora contrato2 = new SalarioXHora (new Persona("Ignacio", "Poma",30635846,30),11,"10/10/2016",false,12,100.00);
            SalarioXMes contrato3 = new SalarioXMes (new Persona("Santi","Saheicha",54604350, 8),10,"16/10/2013",true,12000.00,12.00,"Jefe");
            SalarioXMes contrato4 = new SalarioXMes(new Persona("Juan","Quiroga",35634000, 27),12,"12/12/2017",false,1500.00,15.00,"Operario");
            SalarioXMes contrato5 = new SalarioXMes(new Persona("Pepe","Grillo",25444998,40),15,"1/3/2014",true,2300.00,18.00,"Jefe");

            //Metodo para saber si se puede incorporar al trabajo

            System.out.println(contrato1.sePuedeIncorporar());
            System.out.println(contrato2.sePuedeIncorporar());
            System.out.println(contrato3.sePuedeIncorporar());
            System.out.println(contrato4.sePuedeIncorporar());
            System.out.println(contrato5.sePuedeIncorporar());

            System.out.println("");

            //Metodo para saber si Es Jefe

            System.out.println(contrato3.esJefe());
            System.out.println(contrato4.esJefe());
            System.out.println(contrato5.esJefe());
            System.out.println("");
            //Metodo para comparar horas

            System.out.println(contrato1.compareTo(contrato2));
}
}
