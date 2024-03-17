/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package heranca.kayquefreitas;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 17/03/2024
 * @brief Class Principal
 */
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // Inicializa um objeto Scanner para entrada do usuário
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos(); // Cria uma instância de GerenciadorVeiculos

        int opcao = 0;

        // Loop principal do programa, que continua até o usuário escolher sair (opção 5)
        while (opcao != 5) {
            gerenciador.exibirMenu(); // Mostra o menu de opções
            opcao = ler.nextInt(); // Lê a opção escolhida pelo usuário

            // Verifica qual opção foi escolhida e executa a operação correspondente
            switch (opcao) {
                case 1:
                    gerenciador.cadastrarVeiculo(); // Chama o método para cadastrar um novo veículo
                    break;
                case 2:
                    gerenciador.visualizarVeiculos(); // Chama o método para visualizar todos os veículos cadastrados
                    break;
                case 3:
                    gerenciador.editarVeiculo(); // Chama o método para editar informações de um veículo
                    break;
                case 4:
                    gerenciador.excluirVeiculo(); // Chama o método para excluir um veículo
                    break;
                case 5:
                    System.out.println("Saindo do programa..."); // Mensagem de saída do programa
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida."); // Mensagem para opção inválida
            }
        }
    }
}
