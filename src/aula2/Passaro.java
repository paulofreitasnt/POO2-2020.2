package aula2;

//Implements (implementar) - funciona como um contrato
public class Passaro implements Voador{

    //Tenho obrigação de sobrescrever
    @Override
    public void voar() {
        System.out.println("Bater as asas");
    }

}
