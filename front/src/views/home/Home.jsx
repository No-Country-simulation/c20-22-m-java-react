// import React from 'react'

import styles from './Home.module.css'
import ListaDeTarjetas from '../../components/tarjeta/ListaDeTarjetas'

function Home() {
	// const posteos = axios.get(rutaasdasdasd/posts)

	//lista iterada de animales
	const animales = Array.from({ length: 10 }, () => ({
		foto: '/perro.jpg',
		nombre: 'Dubi',
		direccion: 'Calle 123, Encarnacion',
		genero: 'Macho',
		edad: '5 años'
	}))

	return (
		<main>
			<div className={styles.container}>
				<h1 className={styles.title}>Bienvenido a Mascotas Conectadas!</h1>
				<p className={styles.subtitle}>¡Tu comunidad para reunir mascotas perdidas y encontradas! </p>
				<p className={styles.text}>
					Aquí entendemos lo importante que es para ti encontrar a tu compañero peludo. Por eso, hemos creado una plataforma simple y efectiva para ayudarte a reunirte con tu mascota o para que puedas
					ayudar a otros a encontrar la suya
				</p>

				<div className={styles.buttonsContainer}>
					<button type='button' className={styles.buttonPerdi} onClick={() => console.log('click')}>
						Perdí mi mascota
					</button>
					<button type='button' className={styles.buttonEncontre} onClick={() => console.log('click')}>
						Encontré una mascota
					</button>
				</div>
			</div>

			<div>
				<h1>Lista de Mascotas</h1>
				<ListaDeTarjetas animales={animales} />
			</div>
		</main>
	)
}

export default Home
