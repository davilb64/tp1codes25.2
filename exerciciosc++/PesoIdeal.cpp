#include <iostream>
#include <iomanip>

int main() {
    double altura, pesoIdeal;
    char sexo;

    std::cin >> altura;
    std::cin >> sexo;


    if (altura<0) {
        std::cout << "Entrada inválida!" << std::endl;
    }
    else if(sexo != 'm' &&  sexo != 'f'){
        std::cout << "Entrada inválida!" << std::endl;
    }

    else {
        if (sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        }
        else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        std::cout << std::fixed << std::setprecision(1) << pesoIdeal << " kg" << std::endl;
    }

    
    return 0;
}