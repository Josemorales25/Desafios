package cl.talentodigital.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private Button btnIngresar;
    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIngresar = findViewById(R.id.btnIngresar);
        ivLogo = findViewById(R.id.ivLogo);

        btnIngresar.setOnClickListener((View v)-> goTolngresar());

        Picasso.get()
                .load("https://desafiolatam.com/assets/home/logo-academia-bla-790873cdf66b0e681dfbe640ace8a602f5330bec301c409744c358330e823ae3.png")
                .into(ivLogo);
    }

    private void goTolngresar() {
        Toast.makeText(this, "Usuario Ingresado con éxito", Toast.LENGTH_LONG).show();
    }
}