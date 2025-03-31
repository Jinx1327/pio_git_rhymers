package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca prosty licznik działający na zasadzie stosu.
 * Umożliwia operacje wstawiania (countIn), usuwania (countOut) i podglądu 
 * ostatniego elementu (peekaboo) w stosie, a także sprawdzania, czy stos jest pusty
 * (callCheck) oraz pełny (isFull). 
 */
public class defaultCountingOutRhymer {

	/**
	 * Maksymalna pojemność stosu.
	 */
    private static final int MAX_SIZE = 12;
    
    /**
     * Wartość używana do oznaczenia pustego stosu.
     */
    private static final int EMPTY = -1;

    /**
     * Wartość domyślna, oznaczająca brak elementu na stosie.
     */
    private static final int DEFAULT_VALUE = -1;

    /**
     * Tablica przechowująca elementy stosu.
     */
    private final int[] NUMBERS = new int[MAX_SIZE];

    /**
     * Indeks wskazujący na ostatni element na stosie. 
     * Zmienna przechowuje -1, gdy stos jest pusty.
     */
    public int total = EMPTY;

    /**
     * Pobiera aktualny stan stosu (czyli wartość ostatniego elementu).
     * 
     * @return Zwraca aktualną wartość zmiennej total, która oznacza 
     *         indeks ostatniego elementu na stosie.
     */
    public int getTotal() {
		return total;
	}

    /**
     * Dodaje nowy element do stosu, jeśli stos nie jest pełny.
     * 
     * @param in Wartość, która ma zostać dodana do stosu.
     */
	public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     * 
     * @return Zwraca true, jeśli stos jest pusty (czyli nie zawiera żadnych elementów),
     *         w przeciwnym razie zwraca false.
     */
    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     * 
     * @return Zwraca true, jeśli stos jest pełny (osiągnął swoją maksymalną pojemność),
     *         w przeciwnym razie zwraca false.
     */
    public boolean isFull() {
        return total == (MAX_SIZE - 1);
    }

    /**
     * Zwraca ostatni element na stosie, nie usuwając go.
     * 
     * @return Zwraca wartość ostatniego elementu na stosie, jeśli stos nie jest pusty,
     *         w przeciwnym razie zwraca wartość EMPTY.
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total];
    }


    /**
     * Usuwa i zwraca ostatni element ze stosu.
     * 
     * @return Zwraca ostatni element ze stosu, jeśli stos nie jest pusty,
     *         w przeciwnym razie zwraca wartość EMPTY.
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }

}
