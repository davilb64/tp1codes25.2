#include <iostream>
#include <iomanip>

int main() {
    char sexo;
    int homem = 0, mulher = 0;
    std::cin >> sexo;
    while (sexo != 'q') {
        if (sexo == 'h') {
            homem++;
        }
        else if (sexo == 'm') {
            mulher++;
        }
        std::cin >> sexo;
    }
    double totalHomem, totalMulher, total;
    totalHomem = homem * 12.50;
    totalMulher = mulher * 7.40;
    total = totalHomem + totalMulher;
    std::cout << homem << " " << mulher << std::endl;
    std::cout << std::fixed << std::setprecision(2) << totalHomem << " " << std::fixed << std::setprecision(2) << totalMulher << " " << std::fixed << std::setprecision(2) << total << std::endl;


    return 0;
}