package one.innovation.digital;

import java.util.HashMap;
import java.util.Map;

/********************************************************************************
 *
 * Objetivo: 1) Criar um Map.
 *           2) Adicionar os 26 estados brasileiros no map, onde a sigla será
 *              a chave e o nome do estado, o valor.
 *           3) Remover o estado de Minas Gerais.
 *           4) Adicionar o Distrito Federal.
 *           5) Verificar o tamanho do map.
 *           6) Remover o estado do Mato Grosso do Sul usando o nome.
 *           7) Navegar em todos os registros do map, mostrando no console no
 *              seguinte formato: NOME(Sigla).
 *           8) Verificar se o estado de Santa Catarina existe no map, buscando
 *              por sua sigla(SC).
 *           9) Verificar se o estado do Maranhão existe no map buscando
 *              por seu nome.
 * Autor  : Fernando Aguiar
 * Data   : 02.08.2021
 ********************************************************************************/
public class Main {

    public static void main(String[] args) {

        // (1) Criar um Map.
        Map<String, String > estadosBrasil = new HashMap<>();

        // (2) Adicionar os 26 estados brasileiros no map, onde a sigla será
        //     a chave e o nome do estado, o valor.
        estadosBrasil.put("AC","Acre");
        estadosBrasil.put("AL","Alagoas");
        estadosBrasil.put("AP","Amapá");
        estadosBrasil.put("AM","Amazonas");
        estadosBrasil.put("BA","Bahia");
        estadosBrasil.put("CE","Ceará");
        estadosBrasil.put("ES","Espírito Santo");
        estadosBrasil.put("GO","Goiás");
        estadosBrasil.put("MA","Maranhão");
        estadosBrasil.put("MT","Mato Grosso");
        estadosBrasil.put("MS","Mato Grosso do Sul");
        estadosBrasil.put("MG","Minas Gerais");
        estadosBrasil.put("PA","Pará");
        estadosBrasil.put("PB","Paraíba");
        estadosBrasil.put("PR","Paraná");
        estadosBrasil.put("PE","Pernambuco");
        estadosBrasil.put("PI","Piauí");
        estadosBrasil.put("RJ","Rio de Janeiro");
        estadosBrasil.put("RN","Rio Grande do Norte");
        estadosBrasil.put("RS","Rio Grande do Sul");
        estadosBrasil.put("RO","Rondônia");
        estadosBrasil.put("RR","Roraima");
        estadosBrasil.put("SC","Santa Catarina");
        estadosBrasil.put("SP","São Paulo");
        estadosBrasil.put("SE","Sergipe");
        estadosBrasil.put("TO","Tocantins");

        // (3) Remover o estado de Minas Gerais.
        estadosBrasil.remove("MG");

        // (4) Adicionar o Distrito Federal.
        estadosBrasil.put("DF","Distrito Federal");

        // (5) Verificar o tamanho do map.
        estadosBrasil.size();

        // (6) Remover o estado do Mato Grosso do Sul usando o nome.
        String siglaMS = null;
        for (Map.Entry<String,String> entry : estadosBrasil.entrySet()) {
            if (entry.getValue().equals("Mato Grosso do Sul")){
                siglaMS = entry.getKey();
            }
        }
        estadosBrasil.remove(siglaMS);

        // (7) Navegar em todos os registros do map, mostrando no console no
        //     seguinte formato: NOME(Sigla).
        for (Map.Entry<String,String> entry : estadosBrasil.entrySet()) {
            System.out.println(entry.getValue().toUpperCase() + "(" + entry.getKey() + ")");
        }

        // (8) Verificar se o estado de Santa Catarina existe no map, buscando
        //     por sua sigla(SC).
        boolean existeSC = estadosBrasil.containsKey("SC");
        if (existeSC) {
            System.out.println("O estado de Santa Catarina foi inserido no Mapa!");
        } else {
            System.out.println("O estado de Santa Catarina não foi inserido no Mapa!");
        }

        // (9) Verificar se o estado do Maranhão existe no map buscando
        //     por seu nome.
        boolean existeMA = estadosBrasil.containsValue("Maranhão");
        if (existeMA) {
            System.out.println("O estado do Maranhão foi inserido no Mapa!");
        } else {
            System.out.println("O estado do Maranhão não foi inserido no Mapa!");
        }
    }
}
