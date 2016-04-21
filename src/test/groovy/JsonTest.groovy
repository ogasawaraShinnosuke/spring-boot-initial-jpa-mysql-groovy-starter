import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovy.transform.Canonical

class JsonTest {

    @Canonical
    static class User {
        int id
        String name
        Info info

        @Canonical
        static class Info {
            String email
            String password
        }
    }

    static void main(args) {
        String.metaClass.toPretty << { -> JsonOutput.prettyPrint(delegate.toString()) }
        def json = new JsonBuilder()
        def users = [new User(1, 'ken', new User.Info('example1@example.com', 'X{xMg"zZKT[n,\\gL*[m]G5')),
                     new User(2, 'mike', new User.Info('example2@example.com', '&"z\\Q<!D?UX9opz\'=Z&/lj')),
                     new User(3, 'bob', new User.Info('example3@example.com', '{BbM=JH8)gJF[u@&v!]i$(')),
                     new User(4, 'marry', new User.Info('example4@example.com', 'Pf=Dp[=`-&|p)4>HNW{\'-%')),
                     new User(5, 'nacy', new User.Info('example5@example.com', ';3wSQEyd8pA>=M*7@|Q2fK'))]
        json.user users, { u ->
            id u.id
            name u.name
            info {
                email u.info.email
                password u.info.password
            }
        }
        println json.toString().toPretty()
    }
}
