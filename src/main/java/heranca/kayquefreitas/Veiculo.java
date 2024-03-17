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
 * @brief Class Veiculo
 */
public abstract class Veiculo {

    private String placa;
    private int ano;
    public Veiculo() {
    }

    // Construtor da classe Veiculo que recebe placa e ano como parâmetros
    public Veiculo(String placa, int ano) {
        super(); // Chama o construtor da classe pai (nesse caso, não é necessário)
        this.placa = placa; // Atribui o valor de placa recebido ao atributo placa da instância
        this.ano = ano; // Atribui o valor de ano recebido ao atributo ano da instância
    }

    // Método setter para atribuir um valor à variável de instância placa
    public void setPlaca(String placa) {
        this.placa = placa; // Atribui o valor recebido à variável de instância placa
    }

    // Método setter para atribuir um valor à variável de instância ano
    public void setAno(int ano) {
        this.ano = ano; // Atribui o valor recebido à variável de instância ano
    }

    // Método getter para obter o valor da variável de instância placa
    public String getPlaca() {
        return placa; // Retorna o valor da variável de instância placa
    }

    // Método getter para obter o valor da variável de instância ano
    public int getAno() {
        return ano; // Retorna o valor da variável de instância ano
    }

    // Sobrescrita do método toString para retornar uma representação em string dos dados do veículo
    @Override
    public String toString() {
        return "Veiculo [Ano = " + ano + "Placa =" + placa + "]";
    }
}
