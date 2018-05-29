/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTDoispontos(TDoispontos node);
    void caseTPontoevirg(TPontoevirg node);
    void caseTPonto(TPonto node);
    void caseTVirg(TVirg node);
    void caseTAprentese(TAprentese node);
    void caseTFparentese(TFparentese node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMaiorq(TMaiorq node);
    void caseTMenorq(TMenorq node);
    void caseTMaiorigual(TMaiorigual node);
    void caseTMenorigual(TMenorigual node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTAtrib(TAtrib node);
    void caseTNao(TNao node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTLbreak(TLbreak node);
    void caseTTab(TTab node);
    void caseTEspaco(TEspaco node);
    void caseTString(TString node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTInicio(TInicio node);
    void caseTPrograma(TPrograma node);
    void caseTFimprograma(TFimprograma node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTEnquanto(TEnquanto node);
    void caseTRepita(TRepita node);
    void caseTPara(TPara node);
    void caseTAvalie(TAvalie node);
    void caseTCaso(TCaso node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTFalso(TFalso node);
    void caseTBooleano(TBooleano node);
    void caseTEscreva(TEscreva node);
    void caseTLeia(TLeia node);
    void caseTId(TId node);
    void caseTTexto(TTexto node);
    void caseTNum(TNum node);
    void caseTNumreal(TNumreal node);
    void caseTBlank(TBlank node);
    void caseTComentariolinha(TComentariolinha node);
    void caseTComment(TComment node);
    void caseTCommentEnd(TCommentEnd node);
    void caseTCommentBody(TCommentBody node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
