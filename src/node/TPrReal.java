/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TPrReal extends Token
{
    public TPrReal()
    {
        super.setText("real");
    }

    public TPrReal(int line, int pos)
    {
        super.setText("real");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrReal(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrReal(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrReal text.");
    }
}
