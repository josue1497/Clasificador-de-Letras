package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;

public class windowMainController implements Initializable{

	@FXML
	private TextField wordToClasificate;

	@FXML
	private Button toClasificate;

	@FXML
	private TextField b;

	@FXML
	private TextField c;

	@FXML
	private TextField d;

	@FXML
	private TextField k;

	@FXML
	private TextField m;

	@FXML
	private TextField n;

	@FXML
	private TextField o;

	@FXML
	private TextField p;

	@FXML
	private TextField q;

	@FXML
	private TextField a;

	@FXML
	private TextField l;

	@FXML
	private TextField j;

	@FXML
	private TextField s;

	@FXML
	private TextField r;

	@FXML
	private TextField z;

	@FXML
	private TextField f;

	@FXML
	private TextField i;

	@FXML
	private TextField h;

	@FXML
	private TextField g;

	@FXML
	private TextField e;

	@FXML
	private TextField t;

	@FXML
	private TextField u;

	@FXML
	private TextField v;

	@FXML
	private TextField w;

	@FXML
	private TextField x;

	@FXML
	private TextField y;

	@FXML
	private TextField ñ;

	private String value;

	private char[] arrayChar;

	int A, B, C, D, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V,W, X, Y, Z, aux;

	@FXML
	void clasificarLetras(ActionEvent event) {
		
		value = wordToClasificate.getText();
		if(value.equals("")) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("ERROR!");
			alert.setHeaderText("Campo de Texto Vacio");
			alert.setContentText("Ingrese una Palabra para ejecutar el Procemiento");
			alert.showAndWait();			
		}else {
		arrayChar = value.toCharArray();
		clasificate(arrayChar);
		wordToClasificate.setText("");
		}
	}

	private void clasificate(char[] array) {
		for (char value : array) {
			ubicateLetter(value);
		}
	}

	private void ubicateLetter(char Caracter) {

		switch (Caracter) {
		case 'a':
			A++;
			a.setText(String.valueOf(A));
			break;
		case 'b':
			B++;
			b.setText(String.valueOf(B));
			break;
		case 'c':
			C++;
			c.setText(String.valueOf(C));
			break;
		case 'd':
			D++;
			c.setText(String.valueOf(D));
			break;
		case 'f':
			F++;
			f.setText(String.valueOf(F));
			break;
		case 'g':
			G++;
			g.setText(String.valueOf(G));
			break;
		case 'h':
			H++;
			h.setText(String.valueOf(H));
			break;
		case 'i':
			I++;
			i.setText(String.valueOf(I));
			break;
		case 'j':
			J++;
			j.setText(String.valueOf(J));
			break;
		case 'k':
			K++;
			k.setText(String.valueOf(K));
			break;
		case 'l':
			L++;
			l.setText(String.valueOf(L));
			break;
		case 'm':
			M++;
			m.setText(String.valueOf(M));
			break;
		case 'n':
			N++;
			n.setText(String.valueOf(N));
			break;
		case 'o':
			O++;
			o.setText(String.valueOf(O));
			break;
		case 'p':
			P++;
			p.setText(String.valueOf(P));
			break;
		case 'q':
			Q++;
			q.setText(String.valueOf(Q));
			break;
		case 'r':
			R++;
			r.setText(String.valueOf(R));
			break;
		case 's':
			S++;
			s.setText(String.valueOf(S));
			break;
		case 't':
			T++;
			t.setText(String.valueOf(T));
			break;
		case 'u':
			U++;
			u.setText(String.valueOf(U));
			break;
		case 'v':
			V++;
			v.setText(String.valueOf(V));
			break;
		case 'w':
			W++;
			w.setText(String.valueOf(W));
			break;
		case 'x':
			X++;
			x.setText(String.valueOf(X));
			break;
		case 'y':
			Y++;
			y.setText(String.valueOf(Y));
			break;
		case 'z':
			Z++;
			z.setText(String.valueOf(z));
			break;
		case 'ñ':
			aux++;
			ñ.setText(String.valueOf(aux));
			break;
		default:
			break;
		}		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		a.setDisable(true);
		b.setDisable(true);
		c.setDisable(true);
		d.setDisable(true);
		e.setDisable(true);
		f.setDisable(true);
		g.setDisable(true);
		h.setDisable(true);
		i.setDisable(true);
		j.setDisable(true);
		k.setDisable(true);
		l.setDisable(true);
		m.setDisable(true);
		n.setDisable(true);
		o.setDisable(true);
		p.setDisable(true);
		q.setDisable(true);
		r.setDisable(true);
		s.setDisable(true);
		t.setDisable(true);
		u.setDisable(true);
		v.setDisable(true);
		w.setDisable(true);
		x.setDisable(true);
		y.setDisable(true);
		z.setDisable(true);
		ñ.setDisable(true);
	}
	
	private void clear() {
		
	}

}
