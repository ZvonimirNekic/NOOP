package zad_2;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Klasa koja djeluje kao invoker.
 * Omogućuje upravljanje transakcijama te mehanizme undo i redo.
 */
public class MobAppInv {
    private Deque<PaymentServiceInt> undoStack = new LinkedList<>();
    private Deque<PaymentServiceInt> redoStack = new LinkedList<>();

    public void performTransaction(PaymentServiceInt transaction) {
        transaction.execute();
        undoStack.push(transaction);
        redoStack.clear();
    }

    public void undoLastTransaction() {
        if (!undoStack.isEmpty()) {
            PaymentServiceInt transaction = undoStack.pop();
            transaction.undo();
            redoStack.push(transaction);
        } else {
            System.out.println("Undo stack is empty!");
        }
    }

    public void redoLastTransaction() {
        if (!redoStack.isEmpty()) {
            PaymentServiceInt transaction = redoStack.pop();
            transaction.redo();
            undoStack.push(transaction);
        } else {
            System.out.println("Redo stack is empty!");
        }
    }
}
