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

     <h2>Data input validations</h2>
     <hr>
     <table>
        <thead>
            <tr>
                <th>Test Scenario</th>
                <th>Produced</th>
                <th>Defective</th>
                <th>Target</th>
                <th>Expected Output</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Normal case (target met)</td>
                <td>1000</td>
                <td>50</td>
                <td>900</td>
                <td>950 good, 5.0% defects, Target met</td>
            </tr>
            <tr>
                <td>Normal case (target missed)</td>
                <td>800</td>
                <td>100</td>
                <td>750</td>
                <td>700 good, 12.5% defects, Target not met</td>
            </tr>
            <tr>
                <td>Line stopped (division by zero)</td>
                <td>0</td>
                <td>0</td>
                <td>500</td>
                <td>0 good, 0.0% defects, Target not met</td>
            </tr>
            <tr>
                <td>Perfect shift</td>
                <td>500</td>
                <td>0</td>
                <td>500</td>
                <td>500 good, 0.0% defects, Target met</td>
            </tr>
        </tbody>
    </table>
</ol>