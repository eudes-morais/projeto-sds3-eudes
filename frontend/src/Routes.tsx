import DashBoard from 'pages/Dashboard';
import Home from 'pages/Home';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

// Componentes especial que define as rotas do sistema
// Maneira alternativa de escrever uma function como esta: function NavBar() {
const Routes = () => {
	return (
		<BrowserRouter>
			<Switch>
				<Route path="/" exact>
					<Home />
				</Route>
				<Route path="/dashboard">
					<DashBoard />
				</Route>
			</Switch>
		</BrowserRouter>
	);
}

export default Routes;