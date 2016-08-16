/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.henu.rjxy.lms.model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Name : liubingxu Email : 2727826327qq.com
 */
public class Tree2 {
    private Integer id;  
    private String state;
    private String text; 
    private String attributes;
    private Tree2 target;
    private String domId;
    private boolean checked;
    private String[] resource;
    private List<Tree2> children = new LinkedList(); //子节点

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    
    public String[] getResource() {
        return resource;
    }

    public void setResource(String[] resource) {
        this.resource = resource;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Tree2 getTarget() {
        return target;
    }

    public void setTarget(Tree2 target) {
        this.target = target;
    }

   

    public String getDomId() {
        return domId;
    }

    public void setDomId(String domId) {
        this.domId = domId;
    }

    public List<Tree2> getChildren() {
        return children;
    }

    public void setChildren(List<Tree2> children) {
        this.children = children;
    }
    
}
