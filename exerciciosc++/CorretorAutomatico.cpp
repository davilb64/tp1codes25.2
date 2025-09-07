#include <iostream>
#include <vector>
#include <string>

int main() {
    int tamDicionario;
    bool correta = false;
    std::cin >> tamDicionario;

    std::vector<std::string> dicionario;
    dicionario.reserve(tamDicionario);

    for (int i = 0; i < tamDicionario; ++i) {
        std::string palavraAtual;
        std::cin >> palavraAtual;
        dicionario.push_back(palavraAtual);
    }

    std::string palavraAnalisada;
    std::cin >> palavraAnalisada;

    for (int i = 0; i < tamDicionario; ++i) {
        if (palavraAnalisada == dicionario[i]) {
            correta = true;
            std::cout << "palavra correta" << std::endl;
            break;
        }
    }


    if (!correta) {
        std::cout << "palavra incorreta" << std::endl;

        for (int i = 0; i < (int)palavraAnalisada.length() - 1; ++i) {
            std::string palavraTestada = palavraAnalisada;
            std::swap(palavraTestada[i], palavraTestada[i + 1]);

            for (int j = 0; j < tamDicionario; ++j) {
                if (palavraTestada == dicionario[j]) {
                    std::cout << dicionario[j] << "?" << std::endl;
                    correta = true;
                }
            }
        }
        if (!correta) {
            std::cout << "nenhuma sugestão" << std::endl;
        }
    }

    return 0;
}
