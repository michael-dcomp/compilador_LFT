/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TPrBooleano extends Token
{
    public TPrBooleano()
    {
        super.setText("booleano");
    }

    public TPrBooleano(int line, int pos)
    {
        super.setText("booleano");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrBooleano(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrBooleano(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrBooleano text.");
    }
}
