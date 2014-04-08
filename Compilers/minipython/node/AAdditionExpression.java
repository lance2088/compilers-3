/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AAdditionExpression extends PExpression
{
    private PExpression _expression_;
    private TPlus _plus_;
    private PMultiplication _multiplication_;

    public AAdditionExpression()
    {
    }

    public AAdditionExpression(
        PExpression _expression_,
        TPlus _plus_,
        PMultiplication _multiplication_)
    {
        setExpression(_expression_);

        setPlus(_plus_);

        setMultiplication(_multiplication_);

    }
    public Object clone()
    {
        return new AAdditionExpression(
            (PExpression) cloneNode(_expression_),
            (TPlus) cloneNode(_plus_),
            (PMultiplication) cloneNode(_multiplication_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdditionExpression(this);
    }

    public PExpression getExpression()
    {
        return _expression_;
    }

    public void setExpression(PExpression node)
    {
        if(_expression_ != null)
        {
            _expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression_ = node;
    }

    public TPlus getPlus()
    {
        return _plus_;
    }

    public void setPlus(TPlus node)
    {
        if(_plus_ != null)
        {
            _plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _plus_ = node;
    }

    public PMultiplication getMultiplication()
    {
        return _multiplication_;
    }

    public void setMultiplication(PMultiplication node)
    {
        if(_multiplication_ != null)
        {
            _multiplication_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _multiplication_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expression_)
            + toString(_plus_)
            + toString(_multiplication_);
    }

    void removeChild(Node child)
    {
        if(_expression_ == child)
        {
            _expression_ = null;
            return;
        }

        if(_plus_ == child)
        {
            _plus_ = null;
            return;
        }

        if(_multiplication_ == child)
        {
            _multiplication_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(_plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(_multiplication_ == oldChild)
        {
            setMultiplication((PMultiplication) newChild);
            return;
        }

    }
}
