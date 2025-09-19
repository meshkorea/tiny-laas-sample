package study.mytinylaas.dispatch.webapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispatchController {

  @PostMapping("/api/v1/dispatch/{dispatchId}")
  public ResponseEntity<String> dispatch(
      @PathVariable("dispatchId") Long dispatchId) {
    return ResponseEntity
        .ok()
        .body("dispatchId: " + dispatchId);
  }

}
