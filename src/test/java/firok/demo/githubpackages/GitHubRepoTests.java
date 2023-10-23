package firok.demo.githubpackages;

import firok.topaz.Topaz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static firok.topaz.general.Collections.mappingKeyValue;
import static firok.topaz.general.Collections.sizeOf;

public class GitHubRepoTests
{
    public record TestBean(String id, String value) { }
    @Test
    void testRun()
    {
        var list = new ArrayList<TestBean>();
        list.add(new TestBean("key1", "hello"));
        list.add(new TestBean("key2", "world"));
        list.add(new TestBean("key3", "!"));
        var map = mappingKeyValue(
                list,
                TestBean::id,
                TestBean::value
        );
        Assertions.assertEquals(3, sizeOf(map));
        Assertions.assertEquals("hello", map.get("key1"));
        Assertions.assertEquals("world", map.get("key2"));
        Assertions.assertEquals("!", map.get("key3"));
        System.out.println(Topaz.NAME + " v" + Topaz.VERSION + " by " + Topaz.AUTHOR);
        System.out.println(map.get("key1") + map.get("key2") + map.get("key3"));
    }
}
