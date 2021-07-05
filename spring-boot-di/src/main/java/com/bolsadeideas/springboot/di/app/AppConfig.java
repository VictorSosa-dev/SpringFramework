package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio regristrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	@Primary
	public IServicio regristrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("ItemsFactura")
	public List<ItemFactura> registrarItems() {
		
		Producto producto1 = new Producto("Laptop",1700.0);
		Producto producto2 = new Producto("Mouse",200.0);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		
		return Arrays.asList(linea1,linea2);
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		
		Producto producto1 = new Producto("Impresora EPSON",3000.0);
		Producto producto2 = new Producto("Cable hub",200.0);
		Producto producto3 = new Producto("Notebook Asus",13000.0);
		Producto producto4 = new Producto("Teclado", 500.0);
		
		ItemFactura linea1 = new ItemFactura(producto1,2);
		ItemFactura linea2 = new ItemFactura(producto2,4);
		ItemFactura linea3 = new ItemFactura(producto3,1);
		ItemFactura linea4 = new ItemFactura(producto4,3);

		return Arrays.asList(linea1,linea2,linea3,linea4);
	}
}
