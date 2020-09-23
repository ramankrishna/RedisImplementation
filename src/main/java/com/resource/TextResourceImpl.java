package com.resource;

import com.Model.TextModel;
import com.Repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class TextResourceImpl extends TextResource {


    @Autowired
    private TextModel textModel;

    @Autowired
    private TextRepository textRepository ;

    @Override
    public String getText(String id) {
        TextModel text = null;
        text = textRepository.findbyId(id);
        if(text==null){
            return "The Data doesnot exist";
        }
        return text.toString();
        }

    public String saveText(String id , String text){
        textModel.setId(id);
        textModel.setText(text);
        textRepository.saveText(textModel);
        return "The Data is Saved !!" + textModel.getId();

    }
}
