package br.com.sulamerica.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import br.com.sulamerica.dto.FaixaRecomendacao;

@Component
public class FireStoreIntegrationImpl implements CommandLineRunner {

	@Autowired
	Firestore firestore;

	Logger LOGGER = LoggerFactory.getLogger(FireStoreIntegrationImpl.class);

	FaixaRecomendacao readDocumentToObject() throws ExecutionException, InterruptedException {
		CollectionReference faixaRecomendacaoCollection = firestore.collection("FaixaRecomendacao");
		
		
		System.out.println("======================== [ENTIDADE COMPLETA] ====================================");
		QuerySnapshot querySnapshot = faixaRecomendacaoCollection.get().get();
		FaixaRecomendacao faixaRecomendacaoCompleta;
		
		for (Iterator<QueryDocumentSnapshot> entidadeCompletaIterator = querySnapshot.getDocuments().iterator(); entidadeCompletaIterator.hasNext();) {
			QueryDocumentSnapshot entidadeCompleta = entidadeCompletaIterator.next();
			faixaRecomendacaoCompleta = entidadeCompleta.toObject(FaixaRecomendacao.class);
			System.out.println("CodigoPrestador: " + faixaRecomendacaoCompleta.getCodigoPrestador());
			
		}
		
		ArrayList<String> listaPrestadores = new ArrayList<String>();
		listaPrestadores.add("585678567856");
		listaPrestadores.add("74567456745674");
		listaPrestadores.add("546756745675");
		
		querySnapshot = faixaRecomendacaoCollection.whereIn("codigoPrestador", listaPrestadores).get().get();
		FaixaRecomendacao faixaRecomendacao = null;

		
		
		System.out.println("======================== [ENTIDADE FILTRADA NO IN] ====================================");		
		for (Iterator<QueryDocumentSnapshot> iterator = querySnapshot.getDocuments().iterator(); iterator.hasNext();) {
			QueryDocumentSnapshot queryDocumentSnapshot = iterator.next();
			faixaRecomendacao = queryDocumentSnapshot.toObject(FaixaRecomendacao.class);
			System.out.println("CodigoPrestador: " + faixaRecomendacao.getCodigoPrestador());
		}

		LOGGER.info("Noixxx");

		return faixaRecomendacao;
	}

	@Override
	public void run(String... args) throws Exception {
		this.readDocumentToObject().getCodigoPrestador();
	}
}
