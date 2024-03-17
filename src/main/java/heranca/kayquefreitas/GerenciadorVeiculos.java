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
 * @brief Class GerenciadorVeiculos
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorVeiculos {

    // Lista para armazenar os veículos cadastrados
    private ArrayList<Veiculo> veiculos;
    private Scanner scanner;

    // Construtor para inicializar a lista de veículos e o scanner
    public GerenciadorVeiculos() {
        veiculos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Método para cadastrar um novo veículo
    public void cadastrarVeiculo() {
        // Cria um novo Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        // Exibe as opções de tipos de veículos para o usuário
        System.out.println("Escolha o tipo de veículo a cadastrar:");
        System.out.println("1. Ônibus");
        System.out.println("2. Carro");
        System.out.println("3. Motocicleta");
        System.out.println("4. Caminhão");
        // Lê a opção escolhida pelo usuário
        int tipoVeiculo = scanner.nextInt();
        // Solicita informações básicas do veículo (placa e ano)
        System.out.println("Informe a placa:");
        String placa = scanner.next();
        System.out.println("Informe o ano:");
        int ano = scanner.nextInt();
        // Com base na opção escolhida, solicita informações adicionais e cria o veículo correspondente
        switch (tipoVeiculo) {
            case 1:
                System.out.println("Informe o número de assentos:");
                int assentosOnibus = scanner.nextInt();
                Onibus onibus = new Onibus(placa, ano, assentosOnibus);
                cadastrarVeiculo(onibus);
                break;
            case 2:
                System.out.println("Informe o número de portas:");
                int portasCarro = scanner.nextInt();
                System.out.println("Informe a potência em cavalos:");
                int cavalosCarro = scanner.nextInt();
                Carro carro = new Carro(placa, ano, cavalosCarro, portasCarro);
                cadastrarVeiculo(carro);
                break;
            case 3:
                System.out.println("Informe a cilindrada:");
                int cilindradasMotocicleta = scanner.nextInt();
                Motocicleta motocicleta = new Motocicleta(placa, ano, cilindradasMotocicleta);
                cadastrarVeiculo(motocicleta);
                break;
            case 4:
                System.out.println("Informe o número de eixos:");
                int eixosCaminhao = scanner.nextInt();
                Caminhao caminhao = new Caminhao(placa, ano, eixosCaminhao);
                cadastrarVeiculo(caminhao);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

// Método privado para cadastrar um veículo na lista
    private void cadastrarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo); // Adiciona o veículo à lista de veículos
        System.out.println("Veículo cadastrado com sucesso!"); // Exibe uma mensagem de sucesso
    }

// Método para visualizar os veículos cadastrados
    public void visualizarVeiculos() {
        if (veiculos.isEmpty()) { // Verifica se a lista de veículos está vazia
            System.out.println("Não há veículos cadastrados."); // Exibe uma mensagem indicando que não há veículos cadastrados
        } else {
            System.out.println("Veículos cadastrados:"); // Exibe uma mensagem indicando que há veículos cadastrados
            for (int i = 0; i < veiculos.size(); i++) { // Itera sobre a lista de veículos
                Veiculo veiculo = veiculos.get(i); // Obtém o veículo atual da lista
                System.out.println((i + 1) + ". " + veiculo); // Exibe o veículo na tela, numerando-os
            }
        }
    }

// Método para excluir um veículo da lista
    public void excluirVeiculo() {
        visualizarVeiculos(); // Chama o método para visualizar os veículos cadastrados
        System.out.println("Digite o índice do veículo que deseja excluir:"); // Solicita que o usuário informe o índice do veículo a ser excluído
        int indice = scanner.nextInt(); // Lê o índice informado pelo usuário
        if (indice >= 1 && indice < veiculos.size()) { // Verifica se o índice informado é válido
            /*
        O método size() é um método da classe ArrayList em Java, e é usado para retornar o número de elementos presentes na lista.
             */
            veiculos.remove(indice); // Remove o veículo da lista de acordo com o índice informado
            System.out.println("Veículo removido com sucesso!"); // Exibe uma mensagem de sucesso
        } else {
            System.out.println("Índice inválido."); // Exibe uma mensagem de erro caso o índice seja inválido
        }
    }

    // Método para editar um veículo da lista
    public void editarVeiculo() {
        visualizarVeiculos(); // Chama o método para visualizar os veículos cadastrados
        System.out.println("Digite o índice do veículo que deseja editar:"); // Solicita que o usuário informe o índice do veículo a ser editado
        int indice = scanner.nextInt(); // Lê o índice informado pelo usuário
        if (indice >= 0 && indice < veiculos.size()) { // Verifica se o índice informado é válido
            indice = indice - 1; // Decrementa o índice em 1 para ajustar à contagem a partir de 1
            Veiculo veiculo = veiculos.get(indice); // Obtém o veículo da lista de acordo com o índice informado
            System.out.println("Digite a nova placa:"); // Solicita a nova placa ao usuário
            String novaPlaca = scanner.next(); // Lê a nova placa informada pelo usuário
            System.out.println("Digite o novo ano:"); // Solicita o novo ano ao usuário
            int novoAno = scanner.nextInt(); // Lê o novo ano informado pelo usuário
            veiculo.setPlaca(novaPlaca); // Define a nova placa do veículo
            veiculo.setAno(novoAno); // Define o novo ano do veículo
            System.out.println("Veículo editado com sucesso!"); // Exibe uma mensagem de sucesso
        } else {
            System.out.println("Índice inválido."); // Exibe uma mensagem de erro caso o índice seja inválido
        }
    }

// Método para exibir o menu de opções
    public void exibirMenu() {
        int opcao = 0; // Inicializa a variável de opção com 0
        while (opcao != 5) { // Loop continua até que o usuário escolha a opção para sair (opção 5)
            System.out.println("\n===== MENU ====="); // Exibe o cabeçalho do menu
            System.out.println("1. Cadastrar veículo"); // Exibe a opção para cadastrar um veículo
            System.out.println("2. Visualizar veículos"); // Exibe a opção para visualizar os veículos cadastrados
            System.out.println("3. Excluir veículo"); // Exibe a opção para excluir um veículo cadastrado
            System.out.println("4. Editar veículo"); // Exibe a opção para editar um veículo cadastrado
            System.out.println("5. Sair"); // Exibe a opção para sair do programa
            System.out.println("================"); // Exibe uma linha separadora
            System.out.println("Escolha uma opção:"); // Solicita ao usuário que escolha uma opção
            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário
            switch (opcao) { // Verifica a opção escolhida pelo usuário
                case 1: // Se a opção for 1, chama o método para cadastrar um veículo
                    cadastrarVeiculo();
                    break;
                case 2: // Se a opção for 2, chama o método para visualizar os veículos cadastrados
                    visualizarVeiculos();
                    break;
                case 3: // Se a opção for 3, chama o método para excluir um veículo
                    excluirVeiculo();
                    break;
                case 4: // Se a opção for 4, chama o método para editar um veículo
                    editarVeiculo();
                    break;
                case 5: // Se a opção for 5, exibe uma mensagem e finaliza o programa
                    System.out.println("Encerrando o programa...");
                    break;
                default: // Se a opção não for válida, exibe uma mensagem de erro
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
