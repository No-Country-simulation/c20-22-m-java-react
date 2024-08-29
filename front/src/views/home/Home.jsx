// import React from 'react'

import styles from './Home.module.css'

function Home() {

	// const posteos = axios.get(rutaasdasdasd/posts)


	return (
		<main className={styles.container}>
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
		</main>
	)
}

export default Home
