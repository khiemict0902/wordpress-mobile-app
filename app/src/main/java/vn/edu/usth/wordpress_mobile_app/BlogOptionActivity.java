package vn.edu.usth.wordpress_mobile_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BlogOptionActivity extends AppCompatActivity {

    private ImageButton closeButton, searchButton, pinButton;
    RelativeLayout BlogItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_blog_option);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.blog_option), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        closeButton = findViewById(R.id.close_button);
        searchButton = findViewById(R.id.search_button);
        pinButton = findViewById(R.id.pin);
        BlogItem = findViewById(R.id.blog_option);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}