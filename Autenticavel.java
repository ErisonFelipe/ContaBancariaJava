// Interface é uma class abstrata com todos os metodos abstratos
// Fazendo uma anologia uma Intarface é como um contrato 
    // no caso abaixo para poder usar o "contrato" Auntenticavel
        // A class deve implementar uma senha e auntentica
public abstract interface Autenticavel{    

    public abstract void setSenha(int senha);     

    public abstract boolean autentica(int senha);
} 