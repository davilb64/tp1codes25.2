#include <iostream>
#include <iomanip>

int main() {
    int tipoLoteamento, metragem;
    std::cin >> tipoLoteamento;
    std::cin >> metragem;
    if (tipoLoteamento != 1 && tipoLoteamento != 2) {
        std::cout << "Entrada inválida!" << std::endl;
    }
    else if (metragem <= 0 ) {
        std::cout << "Entrada inválida!" << std::endl;
    }
    else {
        double valorFinal;
        if (tipoLoteamento == 1) {
            if (metragem < 200) {
                valorFinal = metragem;
            }
            else {
                valorFinal = metragem * 1.2;
            }

        }
        else {
            if (metragem < 200) {
                valorFinal = metragem * 1.1;
            }
            else {
                valorFinal = metragem * 1.3;
            }
        }
        std::cout << std::fixed << std::setprecision(2) << valorFinal << std::endl;

    }

    return 0;
}