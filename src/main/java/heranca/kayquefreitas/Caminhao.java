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
 * @brief Class Caminhao
 */
public class Caminhao extends Veiculo {
    // Declaração da variável de instância eixo

    private int eixo;

    // Construtor da classe Caminhao que recebe placa, ano e eixo como parâmetros
    public Caminhao(String placa, int ano, int eixo) {
        super(placa, ano); // Chama o construtor da classe pai (Veiculo) com os parâmetros placa e ano
        this.eixo = eixo; // Atribui o valor recebido à variável de instância eixo
    }

    // Método setter para atribuir um valor à variável de instância eixo
    public void setEixo(int eixo) {
        this.eixo = eixo; // Atribui o valor recebido à variável de instância eixo
    }

    // Método getter para obter o valor da variável de instância eixo
    public int getEixo() {
        return eixo; // Retorna o valor da variável de instância eixo
    }

    // Sobrescrita do método toString para retornar uma representação em string dos dados do caminhão
    @Override
    public String toString() {
        // Retorna uma string formatada com os detalhes do caminhão, incluindo placa, ano e eixo
        return "Caminhao \n [Placa = " + super.getPlaca() + "\n Ano = " + super.getAno() + "\n Eixos = " + eixo + "]";
    }
}
