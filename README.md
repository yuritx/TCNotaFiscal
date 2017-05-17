# TCNotaFiscal

Enunciado
Objetivo

Desenvolva a camada de persistência e a camada de negócios do sistema que calcula a faixa de desconto no IPVA de acordo com o uso da Nota Fiscal Gaúcha.

Descrição

"Requisitos para o desconto do Bom Cidadão

a. Estar cadastrado no Programa NFG até 31/10/2017;
b. Ser proprietário de veículo emplacado no Rio Grande do Sul e pagante de IPVA no exercício de 2018;
c. Ter ao menos uma nota fiscal de aquisição (documentos de devolução e documentos cancelados não contam) com data de registro (não vale a data de emissão!) entre 1º/11/2016 à 31/10/2017.

As faixas de desconto são as seguintes:

• De 1 a 40 documentos fiscais registrados: 1% de desconto;
• De 41 a 99 documentos fiscais registrados: 3% de desconto;
• A partir de 100 documentos fiscais registrados: 5% de desconto."

* Fonte: https://nfg.sefaz.rs.gov.br/site/inicio.aspx

Note que nesta fase serão apenas aceitas Notas Fiscais, Cupons Fiscais e similares não serão aceitos.

Persistência

O sistema recebe dados pelo intercâmbio de arquivos texto, com campos de largura delimitada. Periodicamente, os arquivos são atualizados. Cada arquivo corresponde às notas de uma determinada pessoa física. O número do CPF está indicado no nome do arquivo.

Para validar o CPF, veja:
http://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097

Teste de Sistema

Para teste, utilize o JUnit e crie um teste para cada CPF válido, um teste para CPF inválido e um teste para CPF inexistente. O sistema deve retornar o valor de desconto para o CPF indicado. Um exceção deve ser gerada se o CPF é inválido ou inexistente.

Padrões de Projeto

Utilize o padrão DAO na camada de persistência. Adote o padrão "Domain Model" na camada de negócios e os demais padrões que considerar relevantes.

Coordenação de Equipe

Registre todas as tarefas em issues ou projects no GitHub. Cada tarefa é individual. A nota é individual. Sem registro, sem nota. A equipe pode ter no máximo cinco alunos.

Associe cada commit com seu respectivo issue via mensagem.

Exemplo:

% git commit -m "#5"

Associa o issue #5 ao commit.
