package br.com.welingtoncarlos.placeservice.api;

import jakarta.validation.constraints.NotBlank;

public record PlaceRequest(
                @NotBlank String name,
                @NotBlank String state,
                @NotBlank String city) {
}
