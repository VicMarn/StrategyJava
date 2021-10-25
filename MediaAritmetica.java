package StrategyDP;

public class MediaAritmetica implements ICalcMedia,IMudaSituacao {


    @Override
    public void calculaMedia(Disciplina D) {
        D.setMedia((D.getP1() + D.getP2())/2);
    }

    @Override
    public void mudaSituacao(Disciplina D){
        D.setSituacao(D.getMedia() > 5.0 ? "aprovado" : "reprovado");
    }
}
