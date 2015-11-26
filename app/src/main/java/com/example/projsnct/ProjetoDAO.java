package com.example.projsnct;

import com.example.projsnct.TrabalhoOH;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ProjetoDAO {
	private TrabalhoOH helper;
	
	public void TrabalhoOH (Context ctx){
		
		helper = new TrabalhoOH(ctx);
	}
	
	public void onCreate(Projeto projeto){
		
		SQLiteDatabase bd = helper.getWritableDatabase();
		
		ContentValues valor = new ContentValues();
		
		valor.put(TrabalhoOH.NOME_AVALIADOR,projeto.getAvaliador());
		
		valor.put(TrabalhoOH.ID ,projeto.getId());
		
		valor.put(TrabalhoOH.NOTA ,projeto.getNota());
		
		valor.put(TrabalhoOH.TITUlO_TRABALHO,projeto.getTitulo());
		
		valor.put(TrabalhoOH.COMENTATIO,projeto.getComentario());
		
		bd.insert(TrabalhoOH.TB_AVALIACAO, null, valor);
		
		bd.close();
		
	}


}