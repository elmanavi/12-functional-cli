package ohm.softa.a12.cnjdb.suppliers;

import ohm.softa.a12.cnjdb.CNJDBApi;
import ohm.softa.a12.cnjdb.CNJDBService;
import ohm.softa.a12.model.JokeDto;
import org.apache.commons.lang3.NotImplementedException;

/**
 * Supplier implementation to retrieve all jokes of the ICNDB in a linear way
 * @author Peter Kurfer
 */

public final class AllJokesSupplier {

    /* ICNDB API proxy to retrieve jokes */
    private final CNJDBApi icndbApi;

    public AllJokesSupplier() {
        icndbApi = new CNJDBService().getInstance();
        /* TODO fetch the total count of jokes the API is aware of
         * to determine when all jokes are iterated and the counters have to be reset */
    }

    public JokeDto get() {
        /* TODO retrieve the next joke
         * note that there might be IDs that are not present in the database
         * you have to catch an exception and continue if no joke was retrieved to an ID
         * if you retrieved all jokes (count how many jokes you successfully fetched from the API)
         * reset the counters and continue at the beginning */
        throw new NotImplementedException("Method `get()` is not implemented");
    }

}