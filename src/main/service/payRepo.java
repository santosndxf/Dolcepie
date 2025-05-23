package com.dolcepie.services;

import com.dolcepie.models.Pay;
import com.dolcepie.repositories.PayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayService {

    @Autowired
    private PayRepo payRepo;

    // Criar um pagamento
    public Pay criarPagamento(Long usuarioId, Double valorTotal, String metodoPagamento) {
        Pay pagamento = new Pay();
        pagamento.setUsuarioId(usuarioId);
        pagamento.setValorTotal(valorTotal);
        pagamento.setMetodoPagamento(metodoPagamento);
        pagamento.setStatus("Pendente"); // Status inicial
        return payRepo.save(pagamento);
    }

    // Buscar pagamento por ID
    public Pay buscarPorId(Long id) {
        return payRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Pagamento não encontrado."));
    }

    // Listar pagamentos de um usuário
    public List<Pay> listarPagamentosPorUsuario(Long usuarioId) {
        return payRepo.findByUsuarioId(usuarioId);
    }

    // Listar todos os pagamentos
    public List<Pay> listarTodosPagamentos() {
        return payRepo.findAll();
    }

    // Atualizar status do pagamento
    public Pay atualizarStatus(Long id, String novoStatus) {
        Pay pagamento = buscarPorId(id);
        pagamento.setStatus(novoStatus);
        return payRepo.save(pagamento);
    }

    // Cancelar pagamento
    public void cancelarPagamento(Long id) {
        Pay pagamento = buscarPorId(id);
        pagamento.setStatus("Cancelado");
        payRepo.save(pagamento);
    }

    // Aprovar pagamento
    public Pay aprovarPagamento(Long id) {
        return atualizarStatus(id, "Aprovado");
    }
}
