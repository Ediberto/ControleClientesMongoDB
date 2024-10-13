package com.mycompany.projetomongodb;

import com.mongodb.MongoClient; // Importe a classe correta
import java.util.List;

public class ConexaoMongoDB {
    public static void main(String[] args) {
        System.out.println("PRUEBA CONEXAO MONGODB");
        MongoClient mongo = new MongoClient("localhost", 27017);
        
        if(mongo != null) {
            System.out.println("LISTA DA BASE DE DADOS");
            List dbs = mongo.getDatabaseNames();
            for(int i = 0 ; i < dbs.size() ; i++) {
                System.out.println(i+"  -  "+dbs.get(i));
            }
        } else {
            System.out.println("ERRO DE CONEXÃO COM O BANCO");
        }
    }
}

//o código abaixo é para a versão do mongodb 4.x o CÓDIGO DE CIMA E PARA VERSÃO 3.X

/*package com.mycompany.projetomongodb;
import com.mongodb.MongoClient
public class ConexaoMongoDB {
    public static void main(String[] args){
        System.out.println("PRUEBA CONEXAO MONGODB");
        MongoClient mongo = new Mongo("localhost", 27017);
        
    }
}*/