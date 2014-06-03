/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class AFunctionCallStatement extends PStatement
{
    private TId _id_;
    private final LinkedList _argumentsList_ = new TypedLinkedList(new ArgumentsList_Cast());

    public AFunctionCallStatement()
    {
    }

    public AFunctionCallStatement(
        TId _id_,
        List _argumentsList_)
    {
        setId(_id_);

        {
            this._argumentsList_.clear();
            this._argumentsList_.addAll(_argumentsList_);
        }

    }
    public Object clone()
    {
        return new AFunctionCallStatement(
            (TId) cloneNode(_id_),
            cloneList(_argumentsList_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionCallStatement(this);
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

    public LinkedList getArgumentsList()
    {
        return _argumentsList_;
    }

    public void setArgumentsList(List list)
    {
        _argumentsList_.clear();
        _argumentsList_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_id_)
            + toString(_argumentsList_);
    }

    void removeChild(Node child)
    {
        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_argumentsList_.remove(child))
        {
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

        for(ListIterator i = _argumentsList_.listIterator(); i.hasNext();)
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

    private class ArgumentsList_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PArgumentsList node = (PArgumentsList) o;

            if((node.parent() != null) &&
                (node.parent() != AFunctionCallStatement.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AFunctionCallStatement.this))
            {
                node.parent(AFunctionCallStatement.this);
            }

            return node;
        }
    }
}
