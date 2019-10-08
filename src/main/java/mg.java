public class mg {
    mg() throws Throwable {
        super();
        throw new Error();
    }

    static void aa(short[] arg2, int arg3, short[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    public static void ab(int[] arg2, int arg3, int arg4) {
        arg4 = arg4 + arg3 - 7;
        while(arg3 < arg4) {
            int v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
        }

        arg4 += 7;
        while(arg3 < arg4) {
            arg2[arg3] = 0;
            ++arg3;
        }
    }

    static void ac(long[] arg4, int arg5, long[] arg6, int arg7, int arg8) {
        int v1;
        int v0;
        if(arg4 == arg6) {
            if(arg5 == arg7) {
                return;
            }
            else if(arg7 > arg5 && arg7 < arg5 + arg8) {
                --arg8;
                arg5 += arg8;
                arg7 += arg8;
                arg8 = arg5 - arg8 + 3;
                while(arg5 >= arg8) {
                    v0 = arg7 - 1;
                    v1 = arg5 - 1;
                    arg6[arg7] = arg4[arg5];
                    arg5 = v0 - 1;
                    arg7 = v1 - 1;
                    arg6[v0] = arg4[v1];
                    v0 = arg5 - 1;
                    v1 = arg7 - 1;
                    arg6[arg5] = arg4[arg7];
                    arg7 = v0 - 1;
                    arg5 = v1 - 1;
                    arg6[v0] = arg4[v1];
                }

                arg8 += -3;
                while(arg5 >= arg8) {
                    arg6[arg7] = arg4[arg5];
                    --arg7;
                    --arg5;
                }

                return;
            }
        }

        arg8 = arg8 + arg5 - 3;
        while(arg5 < arg8) {
            v0 = arg7 + 1;
            v1 = arg5 + 1;
            arg6[arg7] = arg4[arg5];
            arg5 = v0 + 1;
            arg7 = v1 + 1;
            arg6[v0] = arg4[v1];
            v0 = arg5 + 1;
            v1 = arg7 + 1;
            arg6[arg5] = arg4[arg7];
            arg7 = v0 + 1;
            arg5 = v1 + 1;
            arg6[v0] = arg4[v1];
        }

        arg8 += 3;
        while(arg5 < arg8) {
            arg6[arg7] = arg4[arg5];
            ++arg7;
            ++arg5;
        }
    }

    static void ad(boolean[] arg2, int arg3, boolean[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void ae(char[] arg2, int arg3, char[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    public static void af(byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void ag(char[] arg2, int arg3, char[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void ah(char[] arg2, int arg3, char[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void ai(short[] arg2, int arg3, short[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void aj(double[] arg4, int arg5, double[] arg6, int arg7, int arg8) {
        int v1;
        int v0;
        if(arg4 == arg6) {
            if(arg5 == arg7) {
                return;
            }
            else if(arg7 > arg5 && arg7 < arg5 + arg8) {
                --arg8;
                arg5 += arg8;
                arg7 += arg8;
                arg8 = arg5 - arg8 + 3;
                while(arg5 >= arg8) {
                    v0 = arg7 - 1;
                    v1 = arg5 - 1;
                    arg6[arg7] = arg4[arg5];
                    arg5 = v0 - 1;
                    arg7 = v1 - 1;
                    arg6[v0] = arg4[v1];
                    v0 = arg5 - 1;
                    v1 = arg7 - 1;
                    arg6[arg5] = arg4[arg7];
                    arg7 = v0 - 1;
                    arg5 = v1 - 1;
                    arg6[v0] = arg4[v1];
                }

                arg8 += -3;
                while(arg5 >= arg8) {
                    arg6[arg7] = arg4[arg5];
                    --arg7;
                    --arg5;
                }

                return;
            }
        }

        arg8 = arg8 + arg5 - 3;
        while(arg5 < arg8) {
            v0 = arg7 + 1;
            v1 = arg5 + 1;
            arg6[arg7] = arg4[arg5];
            arg5 = v0 + 1;
            arg7 = v1 + 1;
            arg6[v0] = arg4[v1];
            v0 = arg5 + 1;
            v1 = arg7 + 1;
            arg6[arg5] = arg4[arg7];
            arg7 = v0 + 1;
            arg5 = v1 + 1;
            arg6[v0] = arg4[v1];
        }

        arg8 += 3;
        while(arg5 < arg8) {
            arg6[arg7] = arg4[arg5];
            ++arg7;
            ++arg5;
        }
    }

    static void ak(long[] arg4, int arg5, long[] arg6, int arg7, int arg8) {
        int v1;
        int v0;
        if(arg4 == arg6) {
            if(arg5 == arg7) {
                return;
            }
            else if(arg7 > arg5 && arg7 < arg5 + arg8) {
                --arg8;
                arg5 += arg8;
                arg7 += arg8;
                arg8 = arg5 - arg8 + 3;
                while(arg5 >= arg8) {
                    v0 = arg7 - 1;
                    v1 = arg5 - 1;
                    arg6[arg7] = arg4[arg5];
                    arg5 = v0 - 1;
                    arg7 = v1 - 1;
                    arg6[v0] = arg4[v1];
                    v0 = arg5 - 1;
                    v1 = arg7 - 1;
                    arg6[arg5] = arg4[arg7];
                    arg7 = v0 - 1;
                    arg5 = v1 - 1;
                    arg6[v0] = arg4[v1];
                }

                arg8 += -3;
                while(arg5 >= arg8) {
                    arg6[arg7] = arg4[arg5];
                    --arg7;
                    --arg5;
                }

                return;
            }
        }

        arg8 = arg8 + arg5 - 3;
        while(arg5 < arg8) {
            v0 = arg7 + 1;
            v1 = arg5 + 1;
            arg6[arg7] = arg4[arg5];
            arg5 = v0 + 1;
            arg7 = v1 + 1;
            arg6[v0] = arg4[v1];
            v0 = arg5 + 1;
            v1 = arg7 + 1;
            arg6[arg5] = arg4[arg7];
            arg7 = v0 + 1;
            arg5 = v1 + 1;
            arg6[v0] = arg4[v1];
        }

        arg8 += 3;
        while(arg5 < arg8) {
            arg6[arg7] = arg4[arg5];
            ++arg7;
            ++arg5;
        }
    }

    static void al(short[] arg2, int arg3, short[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void am(char[] arg2, int arg3, char[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void an(long[] arg4, int arg5, long[] arg6, int arg7, int arg8) {
        int v1;
        int v0;
        if(arg4 == arg6) {
            if(arg5 == arg7) {
                return;
            }
            else if(arg7 > arg5 && arg7 < arg5 + arg8) {
                --arg8;
                arg5 += arg8;
                arg7 += arg8;
                arg8 = arg5 - arg8 + 3;
                while(arg5 >= arg8) {
                    v0 = arg7 - 1;
                    v1 = arg5 - 1;
                    arg6[arg7] = arg4[arg5];
                    arg5 = v0 - 1;
                    arg7 = v1 - 1;
                    arg6[v0] = arg4[v1];
                    v0 = arg5 - 1;
                    v1 = arg7 - 1;
                    arg6[arg5] = arg4[arg7];
                    arg7 = v0 - 1;
                    arg5 = v1 - 1;
                    arg6[v0] = arg4[v1];
                }

                arg8 += -3;
                while(arg5 >= arg8) {
                    arg6[arg7] = arg4[arg5];
                    --arg7;
                    --arg5;
                }

                return;
            }
        }

        arg8 = arg8 + arg5 - 3;
        while(arg5 < arg8) {
            v0 = arg7 + 1;
            v1 = arg5 + 1;
            arg6[arg7] = arg4[arg5];
            arg5 = v0 + 1;
            arg7 = v1 + 1;
            arg6[v0] = arg4[v1];
            v0 = arg5 + 1;
            v1 = arg7 + 1;
            arg6[arg5] = arg4[arg7];
            arg7 = v0 + 1;
            arg5 = v1 + 1;
            arg6[v0] = arg4[v1];
        }

        arg8 += 3;
        while(arg5 < arg8) {
            arg6[arg7] = arg4[arg5];
            ++arg7;
            ++arg5;
        }
    }

    static void ao(int[] arg2, int arg3, int[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void ap(float[] arg2, int arg3, float[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void aq(Object[] arg2, int arg3, Object[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void ar(int[] arg2, int arg3, int[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void as(long[] arg4, int arg5, long[] arg6, int arg7, int arg8) {
        int v1;
        int v0;
        if(arg4 == arg6) {
            if(arg5 == arg7) {
                return;
            }
            else if(arg7 > arg5 && arg7 < arg5 + arg8) {
                --arg8;
                arg5 += arg8;
                arg7 += arg8;
                arg8 = arg5 - arg8 + 3;
                while(arg5 >= arg8) {
                    v0 = arg7 - 1;
                    v1 = arg5 - 1;
                    arg6[arg7] = arg4[arg5];
                    arg5 = v0 - 1;
                    arg7 = v1 - 1;
                    arg6[v0] = arg4[v1];
                    v0 = arg5 - 1;
                    v1 = arg7 - 1;
                    arg6[arg5] = arg4[arg7];
                    arg7 = v0 - 1;
                    arg5 = v1 - 1;
                    arg6[v0] = arg4[v1];
                }

                arg8 += -3;
                while(arg5 >= arg8) {
                    arg6[arg7] = arg4[arg5];
                    --arg7;
                    --arg5;
                }

                return;
            }
        }

        arg8 = arg8 + arg5 - 3;
        while(arg5 < arg8) {
            v0 = arg7 + 1;
            v1 = arg5 + 1;
            arg6[arg7] = arg4[arg5];
            arg5 = v0 + 1;
            arg7 = v1 + 1;
            arg6[v0] = arg4[v1];
            v0 = arg5 + 1;
            v1 = arg7 + 1;
            arg6[arg5] = arg4[arg7];
            arg7 = v0 + 1;
            arg5 = v1 + 1;
            arg6[v0] = arg4[v1];
        }

        arg8 += 3;
        while(arg5 < arg8) {
            arg6[arg7] = arg4[arg5];
            ++arg7;
            ++arg5;
        }
    }

    static void at(char[] arg2, int arg3, char[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void au(short[] arg2, int arg3, short[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void av(short[] arg2, int arg3, short[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void aw(int[] arg2, int arg3, int[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    public static void ax(byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void ay(int[] arg2, int arg3, int[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void az(char[] arg2, int arg3, char[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void ba(float[] arg2, int arg3, float[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void bd(float[] arg2, int arg3, float[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void bf(float[] arg2, int arg3, float[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    public static void bg(int[] arg2, int arg3, int arg4) {
        arg4 = arg4 + arg3 - 7;
        while(arg3 < arg4) {
            int v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
        }

        arg4 += 7;
        while(arg3 < arg4) {
            arg2[arg3] = 0;
            ++arg3;
        }
    }

    static void bn(double[] arg4, int arg5, double[] arg6, int arg7, int arg8) {
        int v1;
        int v0;
        if(arg4 == arg6) {
            if(arg5 == arg7) {
                return;
            }
            else if(arg7 > arg5 && arg7 < arg5 + arg8) {
                --arg8;
                arg5 += arg8;
                arg7 += arg8;
                arg8 = arg5 - arg8 + 3;
                while(arg5 >= arg8) {
                    v0 = arg7 - 1;
                    v1 = arg5 - 1;
                    arg6[arg7] = arg4[arg5];
                    arg5 = v0 - 1;
                    arg7 = v1 - 1;
                    arg6[v0] = arg4[v1];
                    v0 = arg5 - 1;
                    v1 = arg7 - 1;
                    arg6[arg5] = arg4[arg7];
                    arg7 = v0 - 1;
                    arg5 = v1 - 1;
                    arg6[v0] = arg4[v1];
                }

                arg8 += -3;
                while(arg5 >= arg8) {
                    arg6[arg7] = arg4[arg5];
                    --arg7;
                    --arg5;
                }

                return;
            }
        }

        arg8 = arg8 + arg5 - 3;
        while(arg5 < arg8) {
            v0 = arg7 + 1;
            v1 = arg5 + 1;
            arg6[arg7] = arg4[arg5];
            arg5 = v0 + 1;
            arg7 = v1 + 1;
            arg6[v0] = arg4[v1];
            v0 = arg5 + 1;
            v1 = arg7 + 1;
            arg6[arg5] = arg4[arg7];
            arg7 = v0 + 1;
            arg5 = v1 + 1;
            arg6[v0] = arg4[v1];
        }

        arg8 += 3;
        while(arg5 < arg8) {
            arg6[arg7] = arg4[arg5];
            ++arg7;
            ++arg5;
        }
    }

    static void bo(boolean[] arg2, int arg3, boolean[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void bp(double[] arg4, int arg5, double[] arg6, int arg7, int arg8) {
        int v1;
        int v0;
        if(arg4 == arg6) {
            if(arg5 == arg7) {
                return;
            }
            else if(arg7 > arg5 && arg7 < arg5 + arg8) {
                --arg8;
                arg5 += arg8;
                arg7 += arg8;
                arg8 = arg5 - arg8 + 3;
                while(arg5 >= arg8) {
                    v0 = arg7 - 1;
                    v1 = arg5 - 1;
                    arg6[arg7] = arg4[arg5];
                    arg5 = v0 - 1;
                    arg7 = v1 - 1;
                    arg6[v0] = arg4[v1];
                    v0 = arg5 - 1;
                    v1 = arg7 - 1;
                    arg6[arg5] = arg4[arg7];
                    arg7 = v0 - 1;
                    arg5 = v1 - 1;
                    arg6[v0] = arg4[v1];
                }

                arg8 += -3;
                while(arg5 >= arg8) {
                    arg6[arg7] = arg4[arg5];
                    --arg7;
                    --arg5;
                }

                return;
            }
        }

        arg8 = arg8 + arg5 - 3;
        while(arg5 < arg8) {
            v0 = arg7 + 1;
            v1 = arg5 + 1;
            arg6[arg7] = arg4[arg5];
            arg5 = v0 + 1;
            arg7 = v1 + 1;
            arg6[v0] = arg4[v1];
            v0 = arg5 + 1;
            v1 = arg7 + 1;
            arg6[arg5] = arg4[arg7];
            arg7 = v0 + 1;
            arg5 = v1 + 1;
            arg6[v0] = arg4[v1];
        }

        arg8 += 3;
        while(arg5 < arg8) {
            arg6[arg7] = arg4[arg5];
            ++arg7;
            ++arg5;
        }
    }

    static void bq(Object[] arg2, int arg3, Object[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void bt(boolean[] arg2, int arg3, boolean[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void bv(Object[] arg2, int arg3, Object[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void bw(double[] arg4, int arg5, double[] arg6, int arg7, int arg8) {
        int v1;
        int v0;
        if(arg4 == arg6) {
            if(arg5 == arg7) {
                return;
            }
            else if(arg7 > arg5 && arg7 < arg5 + arg8) {
                --arg8;
                arg5 += arg8;
                arg7 += arg8;
                arg8 = arg5 - arg8 + 3;
                while(arg5 >= arg8) {
                    v0 = arg7 - 1;
                    v1 = arg5 - 1;
                    arg6[arg7] = arg4[arg5];
                    arg5 = v0 - 1;
                    arg7 = v1 - 1;
                    arg6[v0] = arg4[v1];
                    v0 = arg5 - 1;
                    v1 = arg7 - 1;
                    arg6[arg5] = arg4[arg7];
                    arg7 = v0 - 1;
                    arg5 = v1 - 1;
                    arg6[v0] = arg4[v1];
                }

                arg8 += -3;
                while(arg5 >= arg8) {
                    arg6[arg7] = arg4[arg5];
                    --arg7;
                    --arg5;
                }

                return;
            }
        }

        arg8 = arg8 + arg5 - 3;
        while(arg5 < arg8) {
            v0 = arg7 + 1;
            v1 = arg5 + 1;
            arg6[arg7] = arg4[arg5];
            arg5 = v0 + 1;
            arg7 = v1 + 1;
            arg6[v0] = arg4[v1];
            v0 = arg5 + 1;
            v1 = arg7 + 1;
            arg6[arg5] = arg4[arg7];
            arg7 = v0 + 1;
            arg5 = v1 + 1;
            arg6[v0] = arg4[v1];
        }

        arg8 += 3;
        while(arg5 < arg8) {
            arg6[arg7] = arg4[arg5];
            ++arg7;
            ++arg5;
        }
    }

    static void bx(Object[] arg2, int arg3, Object[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    static void by(boolean[] arg2, int arg3, boolean[] arg4, int arg5, int arg6) {
        int v1;
        int v0;
        if(arg2 == arg4) {
            if(arg3 == arg5) {
                return;
            }
            else if(arg5 > arg3 && arg5 < arg3 + arg6) {
                --arg6;
                arg3 += arg6;
                arg5 += arg6;
                arg6 = arg3 - arg6 + 7;
                while(arg3 >= arg6) {
                    v0 = arg5 - 1;
                    v1 = arg3 - 1;
                    arg4[arg5] = arg2[arg3];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg3 = v0 - 1;
                    arg5 = v1 - 1;
                    arg4[v0] = arg2[v1];
                    v0 = arg3 - 1;
                    v1 = arg5 - 1;
                    arg4[arg3] = arg2[arg5];
                    arg5 = v0 - 1;
                    arg3 = v1 - 1;
                    arg4[v0] = arg2[v1];
                }

                arg6 += -7;
                while(arg3 >= arg6) {
                    arg4[arg5] = arg2[arg3];
                    --arg5;
                    --arg3;
                }

                return;
            }
        }

        arg6 = arg6 + arg3 - 7;
        while(arg3 < arg6) {
            v0 = arg5 + 1;
            v1 = arg3 + 1;
            arg4[arg5] = arg2[arg3];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg3 = v0 + 1;
            arg5 = v1 + 1;
            arg4[v0] = arg2[v1];
            v0 = arg3 + 1;
            v1 = arg5 + 1;
            arg4[arg3] = arg2[arg5];
            arg5 = v0 + 1;
            arg3 = v1 + 1;
            arg4[v0] = arg2[v1];
        }

        arg6 += 7;
        while(arg3 < arg6) {
            arg4[arg5] = arg2[arg3];
            ++arg5;
            ++arg3;
        }
    }

    public static void bz(int[] arg2, int arg3, int arg4) {
        arg4 = arg4 + arg3 - 7;
        while(arg3 < arg4) {
            int v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
            v1 = arg3 + 1;
            arg2[arg3] = 0;
            arg3 = v1 + 1;
            arg2[v1] = 0;
        }

        arg4 += 7;
        while(arg3 < arg4) {
            arg2[arg3] = 0;
            ++arg3;
        }
    }
}

