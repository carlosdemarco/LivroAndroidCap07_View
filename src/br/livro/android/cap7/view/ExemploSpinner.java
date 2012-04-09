package br.livro.android.cap7.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import br.livro.android.cap7.R;

/**
 * Exemplo de Spinner
 * 
 * @author ricardo
 * 
 */
public class ExemploSpinner extends Activity {
	// Planetas
	private int[] imagens = { 
					R.drawable.mercurio, 
					R.drawable.venus, 
					R.drawable.terra, 
					R.drawable.marte,
					R.drawable.jupiter, 
					R.drawable.saturno, 
					R.drawable.urano, 
					R.drawable.netuno, 
					R.drawable.plutao 
					};
	
	private String[] planetas = new String[] { 
					"Mercúrio", 
					"Venus", 
					"Terra", 
					"Marte", 
					"Júptier", 
					"Saturno", 
					"Urano",
					"Netuno", 
					"Plutão" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exemplo_spinner);

		final ImageView imagem = (ImageView) findViewById(R.id.img);

		final Spinner combo = (Spinner) findViewById(R.id.comboPlanetas);

		ArrayAdapter adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, planetas);
		//adaptador.setDropDownViewResource(android.R.layout.simple_spinner_item);
		 adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		combo.setAdapter(adaptador);

		// Se selecionar algum planeta atualiza a imagem
		combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			public void onItemSelected(AdapterView parent, View v, int posicao, long id) {
				// Atualiza a imagem
				imagem.setImageResource(imagens[posicao]);
			}
			public void onNothingSelected(AdapterView parent) {
			}
		});
	}
}
