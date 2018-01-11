# -*- coding:utf-8 -*-
'''
Created on 2018年1月4日

@author: jco657
'''
from django.http import HttpResponse

def hello(request):
    return HttpResponse('Hello World!')