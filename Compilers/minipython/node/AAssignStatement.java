/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AAssignStatement extends PStatement
{
    private final LinkedList _tab_ = new TypedLinkedList(new Tab_Cast());
    private TId _id_;
    private TEq _eq_;
    private PExpression _expression_;

    public AAssignStatement()
    {
    }

    public AAssignStatement(
        List _tab_,
        TId _id_,
        TEq _eq_,
        PExpression _expression_)
    {
        {
            this._tab_.clear();
            this._tab_.addAll(_tab_);
        }

        setId(_id_);

        setEq(_eq_);

        setExpression(_expression_);

    }
    public Object clone()
    {
        return new AAssignStatement(
            cloneList(_tab_),
            (TId) cloneNode(_id_),
            (TEq) cloneNode(_eq_),
            (PExpression) cloneNode(_expression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAssignStatement(this);
    }

    public LinkedList getTab()
    {
        return _tab_;
    }

    public void setTab(List list)
    {
        _tab_.clear();
        _tab_.addAll(list);
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

    public TEq getEq()
    {
        return _eq_;
    }

    public void setEq(TEq node)
    {
        if(_eq_ != null)
        {
            _eq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _eq_ = node;
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
            + toString(_tab_)
            + toString(_id_)
            + toString(_eq_)
            + toString(_expression_);
    }

    void removeChild(Node child)
    {
        if(_tab_.remove(child))
        {
            return;
        }

        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_eq_ == child)
        {
            _eq_ = null;
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
        for(ListIterator i = _tab_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(_eq_ == oldChild)
        {
            setEq((TEq) newChild);
            return;
        }

        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

    }

    private class Tab_Cast implements Cast
    {
        public Object cast(Object o)
        {
            TTab node = (TTab) o;

            if((node.parent() != null) &&
                (node.parent() != AAssignStatement.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AAssignStatement.this))
            {
                node.parent(AAssignStatement.this);
            }

            return node;
        }
    }
}
