Gerenciador de Arquivos

Projeto em Java 21 LTS que simula o gerenciamento de pedidos e produtos, utilizando Programação Orientada a Objetos (POO).

Desenvolvido para rodar no Eclipse.

Funcionalidades

Criar e gerenciar pedidos com produtos

Controle de quantidade, preço e subtotal de cada item

Status do pedido usando enum

Exibição detalhada de pedidos e total

Tecnologias

Java 21 LTS

IDE: Eclipse

Estrutura do Projeto
order-management/
│
├─ src/
│  ├─ entities/      # Classes: Order, OrderItem, Product
│  └─ main/          # Classe Main com execução do programa
│
└─ README.md

Como Rodar no Eclipse

Abra o Eclipse e importe o projeto:
File → Import → General → Existing Projects into Workspace → Next → Selecione a pasta do projeto → Finish

Certifique-se de que o JDK 21 está configurado:
Window → Preferences → Java → Installed JREs → Add → Standard VM → Selecione a pasta do JDK 21

Configure o projeto para usar Java 21:
Clique com o botão direito no projeto → Properties → Java Build Path → Libraries → Add Library → JRE System Library → Alternate JRE → JDK 21 → Finish

Execute a classe principal Main.java:
Clique com o botão direito → Run As → Java Application

Exemplo de Saída

<img width="712" height="750" alt="image" src="https://github.com/user-attachments/assets/de001f48-2aef-460f-922c-2861e187120f" />

Contribuição

Contribuições são bem-vindas!

Faça um fork do projeto

Crie uma branch (git checkout -b feature/nova-funcionalidade)

Commit suas alterações (git commit -m 'Adicionei nova funcionalidade')

Push para a branch (git push origin feature/nova-funcionalidade)

Abra um Pull Request


Ayrton Gabriel da Silva Carvalho
