#include <iostream>
#include <stdio.h>
#include <string>

typedef struct abrevs{
    char sigla[100];
    char nome[100];
} Abrevs;

int main(){
    int siglas;
    std::cin >> siglas;
    Abrevs dicionario[siglas];
    for (int i = 0; i < siglas; i++) {
        std::cin >> dicionario[i].sigla;
        std::cin >> dicionario[i].nome;
    }
    std::string consulta;
    std::getline(std::cin, consulta);
    std::string traducao;
    for (int i = 0; i < consulta.size(); i++) {

    }
}