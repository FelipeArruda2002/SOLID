package model.model.domain;

import services.DescontaDezOuQuinzePorcento;
import services.DescontaQuinzeOuVintePorcento;
import services.RegraDeCalculo;

public enum Cargo {

    DESENVOLVEDOR(new DescontaDezOuQuinzePorcento()),
    ENGENHEIRO(new DescontaQuinzeOuVintePorcento()),
    DIRETOR(new DescontaQuinzeOuVintePorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
