# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 669 | `qa-094955b2-23e4-42eb-a13d-4ad8a1a67642` |
| 2 | `POST /v1/accounts` | 201 | 92 | `qa-04e8ae4d-36ff-4e1e-8d13-7c9cf0d6332c` |
| 3 | `POST /v1/accounts` | 201 | 78 | `qa-b9cb8f3c-4faa-4ab5-8a5e-98224218c450` |
| 4 | `POST /v1/auth/token` | 200 | 55 | `qa-a3eb3369-c1a1-42af-8637-28c609da6394` |
| 5 | `POST /v1/conversations` | 201 | 67 | `qa-1ec5eb3b-6a0e-4cc3-b2ea-0ca6747042bd` |
| 6 | `POST /v1/auth/token` | 200 | 65 | `qa-901dafa4-4a4e-41de-9af8-80a05c02502a` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 11 | `qa-287a392c-706c-4c8c-bb30-8d8b2eac162e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-1868e383-799f-496d-be27-c481ce84f134` |
| 9 | `POST /v1/auth/token` | 401 | 37 | `qa-d0b3d4e8-5001-4b68-b6e3-e09118b7a487` |
| 10 | `POST /v1/auth/token` | 200 | 33 | `qa-609a9dfd-1cb9-4aae-a3d4-996484390937` |
| 11 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e23265a0-c6c8-42fc-84bb-5553af0fe4ea` |
| 12 | `POST /v1/auth/token` | 401 | 24 | `qa-2a22b7f4-cb27-4fc6-83ed-dbba92e41d96` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-271f3f0f-2c81-44a4-b3e0-c1562dae186e` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-198b94e1-8b02-47e4-94e8-a0664bbcf822` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-094955b2-23e4-42eb-a13d-4ad8a1a67642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-094955b2-23e4-42eb-a13d-4ad8a1a67642
Content-Type: application/json

--- request body ---
{"handle":"qa-da0e8f79befc","displayName":"QA da0e8f79befc","password":"****","region":"eu"}

--- response: 201 in 669 ms ---
Date: Sat, 31 Oct 2026 08:31:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-094955b2-23e4-42eb-a13d-4ad8a1a67642
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Location: /v1/accounts/qa-da0e8f79befc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fa66f876-eaed-488a-8767-f2d42cbb4e66","handle":"qa-da0e8f79befc","displayName":"QA da0e8f79befc","region":"eu","role":"user","createdAt":"2026-10-31T08:31:32.875819829Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-04e8ae4d-36ff-4e1e-8d13-7c9cf0d6332c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04e8ae4d-36ff-4e1e-8d13-7c9cf0d6332c
Content-Type: application/json

--- request body ---
{"handle":"qa-31941f2360eb","displayName":"QA 31941f2360eb","password":"****","region":"eu"}

--- response: 201 in 92 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-04e8ae4d-36ff-4e1e-8d13-7c9cf0d6332c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-31941f2360eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7dba8df0-2034-4e7e-8ac1-98cbad343f08","handle":"qa-31941f2360eb","displayName":"QA 31941f2360eb","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.339991985Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-b9cb8f3c-4faa-4ab5-8a5e-98224218c450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9cb8f3c-4faa-4ab5-8a5e-98224218c450
Content-Type: application/json

--- request body ---
{"handle":"qa-a6bd95583db2","displayName":"QA a6bd95583db2","password":"****","region":"eu"}

--- response: 201 in 78 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9cb8f3c-4faa-4ab5-8a5e-98224218c450
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Location: /v1/accounts/qa-a6bd95583db2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9715ead5-48a9-401d-823b-60edfcc35dca","handle":"qa-a6bd95583db2","displayName":"QA a6bd95583db2","region":"eu","role":"user","createdAt":"2026-10-31T08:31:33.442091553Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a3eb3369-c1a1-42af-8637-28c609da6394

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3eb3369-c1a1-42af-8637-28c609da6394
Content-Type: application/json

--- request body ---
{"handle":"qa-da0e8f79befc","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3eb3369-c1a1-42af-8637-28c609da6394
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fa66f876-eaed-488a-8767-f2d42cbb4e66"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1ec5eb3b-6a0e-4cc3-b2ea-0ca6747042bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ec5eb3b-6a0e-4cc3-b2ea-0ca6747042bd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-31941f2360eb","subject":"Error contract","message":"Hi"}

--- response: 201 in 67 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ec5eb3b-6a0e-4cc3-b2ea-0ca6747042bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_cafb079d-bdfe-46e6-9c0f-7b01930b3f75
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cafb079d-bdfe-46e6-9c0f-7b01930b3f75","subject":"Error contract","status":"open","region":"eu","participants":["qa-da0e8f79befc","qa-31941f2360eb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:33.576177356Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-901dafa4-4a4e-41de-9af8-80a05c02502a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-901dafa4-4a4e-41de-9af8-80a05c02502a
Content-Type: application/json

--- request body ---
{"handle":"qa-a6bd95583db2","password":"****"}

--- response: 200 in 65 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-901dafa4-4a4e-41de-9af8-80a05c02502a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9715ead5-48a9-401d-823b-60edfcc35dca"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_cafb079d-bdfe-46e6-9c0f-7b01930b3f75/read
correlation: qa-287a392c-706c-4c8c-bb30-8d8b2eac162e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-287a392c-706c-4c8c-bb30-8d8b2eac162e
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-287a392c-706c-4c8c-bb30-8d8b2eac162e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_cafb079d-bdfe-46e6-9c0f-7b01930b3f75/read","correlationId":"qa-287a392c-706c-4c8c-bb30-8d8b2eac162e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1868e383-799f-496d-be27-c481ce84f134

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1868e383-799f-496d-be27-c481ce84f134
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1868e383-799f-496d-be27-c481ce84f134
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-d0b3d4e8-5001-4b68-b6e3-e09118b7a487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0b3d4e8-5001-4b68-b6e3-e09118b7a487
Content-Type: application/json

--- request body ---
{"handle":"qa-a6bd95583db2","password":"****"}

--- response: 401 in 37 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0b3d4e8-5001-4b68-b6e3-e09118b7a487
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0b3d4e8-5001-4b68-b6e3-e09118b7a487"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-609a9dfd-1cb9-4aae-a3d4-996484390937

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-609a9dfd-1cb9-4aae-a3d4-996484390937
Content-Type: application/json

--- request body ---
{"handle":"qa-31941f2360eb","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-609a9dfd-1cb9-4aae-a3d4-996484390937
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7dba8df0-2034-4e7e-8ac1-98cbad343f08"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e23265a0-c6c8-42fc-84bb-5553af0fe4ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e23265a0-c6c8-42fc-84bb-5553af0fe4ea
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e23265a0-c6c8-42fc-84bb-5553af0fe4ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-2a22b7f4-cb27-4fc6-83ed-dbba92e41d96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a22b7f4-cb27-4fc6-83ed-dbba92e41d96
Content-Type: application/json

--- request body ---
{"handle":"qa-31941f2360eb","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a22b7f4-cb27-4fc6-83ed-dbba92e41d96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2a22b7f4-cb27-4fc6-83ed-dbba92e41d96"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-271f3f0f-2c81-44a4-b3e0-c1562dae186e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-271f3f0f-2c81-44a4-b3e0-c1562dae186e
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-271f3f0f-2c81-44a4-b3e0-c1562dae186e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-198b94e1-8b02-47e4-94e8-a0664bbcf822

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-198b94e1-8b02-47e4-94e8-a0664bbcf822
Content-Type: application/json

--- request body ---
{"handle":"qa-da0e8f79befc","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-198b94e1-8b02-47e4-94e8-a0664bbcf822
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-198b94e1-8b02-47e4-94e8-a0664bbcf822"}
```
