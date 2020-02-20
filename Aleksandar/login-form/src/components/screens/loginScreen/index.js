import React, { useState } from "react";
import "./Login.css";

const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const validateForm = () => {
    return email.length > 0 && password.length > 0;
  };

  return (
    <form onSubmit={e => e.preventDefault()}>
      <label>Email</label>
      <input
        autoFocus
        id="email"
        type="email"
        value={email}
        onChange={e => setEmail(e.target.value)}
      />
      <label>Password</label>
      <input
        id="password"
        value={password}
        onChange={e => setPassword(e.target.value)}
      />
      <button className="login" type="submit" disabled={!validateForm()}>
        Login
      </button>
    </form>
  );
};

export default Login;
