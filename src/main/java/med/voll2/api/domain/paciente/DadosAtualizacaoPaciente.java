package med.voll2.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll2.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}