package layout

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect

import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class ScacchieraView : View{

    constructor(context: Context) : super(context, null)
    constructor(context: Context, attrs: Attrs: AttributeSet?) : super(context, attrs, //defStyleAttr: //
     0)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        var Schermo = Rect()
        canvas?.getClipBounds(schermo)

        var casella = Rect( 100, 100, 200, 200)
        var paint = Paint()
        paint.color = Color.GREEN

        canvas?.drawrRect(casella, paint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        if (event?.action == MotionEvent.ACTION_UP)

        return super.onTouchEvent(event)

    }
}