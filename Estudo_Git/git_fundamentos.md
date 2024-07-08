## Git Fundamentos

# Tópicos Abordados

* [Tópico 1] O que é o Git?
* [Tópico 2] Trabalho simultãneo
* [Tópico 3] Flow do Git

## Detalhes do Tópico 1

* Git é um sistema de controle de versão feito por Linus Torvalds.
* Um controle de versão é um sistema que gerencia e registra todas as alterações feitas em um arquivo,de forma a permitir que voce futuramente possa recuperar versões especificas. Como se estivesse usando uma máquina do tempo.
* Permite que outras pessoas consigam trabalhar simultaneamente no mesmo projeto sem que haja conflitos.

## Detalhes do Tópico 2

* O Git é um sistema distribuído, o que significa que cada colaborador possui uma cópia completa do repositório em sua máquina. Isso permite que todos trabalhem offline e sincronizem suas alterações posteriormente.
* Branches O Git utiliza branches para gerenciar diferentes versões do projeto ou linhas de desenvolvimento independentes. Isso permite que você experimente novas ideias sem afetar o código principal.

## Detalhes do Tópico 3

* Cada projeto é dividido em 3 diferentes estágios, Working Directory, Staging area, Git directory.
* Working directory é quando você acessa o repositório e salva a base do sistema em sua máquina para que assim comece a ajudar no desenvolvimento. A partir do momento em que você usa um "Git add" esses arquivos editados vão para uma área de espera, esta chamada de Staging area.
* Staging area é onde os arquivos já modificados ficam antes de serem enviados de volta ao repositório,assim que voce usar um "Git commit" esses arquivos vão ir para o repositório final.
* Git Directory armazena todas as informações sobre o histórico do projeto, como commits, branches e metadados.
* Essas divisões deixam o Git mais confiavel do que outros controles de versão.