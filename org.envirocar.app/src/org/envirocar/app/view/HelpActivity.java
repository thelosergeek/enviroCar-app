package org.envirocar.app.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import org.envirocar.app.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * TODO JavaDoc
 *
 * @author dewall
 */
public class HelpActivity extends AppCompatActivity {

    @InjectView(R.id.activity_help_layout_general_toolbar)
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_help_layout_general);

        // Inject views
        ButterKnife.inject(this);

        // Set Actionbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Help");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        super.onOptionsItemSelected(item);
        return false;
    }
}
