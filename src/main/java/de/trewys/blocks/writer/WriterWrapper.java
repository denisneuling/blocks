package de.trewys.blocks.writer;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletResponse;

public class WriterWrapper extends Writer {

	private ServletResponse servletResponse;
	private Writer writer;
	
	public WriterWrapper(ServletResponse servletResponse){
		this.servletResponse = servletResponse;
	}
	
	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		lazyInitializeWriter();
		writer.write(cbuf, off, len);
	}

	@Override
	public void flush() throws IOException {
		lazyInitializeWriter();
		writer.flush();
	}

	@Override
	public void close() throws IOException {
		lazyInitializeWriter();
		writer.close();
	}
	
	private void lazyInitializeWriter() throws IOException{
		if(writer != null){
			writer = servletResponse.getWriter();
		}
	}
}
