package com.tokioSchool;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

  public AppView appView;
  public AppController appController;

  @Override
  public void init() throws  Exception{
      super.init();
  }


    @Override
    public void start(Stage stage) {
        appView = new AppView(stage);
        appController = new AppController(appView);
    }

    @Override
    public void stop()throws Exception{
      super.stop();
    }
    public static void main(String[]args){
    launch();
    }
}
