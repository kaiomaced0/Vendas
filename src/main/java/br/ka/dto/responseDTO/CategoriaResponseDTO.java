package br.ka.dto.responseDTO;

import br.ka.model.Categoria;

public record CategoriaResponseDTO(
        Long id,
        String nome) {

    public CategoriaResponseDTO(Categoria categoria) {
        this(categoria.getId(), categoria.getNome());
    }
}
