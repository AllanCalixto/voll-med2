package med.voll2.api.domain.medico;


import jakarta.validation.constraints.NotNull;
import med.voll2.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
