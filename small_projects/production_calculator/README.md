<h1> Calculadora de Produção</h1>
<hr>
<p>
    Este projeto consiste numa aplicação de consola simples concebida para ajudar a monitorizar o desempenho de uma
     linha de produção ou de um turno de trabalho. O programa atua como um assistente analítico direto: 
     recolhe métricas operacionais inseridas pelo operador, executa os cálculos matemáticos essenciais e
      devolve um resumo claro do rendimento obtido.
</p>

<h2>Como Deve Funcionar o Programa</h2>
<p>O fluxo da aplicação divide-se em quatro fases lógicas consecutivas:</p>

<ol>
    <b><li>Entrada de Dados</li></b>
     <p>O programa começa por solicitar, sequencialmente, três valores inteiros ao utilizador:</p>
     <ul>
        <li><b>Unidades totais produzidas:</b> Quantidade bruta de peças saídas da linha no turno.</li>
        <li><b>Unidades defeituosas:</b> Quantidade de peças rejeitadas pelo controlo de qualidade.</li>
        <li><b>Objetivo de produção:</b> Meta estipulada para o turno em termos de peças boas/aproveitáveis.</li>
     </ul>

     <li><b>Processamento e Lógica de Negócio</b></li>
     <p>Com os valores em memória, o sistema realiza os seguintes cálculos e validações:</p>
     <ul>
        <li><b>Cálculo de Peças Úteis:</b> Determina a produção efetiva subtraindo os defeitos ao total produzido.</li>
        <li><b>Tratamento de Exceção e Percentagem de Rejeição:</b> Se o total de peças produzidas for maior que zero, calcula a proporção de defeitos em relação ao total:</li>
        <math display="block">
            <mtext>Taxa de Defeito (%)</mtext>
            <mo>=</mo>
            <mrow>
                <mo>(</mo>
                <mfrac>
                <mtext>Unidades Defeituosas</mtext>
                <mtext>Unidades Totais</mtext>
                </mfrac>
                <mo>)</mo>
            </mrow>
            <mo>×</mo>
            <mn>100</mn>
        </math>

        <p>(Nesta etapa, é fundamental converter temporariamente os números para casas decimais/ponto flutuante,
             caso contrário a divisão inteira resultará incorretamente em 0).</p>

        <li>Se o total produzido for zero, a taxa de defeito deve ser fixada diretamente em 0%, evitando uma falha de divisão por zero.</li>
        <li><b>Verificação da Meta:</b> Compara as unidades boas apuradas com a meta do turno. Se a produção útil for 
            igual ou superior ao objetivo definido, a meta é considerada cumprida; caso contrário, é considerada não atingida.</li>
     </ul>
</ol>