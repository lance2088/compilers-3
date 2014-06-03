/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AIdParExpression extends PExpression
{
    private TId _id_;
    private PExpression _expression_;

    public AIdParExpression()
    {
    }

    public AIdParExpression(
        TId _id_,
        PExpression _expression_)
    {
        setId(_id_);

        setExpression(_expression_);

    }
    public Object clone()
    {
        return new AIdParExpression(
            (TId) cloneNode(_id_),
            (PExpression) cloneNode(_expression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdParExpression(this);
    }

    public TId getId()
    {
        return _id_;
    }

    public void setId(TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
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

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_expression_);
    }

    void removeChild(Node child)
    {
        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_expression_ == child)
        {
            _expression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

    }
}
