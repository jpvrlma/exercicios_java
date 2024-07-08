
# Comandos Git: Guia Completo e Aprimorado

Este guia detalhado apresenta os comandos Git mais utilizados, com descrições aprimoradas, exemplos práticos e dicas valiosas para otimizar seu workflow.

## 1. Inicializando um Repositório Git:

* `git init`: Cria um novo repositório Git na pasta atual.

## 2. Verificando o Status do Repositório:

* `git status`: Mostra o status dos arquivos no seu diretório de trabalho em relação ao repositório Git.
  * `git status -s`: Apresenta uma visão simplificada do status, incluindo arquivos modificados, novos e não rastreados.

## 3. Adicionando Arquivos ao Rastreamento Git:

* `git add nome_do_arquivo.formato`: Adiciona um arquivo específico ao rastreamento do Git.
  * `git add .`: Adiciona todos os arquivos não rastreados no diretório atual.
  * `git add *.formato`: Adiciona todos os arquivos com a extensão especificada (.js, .css, etc.) ao rastreamento.

## 4. Confirmando Alterações com Commits:

* `git commit -m "Mensagem do commit"`: Registra as alterações rastreadas com uma mensagem descritiva.
  * `git commit --amend -m "Mensagem atualizada"`: Modifica a mensagem do último commit.

## 5. Ignorando Arquivos com .gitignore:

* `.gitignore`: Um arquivo especial que define quais arquivos o Git deve ignorar, evitando que sejam rastreados acidentalmente.
  * As regras do .gitignore geralmente são configuradas na raiz do seu repositório.

## 6. Configurando o Git:

* `git config`: Permite definir configurações globais e específicas do repositório, como nome de usuário, email e editor de texto padrão.
  * `git config --global user.name "Seu Nome"`: Define seu nome de usuário Git.
  * `git config --global user.email "SeuEmail@provedor.com"`: Define seu email Git.
  * `git config credential.helper store`: Salva suas credenciais de autenticação para evitar digitar a senha a cada push.

## 7. Visualizando o Histórico de Commits:

* `git log`: Exibe o histórico de commits do repositório, incluindo mensagens, autores e datas.
   * `git log --pretty=oneline`: Mostra uma lista simplificada com apenas o ID do commit e sua mensagem.

## 8. Examinando Detalhes de um Commit:

* `git show SHA1_do_commit`: Exibe informações detalhadas sobre um commit específico, incluindo arquivos modificados, diff e mensagem.

## 9. Restaurando um arquivo ou mudando seu stage

* `git restore <nome_do_arquivo>`: Restaura o arquivo para o estado do último commit.
* `git restore --stage <nome_do_arquivo>`: Retorna o arquivo para outra área.
* `git restore --source <commit_hash> <nome_do_arquivo>` : Restaura o arquivo para o estado de um commit específico.

## 10. Gerenciando Branches:

* `git branch`: Lista as branches existentes no repositório.
  * `git branch nome_da_branch`: Cria uma nova branch.
  * `git branch -d nome_da_branch`: Exclui uma branch (apenas após mesclagem ou confirmação das alterações).
  * `git branch -m <nome_antigo_da_branch> <novo_nome_da_branch>`: Renomeia uma branch no git.

## 11. Alternando entre Branches:

* `git checkout nome_da_branch`: Troca para a branch especificada.
  * `git checkout --nome_do_arquivo`: Restaura um arquivo para o estado do último commit.

## 12. Integrando Branches:

* `git merge nome_da_branch`: Integra as modificações da branch especificada na branch atual.
  * Este comando pode gerar conflitos de mesclagem que precisam ser resolvidos manualmente.

## 13. Adicionando um Repositório Remoto:

* `git remote add origin https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git`: Vincula o repositório local ao seu repositório remoto no GitHub.
  * `git remote -v`: Lista os repositórios remotos vinculados.

## 14. Enviando Alterações para o Repositório Remoto:

* `git push`: Envia as alterações do seu branch local para o repositório remoto.
  * `git push -u origin master`: Envia pela primeira vez e configura o push para o branch "master".

## 15. Clonando um repositório existente.

* `git clone <url_do_repositorio>`: Seleciona um repositório e cria uma cópia para seu computador local.

## 16. Mantendo seu repositório git atualizado

* `git pull <branch>`: Atualiza o repositório local com as últimas informações do repositório remoto e as mescla automaticamente na sua branch local.
* `git fetch <branch>`: Atualiza o repositório local com as últimas informações (commits, branches e tags) do repositório remoto sem mesclá-las na sua branch local. 

# Dicas Extras:

* Utilize atalhos para agilizar seu workflow:
  * `git co`: para `git checkout`
  * `git st`: para `git status`
  * `git cm`: para `git commit`