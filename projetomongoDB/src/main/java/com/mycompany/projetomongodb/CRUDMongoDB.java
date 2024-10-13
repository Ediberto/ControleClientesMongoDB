package com.mycompany.projetomongodb;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

public class CRUDMongoDB {
    public static void main(String[]args){
        MongoClient mongo = CriaConexao();
        //VAMOS CRIAR A BASE DE DADOS, CASO NÃO EXISTA
        if(mongo != null) {
            DB db = mongo.getDB("CadCliente");
            System.out.println("BASE DE DADOS CRIADA");
            //CRIA UMA COLECTION(TABLE), CASO NÃO EXISTA
            //INSERIR DOCUMENTOS NA TABLE
          //  insertUsuario(db, "usuarios", "Lucia", "Portugal");
           // insertUsuario(db, "usuarios", "Marta", "France");
           // insertUsuario(db, "usuarios", "Pedro", "Mexico");
           //MOSTRAR TODOS OS DOCUMENTOS DA COLECTION usuarios (LER)
           //mostrarColection(db, "usuarios");
           //MOSTRAR TODOS OS DOCUMENTOS DA COLECTION usuarios (LER) por um determinado nome
           //buscarPorNome(db, "usuarios", "Ediberto");
        }
    }
    public static MongoClient CriaConexao() {
    try {
        System.out.println("CadCliente CONEXAO MONGODB");
        MongoClient mongo = new MongoClient("localhost", 27017);
        return mongo;
    } catch (Exception e) {
        System.out.println("Erro na conexão com o MongoDB: " + e.getMessage());
        e.printStackTrace();
        return null;
    }
}


    public static void insertUsuario(DB db, String colection, String nome, String cpf, String email, String password) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DBCollection colec = db.getCollection(colection);
        //CRIA OS DOCUMENTO(REGISTROS) E INSERE AS INFORMAÇÕES
        BasicDBObject documento = new BasicDBObject();
        documento.put("nome", nome);
        documento.put("cpf", cpf);
        documento.put("email", email);
        documento.put("password", password);
        colec.insert(documento);
    }
    //MOSTRAR TODOS OS DOCUMENTOS DA COLECTION usuarios(LER)
    private static void mostrarColection(DB db, String colection) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DBCollection colec = db.getCollection(colection);
        DBCursor cursor = colec.find();
        while(cursor.hasNext()) {
            System.out.println("* "+ cursor.next().get("nome") + " - " + cursor.curr().get("pais"));
        }
    }
    //MOSTRAR TODOS OS DOCUMENTOS DA COLECTION usuarios (LER) por um determinado nome
    private static void buscarPorNome(DB db, String colection, String ediberto) {
        DBCollection colec = db.getCollection(colection);
        //CRIAR UM FILTRO NA CONSULTA NO CAMPO nome
        BasicDBObject consulta = new BasicDBObject();
        consulta.put("nome",ediberto);
        //BUSCA E MOSTRA NOS DOCUMENTOS QUE POSSUIREM O VALOR DA CONSULTA
        DBCursor cursor = colec.find(consulta);
        while(cursor.hasNext()) {
            System.out.println("-- " + cursor.next().get("nome") + " - " + cursor.curr().get("pais"));
        }
    }

    public boolean consultarUsuario(DB db, String colection, String email, String password) {
    DBCollection colec = db.getCollection(colection);

    // Cria um filtro para procurar pelo email e senha
    BasicDBObject query = new BasicDBObject("email", email)
        .append("password", password);

    // Realiza a consulta na coleção
    DBCursor cursor = colec.find(query);

    // Verifica se o usuário existe
    return cursor.hasNext();
}

    
}

