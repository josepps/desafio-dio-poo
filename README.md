## Desafio Dio

Esse prójeto é um desadio de código do bootcamp da [DIO](https://www.dio.me/) em parceria com a [TQI](https://www.tqi.com.br/).

## Aula 1

<h2> 👣 Passo-a-Passo</h2>

<p>
<strong>	1.</strong> Criar a classe Main que é onde nosso projeto vai rodar. <br>
<strong>	2.</strong> Criar classe Curso e Mentoria. <br>
<strong>	3.</strong> Criar atributos, do Curso e Mentoria.<br> 
<strong>	OBS.</strong> Se não colocar o modificador de acesso por defalt é pulblic, mas é uma boa prátiva dusar o private.<br>
<strong>	4.</strong>Criar Get e Set das classe<br>
<strong>	OBS.</strong> A IDE tem atalhos que ajuda, na Visual Studio Code, clica com o botão direito na pasta da Classe, vai em Source Action, ai vai ver os atalhos.<br>
<strong>	5.</strong> Sobescrer o ToString, com o @Override.<br>
<strong>	6.</strong> instanciar objetos, Main e Mentoria, na Main, usando o new. <br>
<strong>	7.</strong> Setar os valores dos objetos com os métodos SET.<br></p>

---

<h2> Classe Java</h2>

<p> Uma classe em Java é um modelo que define um conjunto de atributos (variáveis) e métodos (funções) que podem ser utilizados para criar objetos com características semelhantes. As classes fornecem uma maneira de organizar e estruturar o código em um programa, tornando-o mais legível, reutilizável e fácil de manter. Cada objeto criado a partir de uma classe tem seus próprios valores para os atributos da classe e pode executar os métodos definidos na classe. Em resumo, uma classe é uma estrutura básica de programação orientada a objetos em Java. </p>


<h2> Classe Java Main</h2>

<p> A classe Java Main é a classe principal em um projeto Java, é o ponto de partida para a execução do programa. Ela contém o método main, que é o primeiro método a ser executado quando o programa é iniciado. O método main é onde as instruções do programa são escritas e onde a lógica do programa é implementada. É a partir deste ponto que o programa começa a executar suas funções e processos. Em resumo, a classe Java Main é a base do programa, é onde tudo começa e onde o fluxo do programa é definido. </p>


<h2> Modificadores de acesso Java</h2>

<p> Modificadores de acesso em Java são palavras-chave usadas para definir a visibilidade de variáveis, métodos e classes em um programa. Eles podem ser públicos, privados ou protegidos. O modificador público torna o elemento acessível a qualquer parte do programa, o privado torna o elemento acessível apenas dentro da classe em que foi declarado e o protegido torna o elemento acessível dentro da mesma classe e subclasses. A escolha do modificador correto é importante para garantir a segurança e a integridade do código, além de facilitar a manutenção e reutilização do mesmo. </p>


<h2> Subescrever métodos com o @Override </h2>

<p> O @Override é uma anotação do Java que indica que um método está sobrescrevendo um método da superclasse. Isso ajuda a garantir que o método esteja realmente sobrescrevendo o comportamento da superclasse e pode detectar erros de digitação no nome do método. É uma boa prática de programação usar essa anotação sempre que você estiver sobrescrevendo um método da superclasse. O compilador irá verificar se o método está correto e gerará um erro se houver algum problema. Isso ajuda a evitar bugs em tempo de execução e a tornar o código mais seguro e confiável.</p>


## Aula 2

<h2> 👣 Passo-a-Passo</h2>

<p>
<strong>	1.</strong> Criar Class conteudo, vai ser uma classe mãe de curso e mentoria <br>
<strong>	2.</strong> Extender a classe conteudo em mentoria e curso <br></p>

---

<h2> Modificador "static" </h2>

<p> O modificador "static" em Java indica que um método, variável ou bloco de código pertence à classe em si, e não a uma instância específica dessa classe. Isso significa que esses membros podem ser acessados diretamente pela classe, sem precisar criar um objeto a partir dela. Um exemplo comum de uso de métodos estáticos é quando eles são utilizados como utilitários, ou seja, funções que realizam tarefas específicas que não estão diretamente relacionadas ao objeto da classe. Variáveis estáticas, por sua vez, são usadas quando se deseja ter um único valor compartilhado por todas as instâncias da classe. Em geral, o uso do modificador "static" deve ser cuidadoso, já que ele pode levar a problemas de concorrência e pode dificultar a manutenção do código.</p>

<h2> A palavra-chave "abstract" </h2>

<p> A palavra-chave "abstract" é usada em Java para indicar que uma classe ou método não pode ser instanciado diretamente, ou seja, não pode ser utilizado por si só. Uma classe abstrata serve como uma classe base para outras classes que podem ser instanciadas. Métodos abstratos são declarados sem uma implementação, e devem ser implementados pelas classes filhas. Isso permite que as classes filhas forneçam uma implementação específica do método, tornando-as mais flexíveis e adaptáveis. Classes e métodos abstratos são marcados com a palavra-chave "abstract" e não podem ser usados diretamente, apenas por meio de suas subclasses ou classes filhas.</p>

<h2> O "extends" </h2>

<p> O extends é uma palavra-chave em Java usada para estabelecer uma relação de herança entre classes. Quando uma classe herda de outra usando o extends, ela adquire os campos e métodos da classe pai e pode adicionar novos campos e métodos ou sobrescrever os já existentes. Isso permite que uma classe filha reutilize o código da classe pai e também possa ter comportamentos específicos adicionais. Para usar a herança em Java, basta incluir a palavra-chave extends seguida do nome da classe pai, após o nome da classe filha, na declaração da classe. Por exemplo: public class MinhaClasseFilha extends MinhaClassePai { ... }.</p>

<h2> O polimorfismo </h2>

<p> polimorfismo em Java é uma característica da programação orientada a objetos que permite que objetos de diferentes classes sejam tratados como se fossem do mesmo tipo. Isso é possível através da herança e da sobrescrita de métodos. Por exemplo, se uma classe Animal possui um método "fazerSom", as classes Cachorro e Gato que herdam de Animal podem sobrescrever esse método e definir um som específico para cada um. Dessa forma, mesmo que os objetos sejam diferentes, eles podem ser tratados como objetos do tipo Animal, já que possuem o mesmo método "fazerSom". O polimorfismo é muito útil para escrever código mais genérico e reutilizável.</p>

## Aula 3

<h2> 👣 Passo-a-Passo</h2>

<p>
<strong>	1.</strong> Criar Class Bootcamp e Dev.<br>
<strong>	2.</strong> Sobeescreve o equals e hashCode<br></p>

---

<h2> O pequals e hashCode </h2>

<p> Os métodos equals e hashCode são usados em Java para comparar objetos. O método equals compara se dois objetos são iguais e o método hashCode retorna um valor inteiro único para cada objeto. Esses métodos são importantes para garantir a consistência em coleções Java, como o HashSet e o HashMap. O método equals é usado para verificar se um objeto já existe em uma coleção, enquanto o método hashCode é usado para recuperar o objeto correspondente. É importante lembrar que se dois objetos são iguais de acordo com o método equals, eles devem ter o mesmo valor de hashCode.</p>