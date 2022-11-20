// public class metodos {
    
//     public double somar(int num1, int num2) {
//         //LOGICA - FINALIDADE DO MÉTODO
//         return ...;
//     }
    
//     public void imprimir() {
//         //LOGICA - FINALIDADE DO MÉTODO
//         //aqui não precisa do return

//     }
//     // throws Exception : indica que o método ao ser utilizado poderá gerar uma excessão

//     public double dividir(int dividendo, int divisor) { //trows Exception
        
//     }

//     private void metodoPrivado() {
//         // este método não pode ser visto por outras classes do programa

//     }
//     // alguns equívocos estruturais
//     public void validar() {
//         //este método deveria retornar algum valor
//         // no caso, boolean (true or false) ao invés de "void"
//     }
    
//     public void calcularEnviar() {
//         //um método deve representar uma única resposta
//     }
//     public void gravarCliente(String nome, String cpf, Integer... ) {
//         //este método tem a finalidade de guardar informações de um cliente
//         //por que não criar um objeto Cliente e passar como parâmetro?
//         //Veja abaixo:
        
//     }

//     public void gravarCliente(Cliente cliente) {
//         //ou
//     }
//     public void gravar(Cliente cliente) {
        
//     }

    
// }

/**
 * exercicios
 */
public class SmarTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        
    }
    public void aumentarCanal() {
        canal++;
        
    }
    public void diminuirCanal() {
        canal--;
        
    }

    public void aumentarVolume() {
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
    
}