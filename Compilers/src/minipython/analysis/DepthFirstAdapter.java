/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import java.util.*;
import minipython.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(Node node)
    {
    }

    public void defaultOut(Node node)
    {
    }

    public void caseStart(Start node)
    {
        inStart(node);
        node.getPGoal().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAGoal(AGoal node)
    {
        defaultIn(node);
    }

    public void outAGoal(AGoal node)
    {
        defaultOut(node);
    }

    public void caseAGoal(AGoal node)
    {
        inAGoal(node);
        {
            Object temp[] = node.getCommands().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((PCommands) temp[i]).apply(this);
            }
        }
        outAGoal(node);
    }

    public void inAStateCommands(AStateCommands node)
    {
        defaultIn(node);
    }

    public void outAStateCommands(AStateCommands node)
    {
        defaultOut(node);
    }

    public void caseAStateCommands(AStateCommands node)
    {
        inAStateCommands(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAStateCommands(node);
    }

    public void inAFuncCommands(AFuncCommands node)
    {
        defaultIn(node);
    }

    public void outAFuncCommands(AFuncCommands node)
    {
        defaultOut(node);
    }

    public void caseAFuncCommands(AFuncCommands node)
    {
        inAFuncCommands(node);
        if(node.getFunction() != null)
        {
            node.getFunction().apply(this);
        }
        outAFuncCommands(node);
    }

    public void inAFunctiondeclFunction(AFunctiondeclFunction node)
    {
        defaultIn(node);
    }

    public void outAFunctiondeclFunction(AFunctiondeclFunction node)
    {
        defaultOut(node);
    }

    public void caseAFunctiondeclFunction(AFunctiondeclFunction node)
    {
        inAFunctiondeclFunction(node);
        if(node.getDef() != null)
        {
            node.getDef().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getArgument() != null)
        {
            node.getArgument().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAFunctiondeclFunction(node);
    }

    public void inAArg1(AArg1 node)
    {
        defaultIn(node);
    }

    public void outAArg1(AArg1 node)
    {
        defaultOut(node);
    }

    public void caseAArg1(AArg1 node)
    {
        inAArg1(node);
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAArg1(node);
    }

    public void inAArg2(AArg2 node)
    {
        defaultIn(node);
    }

    public void outAArg2(AArg2 node)
    {
        defaultOut(node);
    }

    public void caseAArg2(AArg2 node)
    {
        inAArg2(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getArg1() != null)
        {
            node.getArg1().apply(this);
        }
        outAArg2(node);
    }

    public void inAArgdeclArgument(AArgdeclArgument node)
    {
        defaultIn(node);
    }

    public void outAArgdeclArgument(AArgdeclArgument node)
    {
        defaultOut(node);
    }

    public void caseAArgdeclArgument(AArgdeclArgument node)
    {
        inAArgdeclArgument(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getArg1() != null)
        {
            node.getArg1().apply(this);
        }
        {
            Object temp[] = node.getArg2().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((PArg2) temp[i]).apply(this);
            }
        }
        outAArgdeclArgument(node);
    }

    public void inACexp(ACexp node)
    {
        defaultIn(node);
    }

    public void outACexp(ACexp node)
    {
        defaultOut(node);
    }

    public void caseACexp(ACexp node)
    {
        inACexp(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outACexp(node);
    }

    public void inAIfStatement(AIfStatement node)
    {
        defaultIn(node);
    }

    public void outAIfStatement(AIfStatement node)
    {
        defaultOut(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        inAIfStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAIfStatement(node);
    }

    public void inAWhileStatement(AWhileStatement node)
    {
        defaultIn(node);
    }

    public void outAWhileStatement(AWhileStatement node)
    {
        defaultOut(node);
    }

    public void caseAWhileStatement(AWhileStatement node)
    {
        inAWhileStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        if(node.getComparison() != null)
        {
            node.getComparison().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAWhileStatement(node);
    }

    public void inAForStatement(AForStatement node)
    {
        defaultIn(node);
    }

    public void outAForStatement(AForStatement node)
    {
        defaultOut(node);
    }

    public void caseAForStatement(AForStatement node)
    {
        inAForStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getFor() != null)
        {
            node.getFor().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getIn() != null)
        {
            node.getIn().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getSemi() != null)
        {
            node.getSemi().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAForStatement(node);
    }

    public void inAReturnStatement(AReturnStatement node)
    {
        defaultIn(node);
    }

    public void outAReturnStatement(AReturnStatement node)
    {
        defaultOut(node);
    }

    public void caseAReturnStatement(AReturnStatement node)
    {
        inAReturnStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getReturn() != null)
        {
            node.getReturn().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAReturnStatement(node);
    }

    public void inAPrintStatement(APrintStatement node)
    {
        defaultIn(node);
    }

    public void outAPrintStatement(APrintStatement node)
    {
        defaultOut(node);
    }

    public void caseAPrintStatement(APrintStatement node)
    {
        inAPrintStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getPrint() != null)
        {
            node.getPrint().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        {
            Object temp[] = node.getCexp().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((PCexp) temp[i]).apply(this);
            }
        }
        outAPrintStatement(node);
    }

    public void inAValuealocStatement(AValuealocStatement node)
    {
        defaultIn(node);
    }

    public void outAValuealocStatement(AValuealocStatement node)
    {
        defaultOut(node);
    }

    public void caseAValuealocStatement(AValuealocStatement node)
    {
        inAValuealocStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAValuealocStatement(node);
    }

    public void inAValuealoc2Statement(AValuealoc2Statement node)
    {
        defaultIn(node);
    }

    public void outAValuealoc2Statement(AValuealoc2Statement node)
    {
        defaultOut(node);
    }

    public void caseAValuealoc2Statement(AValuealoc2Statement node)
    {
        inAValuealoc2Statement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLBr() != null)
        {
            node.getLBr().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getRBr() != null)
        {
            node.getRBr().apply(this);
        }
        if(node.getEq() != null)
        {
            node.getEq().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        outAValuealoc2Statement(node);
    }

    public void inASfunctioncallStatement(ASfunctioncallStatement node)
    {
        defaultIn(node);
    }

    public void outASfunctioncallStatement(ASfunctioncallStatement node)
    {
        defaultOut(node);
    }

    public void caseASfunctioncallStatement(ASfunctioncallStatement node)
    {
        inASfunctioncallStatement(node);
        {
            Object temp[] = node.getTab().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((TTab) temp[i]).apply(this);
            }
        }
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outASfunctioncallStatement(node);
    }

    public void inACval(ACval node)
    {
        defaultIn(node);
    }

    public void outACval(ACval node)
    {
        defaultOut(node);
    }

    public void caseACval(ACval node)
    {
        inACval(node);
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outACval(node);
    }

    public void inAPlusPraxi(APlusPraxi node)
    {
        defaultIn(node);
    }

    public void outAPlusPraxi(APlusPraxi node)
    {
        defaultOut(node);
    }

    public void caseAPlusPraxi(APlusPraxi node)
    {
        inAPlusPraxi(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusPraxi(node);
    }

    public void inAMinusPraxi(AMinusPraxi node)
    {
        defaultIn(node);
    }

    public void outAMinusPraxi(AMinusPraxi node)
    {
        defaultOut(node);
    }

    public void caseAMinusPraxi(AMinusPraxi node)
    {
        inAMinusPraxi(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outAMinusPraxi(node);
    }

    public void inAMultPraxi(AMultPraxi node)
    {
        defaultIn(node);
    }

    public void outAMultPraxi(AMultPraxi node)
    {
        defaultOut(node);
    }

    public void caseAMultPraxi(AMultPraxi node)
    {
        inAMultPraxi(node);
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        outAMultPraxi(node);
    }

    public void inADivPraxi(ADivPraxi node)
    {
        defaultIn(node);
    }

    public void outADivPraxi(ADivPraxi node)
    {
        defaultOut(node);
    }

    public void caseADivPraxi(ADivPraxi node)
    {
        inADivPraxi(node);
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        outADivPraxi(node);
    }

    public void inAExp2Expression(AExp2Expression node)
    {
        defaultIn(node);
    }

    public void outAExp2Expression(AExp2Expression node)
    {
        defaultOut(node);
    }

    public void caseAExp2Expression(AExp2Expression node)
    {
        inAExp2Expression(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLBr() != null)
        {
            node.getLBr().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getRBr() != null)
        {
            node.getRBr().apply(this);
        }
        outAExp2Expression(node);
    }

    public void inAFunctExpression(AFunctExpression node)
    {
        defaultIn(node);
    }

    public void outAFunctExpression(AFunctExpression node)
    {
        defaultOut(node);
    }

    public void caseAFunctExpression(AFunctExpression node)
    {
        inAFunctExpression(node);
        if(node.getFunctionCall() != null)
        {
            node.getFunctionCall().apply(this);
        }
        outAFunctExpression(node);
    }

    public void inAValExpression(AValExpression node)
    {
        defaultIn(node);
    }

    public void outAValExpression(AValExpression node)
    {
        defaultOut(node);
    }

    public void caseAValExpression(AValExpression node)
    {
        inAValExpression(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAValExpression(node);
    }

    public void inAEidExpression(AEidExpression node)
    {
        defaultIn(node);
    }

    public void outAEidExpression(AEidExpression node)
    {
        defaultOut(node);
    }

    public void caseAEidExpression(AEidExpression node)
    {
        inAEidExpression(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAEidExpression(node);
    }

    public void inAExp3Expression(AExp3Expression node)
    {
        defaultIn(node);
    }

    public void outAExp3Expression(AExp3Expression node)
    {
        defaultOut(node);
    }

    public void caseAExp3Expression(AExp3Expression node)
    {
        inAExp3Expression(node);
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAExp3Expression(node);
    }

    public void inAExp4Expression(AExp4Expression node)
    {
        defaultIn(node);
    }

    public void outAExp4Expression(AExp4Expression node)
    {
        defaultOut(node);
    }

    public void caseAExp4Expression(AExp4Expression node)
    {
        inAExp4Expression(node);
        if(node.getLBr() != null)
        {
            node.getLBr().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        {
            Object temp[] = node.getCval().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((PCval) temp[i]).apply(this);
            }
        }
        if(node.getRBr() != null)
        {
            node.getRBr().apply(this);
        }
        outAExp4Expression(node);
    }

    public void inAGreatSymb(AGreatSymb node)
    {
        defaultIn(node);
    }

    public void outAGreatSymb(AGreatSymb node)
    {
        defaultOut(node);
    }

    public void caseAGreatSymb(AGreatSymb node)
    {
        inAGreatSymb(node);
        if(node.getGreat() != null)
        {
            node.getGreat().apply(this);
        }
        outAGreatSymb(node);
    }

    public void inALessSymb(ALessSymb node)
    {
        defaultIn(node);
    }

    public void outALessSymb(ALessSymb node)
    {
        defaultOut(node);
    }

    public void caseALessSymb(ALessSymb node)
    {
        inALessSymb(node);
        if(node.getLess() != null)
        {
            node.getLess().apply(this);
        }
        outALessSymb(node);
    }

    public void inANeqSymb(ANeqSymb node)
    {
        defaultIn(node);
    }

    public void outANeqSymb(ANeqSymb node)
    {
        defaultOut(node);
    }

    public void caseANeqSymb(ANeqSymb node)
    {
        inANeqSymb(node);
        if(node.getNeq() != null)
        {
            node.getNeq().apply(this);
        }
        outANeqSymb(node);
    }

    public void inACeqSymb(ACeqSymb node)
    {
        defaultIn(node);
    }

    public void outACeqSymb(ACeqSymb node)
    {
        defaultOut(node);
    }

    public void caseACeqSymb(ACeqSymb node)
    {
        inACeqSymb(node);
        if(node.getCeq() != null)
        {
            node.getCeq().apply(this);
        }
        outACeqSymb(node);
    }

    public void inACompComparison(ACompComparison node)
    {
        defaultIn(node);
    }

    public void outACompComparison(ACompComparison node)
    {
        defaultOut(node);
    }

    public void caseACompComparison(ACompComparison node)
    {
        inACompComparison(node);
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getSymb() != null)
        {
            node.getSymb().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        outACompComparison(node);
    }

    public void inATrueComparison(ATrueComparison node)
    {
        defaultIn(node);
    }

    public void outATrueComparison(ATrueComparison node)
    {
        defaultOut(node);
    }

    public void caseATrueComparison(ATrueComparison node)
    {
        inATrueComparison(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrueComparison(node);
    }

    public void inAFalseComparison(AFalseComparison node)
    {
        defaultIn(node);
    }

    public void outAFalseComparison(AFalseComparison node)
    {
        defaultOut(node);
    }

    public void caseAFalseComparison(AFalseComparison node)
    {
        inAFalseComparison(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFalseComparison(node);
    }

    public void inAFunctioncallFunctionCall(AFunctioncallFunctionCall node)
    {
        defaultIn(node);
    }

    public void outAFunctioncallFunctionCall(AFunctioncallFunctionCall node)
    {
        defaultOut(node);
    }

    public void caseAFunctioncallFunctionCall(AFunctioncallFunctionCall node)
    {
        inAFunctioncallFunctionCall(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getArglist() != null)
        {
            node.getArglist().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        outAFunctioncallFunctionCall(node);
    }

    public void inAArgsArglist(AArgsArglist node)
    {
        defaultIn(node);
    }

    public void outAArgsArglist(AArgsArglist node)
    {
        defaultOut(node);
    }

    public void caseAArgsArglist(AArgsArglist node)
    {
        inAArgsArglist(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        {
            Object temp[] = node.getCexp().toArray();
            for(int i = 0; i < temp.length; i++)
            {
                ((PCexp) temp[i]).apply(this);
            }
        }
        outAArgsArglist(node);
    }

    public void inANumbValue(ANumbValue node)
    {
        defaultIn(node);
    }

    public void outANumbValue(ANumbValue node)
    {
        defaultOut(node);
    }

    public void caseANumbValue(ANumbValue node)
    {
        inANumbValue(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumbValue(node);
    }

    public void inAStringLiteralValue(AStringLiteralValue node)
    {
        defaultIn(node);
    }

    public void outAStringLiteralValue(AStringLiteralValue node)
    {
        defaultOut(node);
    }

    public void caseAStringLiteralValue(AStringLiteralValue node)
    {
        inAStringLiteralValue(node);
        if(node.getStringLiteral() != null)
        {
            node.getStringLiteral().apply(this);
        }
        outAStringLiteralValue(node);
    }

    public void inAIntLiterNumber(AIntLiterNumber node)
    {
        defaultIn(node);
    }

    public void outAIntLiterNumber(AIntLiterNumber node)
    {
        defaultOut(node);
    }

    public void caseAIntLiterNumber(AIntLiterNumber node)
    {
        inAIntLiterNumber(node);
        if(node.getIntegerLiteral() != null)
        {
            node.getIntegerLiteral().apply(this);
        }
        outAIntLiterNumber(node);
    }

    public void inAIdIdentifier(AIdIdentifier node)
    {
        defaultIn(node);
    }

    public void outAIdIdentifier(AIdIdentifier node)
    {
        defaultOut(node);
    }

    public void caseAIdIdentifier(AIdIdentifier node)
    {
        inAIdIdentifier(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdIdentifier(node);
    }
}
