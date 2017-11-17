package com.nextu.sacc.evaluacionfinal_modulo7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

public class LoginActivity extends AppCompatActivity {
    // Referencias a los controles.
    private EditText usuario;
    private EditText clave;
    private CheckBox recordarme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inicializa las referencias a los controles
        usuario = (EditText) findViewById(R.id.txt_nombre_usuario);
        clave = (EditText) findViewById(R.id.txt_password);
        recordarme = (CheckBox) findViewById(R.id.chk_recordarme);

    }

    public void onClickInicioSesion(View view){
        // Valida que los campos estén completos
        if (usuario.getText().equals("") || clave.getText().equals("")){
            Toast.makeText(this, R.string.completar_login, Toast.LENGTH_SHORT).show();
        }else{// Los datos están completos.
            // Guarda en preferencias el usuario, clave y check recordarme
            SharedPreferences sharedPreferences = ;
            // Ingresa al sistema.
        }
    }

}

