package StrategyDP;

import java.lang.Math;

public class MediaGeometrica implements ICalcMedia,IMudaSituacao {

    @Override
    public void calculaMedia(Disciplina D){
        D.setMedia((float)Math.sqrt(D.getP1()*D.getP2()));
    }

    @Override
    public void mudaSituacao(Disciplina D){
        D.setSituacao(D.getMedia() > 7.0 ? "aprovado" : "reprovado");
    }
}
