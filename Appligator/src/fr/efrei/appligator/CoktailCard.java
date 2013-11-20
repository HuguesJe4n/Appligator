package fr.efrei.appligator;

import java.util.ArrayList;

import android.app.Activity;
import android.media.Image;
import android.widget.RatingBar;

public class CoktailCard extends Activity {
	/** Information générale sur le cocktail **/
	String Nom;
	Image Photo;
	String Verre;
	ArrayList<String> Composition;
	/** Information consomateur sur le coktail **/
	RatingBar Note;
	String Commentaire;
}
