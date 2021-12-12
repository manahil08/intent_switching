package com.example.intent_switch_statements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}

            case
                    R.id.buttonOpenSecodActivity:
                intent = new
                        Intent(MainActivity.this,
                        MainActivity2.class);
                startActivity(intent);
                break;

            case R.id.buttonCallingIntent:
                Uri uri =
                        Uri.parse("tel:+923001234567");
                intent = new
                        Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
                break;
            default:
                throw new
                        IllegalStateException("Unexpected");
        }
    }