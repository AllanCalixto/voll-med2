package med.voll2.api.domain.consulta;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(

        Long id,
        Long idMedico,
        Long idPaciente,
        LocalDateTime data
) {
}
