package study.mytinylaas.order.webapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  @GetMapping("/api/v1/orders/{orderId}")
  public ResponseEntity<String> order(
      @PathVariable("orderId") Long orderId) {
    return ResponseEntity
        .ok()
        .body("orderId: " + orderId);
  }

}
