package br.com.tiago.api.medico;

import br.com.tiago.api.endereco.DadosEndereco;

public record CadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
