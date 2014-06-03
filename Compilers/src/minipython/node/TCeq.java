/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TCeq extends Token
{
    public TCeq()
    {
        super.setText("==");
    }

    public TCeq(int line, int pos)
    {
        super.setText("==");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TCeq(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCeq(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TCeq text.");
    }
}
