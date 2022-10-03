package clases;

public class Persona implements comparable{
    private int edad;



    public int getEdad(){
        return this.edad;
    }

    public void decirEdad(){
        System.out.println(this.edad);
    }

 @Override
    public int compareTo(Object o){
        persona p = (Persona) o;
        return  this.edad - ((Persona) o).getEdad();


 }



        //  Este codigo puede reemplasarse por una resta.
       //   if(this.edad > p.getEdad()){
       //     return  1; // --> mayor a 0
       //   }
       //   else if(this.edad < p.getEdad()){
       //     return -1; // -> menor a 0
        //      }
        //      return 0;

}
