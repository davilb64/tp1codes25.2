#include <iostream>
#include <iomanip>

int main() {
    double entradaEnergia, custoEnergia, TAXA = 5.0, totalAPagar;
    std::cin >> entradaEnergia;

    if (entradaEnergia<=500) {
        custoEnergia = entradaEnergia * 0.02;
    }
    else if (entradaEnergia<=1000) {
        custoEnergia = 50 + (entradaEnergia - 500) * 0.05;
    }
    else {
        custoEnergia = 350 + (entradaEnergia - 1000) * 0.10;
    }
    totalAPagar = custoEnergia + TAXA;
    std::cout << std::fixed << std::setprecision(2) << custoEnergia << " " << std::fixed << std::setprecision(2) << TAXA << " " << std::fixed << std::setprecision(2) << totalAPagar << std::endl;
}
