package org.jetbrains.Plugin1;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.popup.JBPopupFactory;

public class TestPlugin1 extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        JBPopupFactory factory = JBPopupFactory.getInstance();
        factory.createMessage("Hello, World!").showInFocusCenter();
    }
}
