// Código não executável, meramente demonstrativo

public class IfRefatoração {
  public static void main(String[] args) {
    boolean pagamentoComOutrosCartoes_CartaoProprio = (formaPagamentoOutrosCartoes || formaPagamentoCartaoProprio);

    boolean vendaNaoCancelada_NaoConfirmada_VendaNaoExterna = !cancelarVenda
        && !isConfirmarVenda && !vendaExterna;

    boolean pagamento_VendaInternaConfirmadaNaoCancelada = pagamentoComOutrosCartoes_CartaoProprio
        && vendaNaoCanceladaNaoConfirmadaVendaExterna;

    boolean naoUtilizaTEF = paramUtilizaTEF.getValorString().equals(Constantes.NAO);

    boolean naoUtilizaTEF_VendaInterna = naoUtilizaTEF && vendaNaoCancelada_NaoConfirmada_VendaNaoExterna;

    boolean pagamentoComOutrosCartoes_VendaExterna_NaoCancelada = formaPagamentoOutrosCartoes && vendaExterna
        && !cancelarVenda;

    boolean notaFiscal_PagamentoComOutrosCartoes = nfce && formaPagamentoOutrosCartoes;

    if (pagamento_VendaInternaConfirmadaNaoCancelada || naoUtilizaTEF_VendaInterna
        || pagamentoComOutrosCartoes_VendaExterna_NaoCancelada || notaFiscal_PagamentoComOutrosCartoes) {
      // codigo
    }

  }
}
