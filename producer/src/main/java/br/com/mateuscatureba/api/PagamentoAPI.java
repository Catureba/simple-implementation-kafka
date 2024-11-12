package br.com.mateuscatureba.api;


import br.com.mateuscatureba.dto.PagamentoDTO;
import br.com.mateuscatureba.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoAPI {
    @Autowired private PagamentoService pagamentoService;

    @PostMapping
    public String pagar (@RequestBody PagamentoDTO pagamento) {
        return pagamentoService.integrarPagamento(pagamento);
    }
}
