package net.jesusramirez.clienteprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText password;
    EditText email;
    EditText telefono;
    Button btnInsertar;
    Button btnEliminar;
    Button btnModificar;
    Spinner lista;
    ContentResolver cr;
    ContentValues cv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txtNombre);
        password=findViewById(R.id.txtPassword);
        email=findViewById(R.id.txtEmail);
        telefono=findViewById(R.id.txtTelefono);
        lista=findViewById(R.id.listaUsuarios);
        btnInsertar=findViewById(R.id.btnInsertar);
        btnEliminar=findViewById(R.id.btnEliminar);
        btnModificar=findViewById(R.id.btnModificar);

    }
}