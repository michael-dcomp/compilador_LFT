/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TPrAvalie extends Token
{
    public TPrAvalie()
    {
        super.setText("avalie");
    }

    public TPrAvalie(int line, int pos)
    {
        super.setText("avalie");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrAvalie(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrAvalie(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrAvalie text.");
    }
}