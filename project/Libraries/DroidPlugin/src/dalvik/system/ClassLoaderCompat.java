package dalvik.system;

public class ClassLoaderCompat extends PathClassLoader {
//    String optimizedDirectory;
//    private DexClassLoader mDexClassLoader;

    public ClassLoaderCompat(String dexPath, String optimizedDirectory,
                             String libraryPath, ClassLoader parent) {
        super(dexPath, libraryPath, new DexClassLoader(dexPath, optimizedDirectory, libraryPath, parent));
        //optimizedDirectory
//        this.optimizedDirectory = optimizedDirectory;
//        mDexClassLoader = new DexClassLoader(dexPath, optimizedDirectory, libraryPath, parent);
    }

    public ClassLoaderCompat(String dexPath, String libraryPath,
                             ClassLoader parent) {
        super(dexPath, libraryPath, parent);

//        this.pathList = makeDexPathList(this, dexPath, libraryPath, optimizedDirectory == null ? null : new File(optimizedDirectory));
//        Log.i("kk", "pathList=" + pathList);
//        setDexPathList(pathList);
    }
//
//    private void setDexPathList(Object pathList) {
//        if (pathList != null) {
//            Field field = null;
//            try {
//                field = BaseDexClassLoader.class.getDeclaredField("pathList");
//                field.setAccessible(true);
////                Field modifiersField = Field.class.getDeclaredField("modifiers");
////                modifiersField.setAccessible(true);
////                modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
//                field.set(this, pathList);
//                Log.i("kk", "pathList ok");
//            } catch (NoSuchFieldException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//                Log.e("kk", "pathList fail", e);
//            }
//        }
//    }
//
//    private Object makeDexPathList(ClassLoader definingContext, String dexPath,
//                                   String libraryPath, File optimizedDirectory) {
//        Object object = null;
//        Class<?> cDexPathList = null;
//        try {
//            cDexPathList = Class.forName("dalvik.system.DexPathList");
//            Constructor<?> constructor = cDexPathList.getConstructor(ClassLoader.class, String.class, String.class, File.class);
//            if (constructor != null) {
//                object = constructor.newInstance(definingContext, dexPath, libraryPath, optimizedDirectory);
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        return object;
//    }
//
//    @Override
//    protected Class<?> findClass(String name) throws ClassNotFoundException {
////        List<Throwable> suppressedExceptions = new ArrayList<Throwable>();
////        Class c = null;
////        try {
////            c = (Class) MethodUtils.invokeMethod(pathList, "findClass", new Object[]{name, suppressedExceptions}, new Class[]{String.class, List.class});
////        } catch (NoSuchMethodException e) {
////            e.printStackTrace();
////        } catch (IllegalAccessException e) {
////            e.printStackTrace();
////        } catch (InvocationTargetException e) {
////            e.printStackTrace();
////        }
////        if (c == null) {
////            c = super.findClass(name);
////        }
////        if (c == null) {
////            ClassNotFoundException cnfe = new ClassNotFoundException("Didn't find class \"" + name + "\" on path: " + pathList);
////            for (Throwable t : suppressedExceptions) {
//////                cnfe.addSuppressed(t);
////            }
////            throw cnfe;
////        }
//        return mDexClassLoader.findClass(name);
//    }
//
//    @Override
//    protected URL findResource(String name) {
//        return mDexClassLoader.findResource(name);
////        try {
////            return (URL) MethodUtils.invokeMethod(pathList, "findResource", name);
////        } catch (NoSuchMethodException e) {
////            e.printStackTrace();
////        } catch (IllegalAccessException e) {
////            e.printStackTrace();
////        } catch (InvocationTargetException e) {
////            e.printStackTrace();
////        }
////        return super.findResource(name);
////        return pathList.findResource(name);
//    }
//
//    @Override
//    protected Enumeration<URL> findResources(String name) {
////        try {
////            return (Enumeration<URL>) MethodUtils.invokeMethod(pathList, "findResources", name);
////        } catch (NoSuchMethodException e) {
////            e.printStackTrace();
////        } catch (IllegalAccessException e) {
////            e.printStackTrace();
////        } catch (InvocationTargetException e) {
////            e.printStackTrace();
////        }
////        return super.findResources(name);
//        return mDexClassLoader.findResources(name);
//    }
//
//    @Override
//    public String findLibrary(String name) {
////        try {
////            return (String) MethodUtils.invokeMethod(pathList, "findLibrary", name);
////        } catch (NoSuchMethodException e) {
////            e.printStackTrace();
////        } catch (IllegalAccessException e) {
////            e.printStackTrace();
////        } catch (InvocationTargetException e) {
////            e.printStackTrace();
////        }
//        return mDexClassLoader.findLibrary(name);//super.findLibrary(name);
//    }
//
//    public String getLdLibraryPath() {
//        File[] directorys = null;
//        try {
//            directorys = (File[]) MethodUtils.invokeMethod(mDexClassLoader, "getLdLibraryPath");
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        if (directorys != null) {
//            StringBuilder result = new StringBuilder();
//            for (File directory : directorys) {
//                if (result.length() > 0) {
//                    result.append(':');
//                }
//                result.append(directory);
//            }
//            return result.toString();
//        }
//        return null;
//    }
//
//    @Override
//    public String toString() {
//        return mDexClassLoader.toString();
//    }
}
