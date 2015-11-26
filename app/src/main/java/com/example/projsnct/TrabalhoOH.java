package com.example.projsnct;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class TrabalhoOH extends SQLiteOpenHelper {
	
	public TrabalhoOH(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	private static final String Nome_BD = "SNCT";	
	private static final int Versao_BD = 1;

	public static final String TB_AVALIACAO = "TB_AVALIACAO";
	public static final String ID = "ID";
	public static final String NOME_AVALIADOR = "NOME_AVALIADOR";
	public static final String NOTA = "NOTA";
	public static final String COMENTATIO= "COMENTATIO";
	public static final String TITUlO_TRABALHO= "TITULO_TRABALHO";
	
	

	public TrabalhoOH(Context ctx) {
		super(ctx, Nome_BD, null, Versao_BD);
	}		

	@Override
	public void onCreate(SQLiteDatabase bd) {
		bd.execSQL(
				" CREATE TABLE " + TB_AVALIACAO
						+ " (" +
						ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
						+ NOME_AVALIADOR + " TEXT NOT NULL," +
						NOTA + " TEXT NOT NULL," +
						COMENTATIO + " TEXT NOT NULL," +
						TITUlO_TRABALHO + "TEXT NOT NULL)"
		);
	}

	@Override
	public void onUpgrade(SQLiteDatabase bd, Int ID2, String NOME_AVALIADOR2,String TITULO_TRABALHO2,int NOTA2, String COMENTARIO2) {
		bd.execSQL(
				"INSERT INTO" + TB_AVALIACAO +"" + "("
						+NOME_AVALIADOR+","
						+TITULO_TRABALHO+","
						+ NOTA + ","
						+ COMENTARIO + ")"
						+ " VALUES (" +
						NOME_AVALIADOR2 +","
						+ TITULO_TRABALHO2 +","
						+ NOTA2 +","
						+ COMENTARIO2 +");"
		);
		cont = cont+1;
	}

	public void buscar(SQLiteDatabase bd, Int ID2, String NOME_AVALIADOR2,String TITULO_TRABALHO2,int NOTA2, String COMENTARIO2) {
		Notificar notificar = new Notification();
		notificar.onClick(cont);
	}

}