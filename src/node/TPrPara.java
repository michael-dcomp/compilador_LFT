/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TPrPara extends Token
{
    public TPrPara()
    {
        super.setText("para");
    }

    public TPrPara(int line, int pos)
    {
        super.setText("para");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrPara(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrPara(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrPara text.");
    }
}