package csm;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import csm.StageInitializer.StageReadyEvent;
import javafx.stage.Stage;

public class StageInitializer implements ApplicationListener<StageReadyEvent> {

	@Override
	public void onApplicationEvent(StageReadyEvent event) {
        	Stage stage = event.getStage();		
	}
	
	static class StageReadyEvent extends ApplicationEvent {
	    public StageReadyEvent(Stage stage) {
	        super(stage);
	    }
	    public Stage getStage() {
	        return ((Stage) getSource());
	    }
	}

}
