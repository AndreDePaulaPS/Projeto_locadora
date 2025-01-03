<body>
    <h1>Projeto Locadora de Veículos - Kotlin (Iniciante)</h1>
    <hr>
    <h2>Descrição</h2>
    <p>
        Este projeto é um sistema simples para gerenciar uma locadora de veículos, abordando funcionalidades como:
    </p>
    <ul>
        <li>Cadastro de diferentes tipos de veículos (carros, motos, caminhões).</li>
        <li>Gerenciamento de clientes.</li>
        <li>Controle de aluguéis (quem alugou o quê, por quanto tempo e custo).</li>
        <li>Relatórios de veículos disponíveis e alugados.</li>
    </ul>
    <hr>
    <h2>Conceitos de OOP Aplicados</h2>
    <ol>
        <li><strong>Abstração:</strong>  
            <ul>
                <li>Classes para representar veículos, clientes e aluguéis.</li>
                <li>Interfaces para definir comportamentos comuns.</li>
            </ul>
        </li>
        <li><strong>Encapsulamento:</strong>  
            <ul>
                <li>Controle de acesso a dados sensíveis usando modificadores como <code>private</code> e <code>protected</code>.</li>
            </ul>
        </li>
        <li><strong>Herança:</strong>  
            <ul>
                <li>Classes específicas como <code>Carro</code>, <code>Moto</code>, <code>Caminhao</code>, que herdam da classe base <code>Veiculo</code>.</li>
            </ul>
        </li>
        <li><strong>Polimorfismo:</strong>  
            <ul>
                <li>Métodos que se comportam de forma diferente dependendo do tipo de veículo.</li>
            </ul>
        </li>
        <li><strong>Composição:</strong>  
            <ul>
                <li>Uma classe <code>Locadora</code> que utiliza objetos de outras classes para gerenciar o sistema.</li>
            </ul>
        </li>
        <li><strong>Tratamento de Exceções:</strong>  
            <ul>
                <li>Gerenciamento de entradas inválidas e estados inconsistentes.</li>
            </ul>
        </li>
    </ol>
    <hr>
    <h2>Estrutura do Sistema</h2>
    <h3>Classes principais:</h3>
    <ul>
        <li><code>Veiculo</code> (classe abstrata ou interface).</li>
        <li><code>Carro</code>, <code>Moto</code>, <code>Caminhao</code> (especializações de <code>Veiculo</code>).</li>
        <li><code>Cliente</code>.</li>
        <li><code>Aluguel</code>.</li>
        <li><code>Locadora</code> (classe gerenciadora).</li>
    </ul>
    <h3>Comportamentos e funcionalidades:</h3>
    <ul>
        <li>Métodos para registrar, buscar e atualizar veículos.</li>
        <li>Métodos para cadastrar e listar clientes.</li>
        <li>Métodos para iniciar e finalizar aluguéis.</li>
    </ul>
    <hr>
    <h2>Etapas do Projeto</h2>
    <ol>
        <li>
            <strong>Planejamento:</strong>  
            <ul>
                <li>Escreva os requisitos básicos do sistema em um diagrama simples.</li>
                <li>Desenhe um diagrama de classes UML para visualizar como as classes interagem.</li>
            </ul>
        </li>
        <li>
            <strong>Implementação Inicial:</strong>  
            <ul>
                <li>Crie a classe <code>Veiculo</code> com propriedades básicas como <code>marca</code>, <code>modelo</code>, <code>ano</code>, e <code>disponibilidade</code>.</li>
                <li>Implemente as subclasses <code>Carro</code>, <code>Moto</code>, e <code>Caminhao</code> com propriedades adicionais, como <code>capacidadePortaMala</code>.</li>
            </ul>
        </li>
        <li>
            <strong>Adicione Funcionalidade:</strong>  
            <ul>
                <li>Implemente métodos na classe <code>Locadora</code> para gerenciar o sistema:
                    <ul>
                        <li>Cadastrar veículos.</li>
                        <li>Listar veículos disponíveis.</li>
                        <li>Registrar clientes.</li>
                        <li>Iniciar e finalizar aluguéis.</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <strong>Tratamento de Erros:</strong>  
            <ul>
                <li>Use <code>try</code> e <code>catch</code> para lidar com exceções, como tentativa de alugar um veículo indisponível.</li>
            </ul>
        </li>
        <li>
            <strong>Testes:</strong>  
            <ul>
                <li>Simule operações no sistema, como adicionar veículos, realizar aluguéis e listar status.</li>
            </ul>
        </li>
    </ol>
    <hr>
    <h2>Tecnologias Utilizadas</h2>
    <ul>
        <li><strong>Linguagem:</strong> Kotlin</li>
        <li><strong>Paradigma:</strong> Programação Orientada a Objetos (OOP)</li>
    </ul>
    <hr>
    <h2>Como Usar</h2>
    <ol>
        <li>Clone este repositório:
            <pre><code>git clone https://github.com/seu-usuario/projeto-locadora-veiculos.git</code></pre>
        </li>
        <li>Abra o projeto no seu IDE Kotlin favorita (IntelliJ IDEA recomendado).</li>
        <li>Execute o arquivo principal para testar as funcionalidades básicas do sistema.</li>
        <li>Experimente adicionar novos veículos, clientes e realizar aluguéis no sistema.</li>
    </ol>
    <hr>
    <h2>Contribuição</h2>
    <p>
        Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades para este projeto! Faça um fork e envie um pull request.
    </p>
    <hr>
    <h2>Contato</h2>
    <ul>
        <li><strong>E-mail:</strong> andrepps22@gmail.com</li>
        <!--<li><strong>LinkedIn:</strong> <a href="https://www.linkedin.com/in/seu-perfil" target="_blank">Seu Nome</a></li>-->
    </ul>
    <hr>
    <p><strong>Divirta-se explorando os conceitos de Kotlin e OOP com este projeto! 🚀</strong></p>
</body>
</html>
