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
    private Type type;  //TYPE -> Editor Has A TYPE -> Composition

    public Editor(Type type, String content, String title) { // TYPE-> DEpendency
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
        type =Type.MP4;
        String str= type.vaule;
    }

    public EditorState saveState(){
        return new EditorState(new Editor(this.type, this.content, this.title));
    }

}
