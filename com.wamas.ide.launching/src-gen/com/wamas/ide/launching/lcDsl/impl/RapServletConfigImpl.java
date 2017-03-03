/**
 * generated by Xtext 2.10.0
 */
package com.wamas.ide.launching.lcDsl.impl;

import com.wamas.ide.launching.lcDsl.BrowserLaunchMode;
import com.wamas.ide.launching.lcDsl.LcDslPackage;
import com.wamas.ide.launching.lcDsl.RapServletConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rap Servlet Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RapServletConfigImpl#getServletPath <em>Servlet Path</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RapServletConfigImpl#getBrowserMode <em>Browser Mode</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RapServletConfigImpl#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RapServletConfigImpl#getSessionTimeout <em>Session Timeout</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RapServletConfigImpl#getContextPath <em>Context Path</em>}</li>
 *   <li>{@link com.wamas.ide.launching.lcDsl.impl.RapServletConfigImpl#isDevMode <em>Dev Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RapServletConfigImpl extends MinimalEObjectImpl.Container implements RapServletConfig
{
  /**
   * The default value of the '{@link #getServletPath() <em>Servlet Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServletPath()
   * @generated
   * @ordered
   */
  protected static final String SERVLET_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServletPath() <em>Servlet Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServletPath()
   * @generated
   * @ordered
   */
  protected String servletPath = SERVLET_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getBrowserMode() <em>Browser Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrowserMode()
   * @generated
   * @ordered
   */
  protected static final BrowserLaunchMode BROWSER_MODE_EDEFAULT = BrowserLaunchMode.INTERNAL;

  /**
   * The cached value of the '{@link #getBrowserMode() <em>Browser Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrowserMode()
   * @generated
   * @ordered
   */
  protected BrowserLaunchMode browserMode = BROWSER_MODE_EDEFAULT;

  /**
   * The default value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerPort()
   * @generated
   * @ordered
   */
  protected static final int SERVER_PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerPort()
   * @generated
   * @ordered
   */
  protected int serverPort = SERVER_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessionTimeout()
   * @generated
   * @ordered
   */
  protected static final int SESSION_TIMEOUT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSessionTimeout()
   * @generated
   * @ordered
   */
  protected int sessionTimeout = SESSION_TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextPath()
   * @generated
   * @ordered
   */
  protected static final String CONTEXT_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContextPath() <em>Context Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContextPath()
   * @generated
   * @ordered
   */
  protected String contextPath = CONTEXT_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #isDevMode() <em>Dev Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDevMode()
   * @generated
   * @ordered
   */
  protected static final boolean DEV_MODE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDevMode() <em>Dev Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDevMode()
   * @generated
   * @ordered
   */
  protected boolean devMode = DEV_MODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RapServletConfigImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LcDslPackage.Literals.RAP_SERVLET_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServletPath()
  {
    return servletPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServletPath(String newServletPath)
  {
    String oldServletPath = servletPath;
    servletPath = newServletPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.RAP_SERVLET_CONFIG__SERVLET_PATH, oldServletPath, servletPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrowserLaunchMode getBrowserMode()
  {
    return browserMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrowserMode(BrowserLaunchMode newBrowserMode)
  {
    BrowserLaunchMode oldBrowserMode = browserMode;
    browserMode = newBrowserMode == null ? BROWSER_MODE_EDEFAULT : newBrowserMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.RAP_SERVLET_CONFIG__BROWSER_MODE, oldBrowserMode, browserMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getServerPort()
  {
    return serverPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServerPort(int newServerPort)
  {
    int oldServerPort = serverPort;
    serverPort = newServerPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.RAP_SERVLET_CONFIG__SERVER_PORT, oldServerPort, serverPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSessionTimeout()
  {
    return sessionTimeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSessionTimeout(int newSessionTimeout)
  {
    int oldSessionTimeout = sessionTimeout;
    sessionTimeout = newSessionTimeout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.RAP_SERVLET_CONFIG__SESSION_TIMEOUT, oldSessionTimeout, sessionTimeout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContextPath()
  {
    return contextPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContextPath(String newContextPath)
  {
    String oldContextPath = contextPath;
    contextPath = newContextPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.RAP_SERVLET_CONFIG__CONTEXT_PATH, oldContextPath, contextPath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDevMode()
  {
    return devMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDevMode(boolean newDevMode)
  {
    boolean oldDevMode = devMode;
    devMode = newDevMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LcDslPackage.RAP_SERVLET_CONFIG__DEV_MODE, oldDevMode, devMode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LcDslPackage.RAP_SERVLET_CONFIG__SERVLET_PATH:
        return getServletPath();
      case LcDslPackage.RAP_SERVLET_CONFIG__BROWSER_MODE:
        return getBrowserMode();
      case LcDslPackage.RAP_SERVLET_CONFIG__SERVER_PORT:
        return getServerPort();
      case LcDslPackage.RAP_SERVLET_CONFIG__SESSION_TIMEOUT:
        return getSessionTimeout();
      case LcDslPackage.RAP_SERVLET_CONFIG__CONTEXT_PATH:
        return getContextPath();
      case LcDslPackage.RAP_SERVLET_CONFIG__DEV_MODE:
        return isDevMode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LcDslPackage.RAP_SERVLET_CONFIG__SERVLET_PATH:
        setServletPath((String)newValue);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__BROWSER_MODE:
        setBrowserMode((BrowserLaunchMode)newValue);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__SERVER_PORT:
        setServerPort((Integer)newValue);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__SESSION_TIMEOUT:
        setSessionTimeout((Integer)newValue);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__CONTEXT_PATH:
        setContextPath((String)newValue);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__DEV_MODE:
        setDevMode((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LcDslPackage.RAP_SERVLET_CONFIG__SERVLET_PATH:
        setServletPath(SERVLET_PATH_EDEFAULT);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__BROWSER_MODE:
        setBrowserMode(BROWSER_MODE_EDEFAULT);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__SERVER_PORT:
        setServerPort(SERVER_PORT_EDEFAULT);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__SESSION_TIMEOUT:
        setSessionTimeout(SESSION_TIMEOUT_EDEFAULT);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__CONTEXT_PATH:
        setContextPath(CONTEXT_PATH_EDEFAULT);
        return;
      case LcDslPackage.RAP_SERVLET_CONFIG__DEV_MODE:
        setDevMode(DEV_MODE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LcDslPackage.RAP_SERVLET_CONFIG__SERVLET_PATH:
        return SERVLET_PATH_EDEFAULT == null ? servletPath != null : !SERVLET_PATH_EDEFAULT.equals(servletPath);
      case LcDslPackage.RAP_SERVLET_CONFIG__BROWSER_MODE:
        return browserMode != BROWSER_MODE_EDEFAULT;
      case LcDslPackage.RAP_SERVLET_CONFIG__SERVER_PORT:
        return serverPort != SERVER_PORT_EDEFAULT;
      case LcDslPackage.RAP_SERVLET_CONFIG__SESSION_TIMEOUT:
        return sessionTimeout != SESSION_TIMEOUT_EDEFAULT;
      case LcDslPackage.RAP_SERVLET_CONFIG__CONTEXT_PATH:
        return CONTEXT_PATH_EDEFAULT == null ? contextPath != null : !CONTEXT_PATH_EDEFAULT.equals(contextPath);
      case LcDslPackage.RAP_SERVLET_CONFIG__DEV_MODE:
        return devMode != DEV_MODE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (servletPath: ");
    result.append(servletPath);
    result.append(", browserMode: ");
    result.append(browserMode);
    result.append(", serverPort: ");
    result.append(serverPort);
    result.append(", sessionTimeout: ");
    result.append(sessionTimeout);
    result.append(", contextPath: ");
    result.append(contextPath);
    result.append(", devMode: ");
    result.append(devMode);
    result.append(')');
    return result.toString();
  }

} //RapServletConfigImpl
