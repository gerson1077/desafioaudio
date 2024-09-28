package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{

    private String descricao;
    private String Apresentador;

    public String getApresentador() {
        return Apresentador;
    }

    public void setApresentador(String apresentador) {
        Apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
