package com.test.treino.controller;

import com.test.treino.convert.userConvert;
import com.test.treino.model.request.UserRequest;
import com.test.treino.model.response.UserResponse;
import com.test.treino.persistence.repository.UserRepository;
import com.test.treino.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/*
 * @RestController
 * 
 * @RequestMapping("/user") public class userController {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @Autowired private userConvert convert;
 * 
 * @Autowired private UserService service;
 * 
 * @PostMapping("/newUser")
 * 
 * @ResponseStatus(HttpStatus.CREATED) public ResponseEntity<UserResponse>
 * adicionar(@RequestBody UserRequest request) { return
 * ResponseEntity.ok(service.adicionar(request));
 * 
 * }
 * 
 * 
 * @PostMapping("/newUser")
 * 
 * @ResponseStatus(HttpStatus.CREATED) // retornar UserResponse, resposta de um
 * json com dados // UserRequest, uma requisição é disparada, mandando o corpo
 * dela public ResponseEntity<UserResponse> adicionar(@RequestBody UserRequest
 * request) {
 * 
 * User usuario = userRepository.save(user);
 * 
 * UserResponse response = convert.toUserDto(usuario);
 * 
 * return ResponseEntity.ok(response);
 * 
 * return ResponseEntity.ok(service.adicionar(request)); }
 * 
 * @GetMapping public ResponseEntity<List<UserResponse>> listar() {
 * 
 * List<User> listar = userRepository.findAll();
 * 
 * List<UserResponse> response = convert.toUserDto(listar);
 * 
 * return ResponseEntity.ok(response); }
 * 
 * @GetMapping("/{id}") public ResponseEntity<Optional<User>>
 * listarClienteId(@PathVariable("id") Long id) { Optional<User> user =
 * userRepository.findById(id); return ResponseEntity.ok(user); }
 * 
 * @PutMapping("/{id}")
 * 
 * @ResponseStatus(HttpStatus.ACCEPTED) public ResponseEntity<User>
 * atualizar(@PathVariable("id") Long id, @RequestBody User user) {
 * 
 * Optional<User> usuario = userRepository.findById(id);
 * 
 * user.setName(usuario.get().getName());
 * user.setEmail(usuario.get().getEmail());
 * 
 * userRepository.save(user);
 * 
 * return ResponseEntity.ok(user); }
 * 
 * @DeleteMapping("/{id}") public ResponseEntity<?> deletar(@PathVariable("id")
 * Long id) {
 * 
 * User identi = userRepository.getById(id);
 * 
 * userRepository.delete(identi);
 * 
 * return ResponseEntity.ok().body("Deletado com sucesso!"); }
 * 
 * 
 * }
 */