package com.melion.memento;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@RequiredArgsConstructor(staticName = "of")
@Builder
@ToString
public class Editor {
    private String content;
    private String title;
    private Type type;

    public Editor(Type type, String content, String title) {
        this.title = title;
        this.type = type;
        this.content = content;
    }


    /******************************************************************************************************
     *
     */

    public void undo(EditorState editorState){
        this.content = editorState.getContent();
        this.type = editorState.getType();
        this.title = editorState.getTitle();
    }

    public EditorState saveState(){
        return new EditorState(new Editor(this.type, this.content, this.title));
    }

}
