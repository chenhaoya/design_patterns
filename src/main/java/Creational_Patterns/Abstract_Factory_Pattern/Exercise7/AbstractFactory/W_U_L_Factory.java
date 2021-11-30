package Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractFactory;

import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractProduct.Button;
import Creational_Patterns.Abstract_Factory_Pattern.Exercise7.AbstractProduct.Text;

public interface W_U_L_Factory {
    Button createButton();
    Text createText();
}
