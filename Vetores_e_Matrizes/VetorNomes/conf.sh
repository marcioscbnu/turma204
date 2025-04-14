#!/bin/bash

# Solicita dados ao usuário
git init
read -p "Digite seu nome de usuário: " nome
read -p "Digite seu e-mail: " email
read -p "Digite o endereço do repositório remoto: " url

# Configura o Git
git config --global user.name "$nome"
git config --global user.email "$email"

# Renomeia a branch atual para main
git branch -M main

# Adiciona o repositório remoto
git remote add origin "$url"

echo "Configuração concluída com sucesso!"
