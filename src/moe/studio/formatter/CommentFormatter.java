package moe.studio.formatter;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.apache.http.util.TextUtils;

/**
 * @author Kaede
 * @version 16/12/11
 */
public class CommentFormatter extends AnAction {

    //   public static final FiledA mFiledA; // xxx
    //   private static final FiledB mFiledB; // xxx
    //   public FiledC mFiledC; // xxx
    //   protected final FiledD mFiledD; // xxx
    //   FiledE mFiledE; // xxx
    @Override
    public void actionPerformed(AnActionEvent e) {

        //Get all the required data from data keys
        final Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        final Project project = e.getRequiredData(CommonDataKeys.PROJECT);
        //Access document, caret, and selection
        final Document document = editor.getDocument();
        final SelectionModel model = editor.getSelectionModel();

        String text = model.getSelectedText();
        if (TextUtils.isEmpty(text)) {
            alert("Empty selected text.");
            return;
        }

        String[] strings = text.split("\n");
        int longestComment = -1;

        for (String item : strings) {
            if (!item.contains("//")) {
                alert("Line without \"//\" detected.");
                return;
            }
            if (!item.contains(";")) {
                alert("Line without \";\" detected.");
                return;
            }

            int position = item.indexOf("//");
            if (position > longestComment) {
                longestComment = position;
            }
        }

        final int start = model.getSelectionStart();
        final int end = model.getSelectionEnd();
        //New instance of Runnable to make a replacement
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                document.replaceString(start, end, "Replacement");
            }
        };
        //Making the replacement
        WriteCommandAction.runWriteCommandAction(project, runnable);
        model.removeSelection();
    }

    private void alert(String msg) {
        Messages.showMessageDialog(
                msg,
                "Comment Formatter",
                Messages.getInformationIcon());
    }
}
