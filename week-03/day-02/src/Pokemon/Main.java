package Pokemon;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        // Which pokemon should Ash use?

        String chosenPokemon = choosePokemon(wildPokemon, initializePokemons()).name;
        System.out.print("I choose you, " + chosenPokemon);
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemons.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemons.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemons.add(new Pokemon("Balbasaur", "water", "fire"));
        pokemons.add(new Pokemon("Kingler", "water", "fire"));

        return pokemons;
    }

    private static Pokemon choosePokemon(Pokemon enemyPokemon, List<Pokemon> pokemonList) {
        Pokemon returnNoPokemon = new Pokemon("None", "", "");
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.isEffectiveAgainst(enemyPokemon)) {
                return pokemon;
            } else if (!enemyPokemon.isEffectiveAgainst(pokemon)) {
                returnNoPokemon = pokemon;
            }
        }
        return returnNoPokemon;
    }
}