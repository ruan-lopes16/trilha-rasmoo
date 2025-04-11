# GIT
Sistema de controle de versão de arquivos qie nos permite desenvolver projetos, tanto individualmente quando em equipe.
Permite que tenhamos o controle de todo o histórico de arquivos e projetos que são adicionados, modificados ou removidos.
(histórico de quem, o que e onde foi modificado, adicionado ou removido)

# GITHUB
Plataforma que ajuda a manusear o git.
Mostra visualmente o todo o manuseio através do git.

## Clonando um repositório
Após a instalação do git na máquina, copie o link do seu repositório(<>Code >>> HTTPS), crie uma pasta no Windows para receber os arquivos, 
para clonar clique com o botão direito do mouse sobre a pasta e clique para abrir com o Bash, feito isso, basta digitar `$git clone https://urldorepositorio.git`

## Status de repositório local
`$git status`
Vê a situação do repositório que foi modificado

## Colocando arquivos a serem 'commitados'
`$git add .` -> **TODOS** os arquivos que foram modificados
`$git add nomeArquivo.txt` -> somente arquivo que nomeou seguido de sua extensão
Esse comando antecede o commit, adiciona em uma espécie de lista

## Commit
`$git commit -m "mensagem desejada"`
`-m` representa que virá uma mensagem

Em caso de erro no Bash, execute o comando que o próprio console dar
`$git config --global user.email "you@example.com"`
`$git config --global user.name "Your Name"`
Erro geralmente acusado quando não tem nenhuma conta logada no github

## Enviado para o GitHub
`$git push`
Envia **TODOS** os arquivos que foram 'commitados' anteriormente, para o GitHub (repositório remoto)

## Navegando entre versões
`$git reflog`
Mostra todos os commits feitos e quem os fez

`$git reset --hard 412ja9s` (id do commit)
Volta uma versão, caso tenha acontecido algo(não muito recomendado)

## Branches
Ramificações de desenvolvimento

`$git branch`
Vê a listagem de branches no repositório

`$git branch nomeBranch`
Cria uma nova branch

`$git checkout nomeBranch`
Troca a branch

*Ao alterar os arquivos na nova branch...
`$git status` -> para ver a branch que estamos e as modificações feitas e dar os comandos: `$git add .` + `$git commit -m "mensagem desejada"` + `$git push`

_Em caso de não ter uma branch criada no GitHub, ao dar `$git push`, acusará erro e dara o comando, execute-o!_
`$git push --set-upstream origin nomeBranch`

## Mesclagem de main e branches
Estar na branch que irá receber as modificações/arquivos
`$git merge nomeBranch`

- ATUALIZANDO REPOSITÓRIO REMOTO
`$git push`
*Obs.: não precisa de commit, pois já foi feito anteriormente e não houve alteração*

## Baixando atualizações após uma modificação
Em caso de atualizações no repositório remoto e as mesmas não terem sidas no seu repositório local, execute:

`$git pull`

Pega as informações da branch que já estão no repositório remoto e traz para o seu local

## Pull Request
Permissão para fazer uma junção de código dentro do repositório remoto
  - cria-se uma feature como nova branch
  `$git branch nomeFeature`
  - faz as modificações que deseja
  - `$git add nomefeature` + `$git push`
*Obs.: em caso de erro ao dar o push, execute o comando que será dado*

- No GitHub
  - mostrará a branch da feature criada
    - Pull Request
    - New pull request
      - verificar a base
      - verificar o compare
    - Create pull request
      - colocar os reviewers para dar a permissão (caso houver)
  - Dada a permissão
    - Merge pull request

Após pull request autorizado
- ir para a branch que foi atualizada e dar `$git pull` para atualizar os arquivos na máquina/repositório local

# PROJETO 
- Crie um projeto no GitHub, clone ele no seu computador;
- O projeto deve conter os seguintes itens:
  - Arquivo chamado 'nomes' - deve conter uma lista de nomes;
  - Arquivos chamado 'cidades' - deve conter uma lista de cidades;
  - Arquivo chamado 'times' - deve conter uma lista de times;
- Você deve criar uma branch para desenvolvimento, e manter ela atualizada, a cada arquivo que você criar.