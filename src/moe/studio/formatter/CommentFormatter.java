package moe.studio.formatter;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

/**
 * @author Kaede
 * @version 16/12/11
 */
public class CommentFormatter extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showMessageDialog(
                "试一试看看效果",
                "这是标题",
                Messages.getInformationIcon());
    }
}
