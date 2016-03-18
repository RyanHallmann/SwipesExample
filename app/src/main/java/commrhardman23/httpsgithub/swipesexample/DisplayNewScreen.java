package commrhardman23.httpsgithub.swipesexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class DisplayNewScreen extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private GestureDetector motionDetector2;
    private TextView txtvwPraise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_new_screen);

        motionDetector2 = new GestureDetector(this, this);
        txtvwPraise = (TextView) findViewById(R.id.txtvwPraise);

    }

    public boolean onTouchEvent(MotionEvent event){

        this.motionDetector2.onTouchEvent(event);

        return super.onTouchEvent(event);

    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        if(velocityX > 0){
            Intent goBack = new Intent();
            goBack.putExtra("RETURN_MESSAGE", "You came back! Thanks for using the app!");
            setResult(0, goBack);
            finish();
        } else {
            txtvwPraise.setText("You just swiped the wrong direction");
        }

        return true;
    }

}
