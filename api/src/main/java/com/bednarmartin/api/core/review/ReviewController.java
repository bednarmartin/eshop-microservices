package com.bednarmartin.api.core.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ReviewController {

    @GetMapping(
            value = "/review/{reviewId}",
            produces = "application/json"
    )
    Review getReview(@PathVariable long reviewId);
}
