#include <iostream>
#include <map>
#include <vector>
#include <sstream>
#include <algorithm>
#include <cctype>

int main() {
    int siglas;
    std::cin >> siglas;

    std::map<std::string, std::string> dicionario;
    std::vector<std::string> ordem;

    for (int i = 0; i < siglas; i++) {
        std::string sigla, palavra;
        std::cin >> sigla >> palavra;
        ordem.push_back(sigla);
        std::string lowerSigla = sigla;
        std::transform(lowerSigla.begin(), lowerSigla.end(), lowerSigla.begin(), ::tolower);
        dicionario[lowerSigla] = palavra;
    }

    std::cin.ignore();

    std::string consulta;
    std::getline(std::cin, consulta);

    std::stringstream ss(consulta);
    std::string palavra;
    std::vector<std::string> palavras;

    while (ss >> palavra) {
        std::string original = palavra;
        std::string lowerPalavra = palavra;
        std::transform(lowerPalavra.begin(), lowerPalavra.end(), lowerPalavra.begin(), ::tolower);

        if (dicionario.find(lowerPalavra) != dicionario.end()) {
            palavra = dicionario[lowerPalavra];
        }

        else if (std::isupper(original[0])) {
            palavra[0] = std::toupper(original[0]);
            for (size_t i = 1; i < original.size(); i++) {
                palavra[i] = original[i];
            }
        }

        else {
            palavra = original;
        }

        palavras.push_back(palavra);
    }

    std::string resultado;
    for (size_t i = 0; i < palavras.size(); i++) {
        if (i > 0) resultado += " ";
        resultado += palavras[i];
    }

    std::cout << resultado << std::endl;

    return 0;
}
