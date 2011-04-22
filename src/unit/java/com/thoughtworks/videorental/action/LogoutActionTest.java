package com.thoughtworks.videorental.action;

import org.apache.struts2.dispatcher.SessionMap;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LogoutActionTest {

    private SessionMap<String, Object> session;
    private LogoutAction logoutAction;

    @SuppressWarnings("unchecked")
    @Before
    public void setUp() {
        session = mock(SessionMap.class);
        logoutAction = new LogoutAction();
        logoutAction.setSession(session);
    }

    @Test
    public void shouldInvalidateSession() throws Exception {
        logoutAction.execute();
        verify(session).invalidate();
    }
}
