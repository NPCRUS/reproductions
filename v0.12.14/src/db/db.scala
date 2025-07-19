package db

import java.util.UUID

def fetchUserId: String = 
  String(UUID.randomUUID().toString())
