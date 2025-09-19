package study.mytinylaas.delivery.webapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

  @GetMapping("/api/v1/delivery/{deliveryId}")
  public ResponseEntity<String> delivery(
      @PathVariable("deliveryId") Long deliveryId) {
    return ResponseEntity
        .ok()
        .body("deliveryId: " + deliveryId);
  }

}
