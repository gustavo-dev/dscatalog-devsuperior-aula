import { ReactComponent as AuthImage } from 'assets/images/auth-image.svg';
import { Route, Switch } from 'react-router-dom';

import './styles.css';
import Login from './Login';

const Auth = () => {
  return (
    <div className="auth-container">
      <div className="auth-banner-container">
        <h1>Divulgue seus produtos no DS Catalog</h1>
        <p>
          Faça parte do nosso catálogo de divulgação e aumente a venda dos seus
          produtos.
        </p>
        <AuthImage />
      </div>
      <div className="auth-form-container">
        <Switch>
          <Route path="/admin/auth/login">
            <Login />
          </Route>
          <Route path="/admin/auth/signup">
            <h1>Card de Registro</h1>
          </Route>
          <Route path="/admin/auth/recover">
            <h1>Card de Recuperação</h1>
          </Route>
        </Switch>
      </div>
    </div>
  );
};

export default Auth;
