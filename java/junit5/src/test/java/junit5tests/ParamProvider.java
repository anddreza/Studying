package junit5tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {
    //static here, because every time the method is in a different class from the test class it needs to be static
    static Stream<Arguments> sourceStream_StringDouble(){
        return Stream.of(arguments("apple", 8.9), arguments("pear", 1.9));

    }
}
