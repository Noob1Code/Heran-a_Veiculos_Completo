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
 * @brief Class Carro
 */
public class Carro extends Veiculo {

    // Declaração das variáveis de instância cavalos, chassis e portas
    private int cavalos;
    private String chassis;
    private int portas;

    // Construtor da classe Carro que recebe placa, ano, cavalos e portas como parâmetros
    public Carro(String placa, int ano, int cavalos, int portas) {
        super(placa, ano); // Chama o construtor da classe pai (Veiculo) com os parâmetros placa e ano
        this.cavalos = cavalos; // Atribui o valor recebido à variável de instância cavalos
        this.portas = portas; // Atribui o valor recebido à variável de instância portas
    }

    // Método setter para atribuir um valor à variável de instância cavalos
    public void setCavalos(int cavalos) {
        this.cavalos = cavalos; // Atribui o valor recebido à variável de instância cavalos
    }

    // Método getter para obter o valor da variável de instância cavalos
    public int getCavalos() {
        return cavalos; // Retorna o valor da variável de instância cavalos
    }

    // Método setter para atribuir um valor à variável de instância portas
    public void setPortas(int portas) {
        this.portas = portas; // Atribui o valor recebido à variável de instância portas
    }

    // Método getter para obter o valor da variável de instância portas
    public int getPortas() {
        return portas; // Retorna o valor da variável de instância portas
    }

    // Sobrescrita do método toString para retornar uma representação em string dos dados do carro
    @Override
    public String toString() {
        // Retorna uma string formatada com os detalhes do carro, incluindo placa, ano, portas e cavalos
        return "Carro\n [Placa = " + super.getPlaca() + "\n Ano = " + super.getAno() + "\n Portas = " + portas + "\n Cavalos = " + cavalos + "]";
    }
}
