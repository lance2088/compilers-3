/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AParValuesExpression extends PExpression
{
    private PValue _value_;
    private final LinkedList _anotherValue_ = new TypedLinkedList(new AnotherValue_Cast());

    public AParValuesExpression()
    {
    }

    public AParValuesExpression(
        PValue _value_,
        List _anotherValue_)
    {
        setValue(_value_);

        {
            this._anotherValue_.clear();
            this._anotherValue_.addAll(_anotherValue_);
        }

    }
    public Object clone()
    {
        return new AParValuesExpression(
            (PValue) cloneNode(_value_),
            cloneList(_anotherValue_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParValuesExpression(this);
    }

    public PValue getValue()
    {
        return _value_;
    }

    public void setValue(PValue node)
    {
        if(_value_ != null)
        {
            _value_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _value_ = node;
    }

    public LinkedList getAnotherValue()
    {
        return _anotherValue_;
    }

    public void setAnotherValue(List list)
    {
        _anotherValue_.clear();
        _anotherValue_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_value_)
            + toString(_anotherValue_);
    }

    void removeChild(Node child)
    {
        if(_value_ == child)
        {
            _value_ = null;
            return;
        }

        if(_anotherValue_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_value_ == oldChild)
        {
            setValue((PValue) newChild);
            return;
        }

        for(ListIterator i = _anotherValue_.listIterator(); i.hasNext();)
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

    }

    private class AnotherValue_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PAnotherValue node = (PAnotherValue) o;

            if((node.parent() != null) &&
                (node.parent() != AParValuesExpression.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AParValuesExpression.this))
            {
                node.parent(AParValuesExpression.this);
            }

            return node;
        }
    }
}
