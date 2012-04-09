package br.livro.android.cap7.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import br.livro.android.cap7.R;

/**
 * Demonstra um alerta de confirmação;
 * 
 * É possível definir um "DialogInterface.OnClickListener" para executar o
 * código dependendo se o usuário escolheu Sim ou Não
 * 
 * @author ricardo
 * 
 */
public class ExemploAlertaConfirmacao extends Activity {
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		setContentView(R.layout.alert_dialog);

		// Exibe o alerta de confirmação ao clicar no botão
		Button b = (Button) findViewById(R.id.b);

		b.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				/** AlertDialog com Sim e Não **/
				AlertDialog.Builder alerta = new AlertDialog.Builder(ExemploAlertaConfirmacao.this);
				alerta.setIcon(R.drawable.smile1);
				alerta.setTitle("Titulo");
				alerta.setMessage("Por favor escolha sim ou não, obrigado.");
				// Método executado se escolher Sim
				alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						Toast.makeText(ExemploAlertaConfirmacao.this, "Sim!", Toast.LENGTH_SHORT).show();
					}
				});
				// Método executado se escolher Nao
				alerta.setNegativeButton("Não", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						Toast.makeText(ExemploAlertaConfirmacao.this, "Não!", Toast.LENGTH_SHORT).show();
					}
				});
				// Exibe o alerta de confirmação
				alerta.show();
			}
		});
	}
}
