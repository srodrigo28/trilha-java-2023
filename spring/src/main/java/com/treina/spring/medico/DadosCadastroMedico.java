package com.treina.spring.medico;

import com.treina.spring.shared.DadosEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidades especialidades,
        DadosEndereco endereco
    ) {
    
}
