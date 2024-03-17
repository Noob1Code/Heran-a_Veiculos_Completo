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
 * @brief Class Motocicleta
 */
public class Motocicleta extends Veiculo {
    
    // Declaração da variável de instância cilindradas
    private int cilindradas;
    
    // Construtor da classe Motocicleta que recebe placa, ano e cilindradas como parâmetros
    public Motocicleta(String placa, int ano, int cilindradas){
        super(placa,ano); // Chama o construtor da classe pai (Veiculo) com os parâmetros placa e ano
        this.cilindradas = cilindradas; // Atribui o valor recebido à variável de instância cilindradas
    }
    
    // Método setter para atribuir um valor à variável de instância cilindradas
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas; // Atribui o valor recebido à variável de instância cilindradas
    }
    
    // Método getter para obter o valor da variável de instância cilindradas
    public int getCilindradas(){
        return cilindradas; // Retorna o valor da variável de instância cilindradas
    }
    
    // Sobrescrita do método toString para retornar uma representação em string dos dados da motocicleta
    @Override
    public String toString(){
        // Retorna uma string formatada com os detalhes da motocicleta, incluindo placa, ano e cilindradas
        return "Motocicleta\n [Placa = "+ super.getPlaca() + "\n Ano =" + super.getAno() + "\n cilindradas = "+ cilindradas + "]";
    }
}
