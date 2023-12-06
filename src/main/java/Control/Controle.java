/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

//import Control.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.BasicDBObject;

public class Controle {

    public static void main(String[] args) {
        MongoClient mongo = CriaConexao();

        // VAMOS CRIAR A BASE DE DADOS, CASO NÃO EXISTA
        if (mongo != null) {
            DB db = mongo.getDB("CadCliente");
            System.out.println("BASE DE DADOS CRIADA");

            // CRIA UMA COLEÇÃO(TABLE), CASO NÃO EXISTA
            criarColecao(db, "usuarios");
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

    public static void criarColecao(DB db, String colecao) {
        try {
            DBCollection collection = db.getCollection(colecao);

            // Verifica se a coleção já existe
            if (collection == null) {
                // Cria a coleção se não existir
                db.createCollection(colecao, null);
                System.out.println("Coleção '" + colecao + "' criada com sucesso.");
            } else {
                System.out.println("Coleção '" + colecao + "' já existe.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar a coleção: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void insertUsuario(DB db, String colecao, String nome, String cpf, String email, String password) {
        DBCollection collection = db.getCollection(colecao);

        // CRIA OS DOCUMENTOS (REGISTROS) E INSERE AS INFORMAÇÕES
        BasicDBObject documento = new BasicDBObject();
        documento.put("nome", nome);
        documento.put("cpf", cpf);
        documento.put("email", email);
        documento.put("password", password);
        collection.insert(documento);
    }
    
}
