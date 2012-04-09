package br.livro.android.cap7.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Exemplo de sub-menu
 * 
 * @author ricardo
 * 
 */
public class ExemploSubMenu extends Activity {
	public static final int NOVO = 0;
	public static final int SALVAR = 1;
	public static final int EXCLUIR = 2;
	// outros
	public static final int PESQUISAR = 3;
	public static final int LIMPAR = 4;
	public static final int SAIR = 5;
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		TextView view = new TextView(this);
		view.setText("Exemplo de Menu");
		setContentView(view);
	}
	
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
		// Adiciona três opções no menu
		MenuItem item = menu.add(0, NOVO, 0, "Novo");
		item.setIcon(br.livro.android.cap7.R.drawable.novo);
		
		item = menu.add(0, SALVAR, 0, "Salvar");
		item.setIcon(br.livro.android.cap7.R.drawable.salvar);
		
		item = menu.add(0, EXCLUIR, 0, "Excluir");
		item.setIcon(br.livro.android.cap7.R.drawable.excluir);

		// Cria um submenu, também com id
		SubMenu subMenu = menu.addSubMenu("Outros");
		subMenu.setIcon(br.livro.android.cap7.R.drawable.outros);
		
		item = subMenu.add(0, PESQUISAR, 0, "Pesquisar");
		item.setIcon(br.livro.android.cap7.R.drawable.pesquisar);
		
		item = subMenu.add(0, LIMPAR, 0, "Limpar");
		item.setIcon(br.livro.android.cap7.R.drawable.limpar);
		
		item = subMenu.add(0, SAIR, 0, "Sair");
		item.setIcon(br.livro.android.cap7.R.drawable.sair);		

		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
		case NOVO:
		case SALVAR:
		case EXCLUIR:
		case PESQUISAR:
		case LIMPAR:
		case SAIR:
			String titulo = item.getTitle().toString();
			Toast.makeText(ExemploSubMenu.this, "Item: " + titulo, Toast.LENGTH_SHORT).show();
			return true;
		}
		return false;
	}
}
