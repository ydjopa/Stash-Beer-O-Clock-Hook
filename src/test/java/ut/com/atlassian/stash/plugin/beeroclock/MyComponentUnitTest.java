package ut.com.atlassian.stash.plugin.beeroclock;

import org.junit.Test;
import com.atlassian.stash.plugin.beeroclock.api.MyPluginComponent;
import com.atlassian.stash.plugin.beeroclock.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}