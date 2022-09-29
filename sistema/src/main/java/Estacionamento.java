public class Estacionamento {
    // atributos da classe estacionamento
    public String numeroVaga;
    public String modeloCarro;
    public String placa;
    public double valorPara4Horas;
    public String analisarVaga;

    public Estacionamento() {
        this.modeloCarro = modeloCarro;
        this.placa = placa;
        this.numeroVaga = numeroVaga;
        this.valorPara4Horas = 10;
        this.analisarVaga = analisarVaga;
    }

    public void cadastrarCarro(String modeloCarro, String placa) {
        if (placa == null && modeloCarro == null) {
            Estacionamento estacionamento = new Estacionamento();
            estacionamento.modeloCarro = modeloCarro;
            estacionamento.placa = placa;
        }

    }
    public String selecionarVaga(String numeroVaga){
        Estacionamento esta = new Estacionamento();
        this.numeroVaga = numeroVaga;

        return numeroVaga;
    }

    public double getValorPara4Horas() {
        return valorPara4Horas;
    }

    public void setValorPara4Horas(double value) {
        if (valorPara4Horas > 4) {
            valorPara4Horas = value * 3;
        }
    }

       public void setAnalisarVaga(String vaga) {
        analisarVaga = vaga;
    }
    public boolean getAnalisarVaga() {
        if (analisarVaga != this.numeroVaga){
            return true;
        }else{
            return false;
        }

    }
    }


