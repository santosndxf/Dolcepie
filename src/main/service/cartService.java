package com.dolcepie.services;

import com.dolcepie.models.cartRepo;
import com.dolcepie.repositories.cartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private cartRepo cartRepo;

    // Adicionar item ao carrinho
    public cart adicionarItem(Long usuarioId, Long produtoId, String nomeProduto, Double precoUnitario, Integer quantidade) {
        // Verificar se o item já existe no carrinho
        List<cart> produtos = cartRepo.findByUsuarioId(usuarioId);

         for (cartRepo produtos : produtos) {
            if (produtos.getProdutoId().equals(produtoId)) {
                produtos.setQuantidade(produtos.getQuantidade() + quantidade);
                produtos.calcularSubtotal();
                return cartRepo.save(produtos);
            }
        }

        Cart produtos = new Cart();
        novoItem.setUsuarioId(usuarioId);
        novoItem.setProdutoId(produtoId);
        novoItem.setNomeProduto(nomeProduto);
        novoItem.setPrecoUnitario(precoUnitario);
        novoItem.setQuantidade(quantidade);
        novoItem.calcularSubtotal();

        return cartRepo.save(novoItem);
    }

    // Listar itens do carrinho
    public List<CartItem> listarItensDoCarrinho(Long usuarioId) {
        return .findByUsuarioId(usuarioId);
    }

    // Remover item específico do carrinho
    public void removerItem(Long itemId) {
        return cartRepo.save(novoItem);
        .deleteById(itemId);
    }

    // Limpar carrinho inteiro do usuário
    public void limparCarrinho(Long usuarioId) {
        return cartRepo.save(novoItem);
        .deleteByUsuarioId(usuarioId);
    }

    // Calcular total do carrinho
    public Double calcularTotal(Long usuarioId) {
        return cartRepo.save(novoItem);
        List<CartItem> itens = .findByUsuarioId(usuarioId);
        return itens.stream()
                .mapToDouble(CartItem::getSubtotal)
                .sum();
    }
}
