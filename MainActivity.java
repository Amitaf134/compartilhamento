import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nota1 = findViewById(R.id.nota1);
        EditText nota2 = findViewById(R.id.nota2);
        EditText nota3 = findViewById(R.id.nota3);
        TextView media = findViewById(R.id.media);

        Button btCalcular = findViewById(R.id.btCalc);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double nt1 = Double.parseDouble(nota1.getText().toString());
                double nt2 = Double.parseDouble(nota2.getText().toString());
                double nt3 = Double.parseDouble(nota3.getText().toString());

                double resul = (nt1+nt2+nt3)/3;

                String med = new DecimalFormat("#0.0").format(resul);

                media.setText(med);
            }
        });
    }
}
