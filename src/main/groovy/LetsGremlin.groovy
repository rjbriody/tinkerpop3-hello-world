import com.tinkerpop.gremlin.groovy.loaders.GremlinLoader
import com.tinkerpop.gremlin.groovy.loaders.SugarLoader
import com.tinkerpop.gremlin.tinkergraph.structure.TinkerFactory

public class LetsGremlin{

    public static void main(String[] args) {
        GremlinLoader.load()
        SugarLoader.load()
        def g = TinkerFactory.createTheCrew()
        // Let the gremlin begin!
        g.V().each{println it.name}
    }
}
