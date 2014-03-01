package dao;

import datos.HibernateUtil;
import datos.Articulo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ArticulosDao {

    private Session sesion;
    private Transaction tx;

    private void iniciaOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public void actualizaArticulo(Articulo art) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(art);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }
    
    public Articulo traerArticulo(int idArticulo) throws HibernateException {
        Articulo art = null;
        try {
            iniciaOperacion();
            art = (Articulo) sesion.get(Articulo.class, idArticulo);
        } finally {
            sesion.close();
        }
        return art;
    }
    
    public List<Articulo> traerArticulosDeProveedor(int id) throws HibernateException {
        List<Articulo> lista = null;
        try {
            iniciaOperacion();
            lista =sesion.createQuery("from Articulo a where a.proveedor.id="+id).list();
        } finally {
            sesion.close();
        }
        return lista;
    }
    
    public List<Articulo> traerListaArticulos() throws HibernateException {
        List<Articulo> lista = null;
        try {
            iniciaOperacion();
            lista =sesion.createQuery("from Articulo").list();
        } finally {
            sesion.close();
        }
        return lista;
    }
    
    public int guardaArticulo(Articulo art) {
        int id = 0;
        try {
            iniciaOperacion();
            id = (int) sesion.save(art);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
        return id;
    }
}
