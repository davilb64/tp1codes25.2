#include <iostream>
#include <map>
#include <vector>
#include <string>

int main() {
    std::map<std::string, int> quantidade;
    std::vector<std::string> ordem;
    int cadastros, qntAtual;
    std::string itemAtual;

    std::cin >> cadastros;
    for (int i = 0; i < cadastros; ++i) {
        std::cin >> itemAtual >> qntAtual;
        if (quantidade.count(itemAtual) == 0) {
            ordem.push_back(itemAtual);
        }
        quantidade[itemAtual] = qntAtual;
    }

    std::string itemVenda;
    int qntVenda;
    std::cin >> itemVenda;

    while (itemVenda != "fim") {

        if (quantidade.count(itemVenda)) {
            std::cin >> qntVenda;
            quantidade[itemVenda] -= qntVenda;
            std::cout << itemVenda << " " << qntVenda << std::endl;
        } else {
            std::cout << itemVenda << " produto não encontrado" << std::endl;
        }
        std::cin >> itemVenda;
    }

    for (const auto& item : ordem) {
        std::cout << item << " " << quantidade[item] << std::endl;
    }
    std::cin >> itemVenda;
}
