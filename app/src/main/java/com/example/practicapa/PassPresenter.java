package com.example.practicapa;

public class PassPresenter {

    private IViewPresenter viewPresenter;
    private PassModel model;

    public PassPresenter(IViewPresenter viewPresenter) {
        this.viewPresenter = viewPresenter;
        this.model = new PassModel();

    }

    public void verificadorPassword(String password){
        if (model.verificarPass(password).equals("Weak")) {
            viewPresenter.showPass("#DA1212","Weak");
        } else if (model.verificarPass(password).equals("Medium")) {
            viewPresenter.showPass("#E3F433", "Medium");
        }else {
            viewPresenter.showPass("#4BCF51", "Strong");
        }
    }


}
