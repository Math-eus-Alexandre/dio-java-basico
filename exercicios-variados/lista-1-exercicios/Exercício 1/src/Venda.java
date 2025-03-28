public class Venda{

    Float trocoPagar;

    public void calcularTroco (float valorProduto, float valorPago){
        trocoPagar = valorPago - valorProduto;
        System.out.println("O troco a ser dado é de: "+ trocoPagar);
    
}
}