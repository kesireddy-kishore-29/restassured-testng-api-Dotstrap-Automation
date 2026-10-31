# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-48874993-e7be-4883-82bd-7d9af2493de9` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-4e243bda-726d-4599-b93a-4a7dc7246138` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-c1705f6f-7ea0-415b-9392-c083a305d2d5` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-d63f80ed-40ee-4da7-b619-b97d2d1ec097` |
| 5 | `GET /v1/conversations` | 503 | 8 | `qa-5c4ecfbe-3881-4e7d-9006-e79d9fd1096e` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-c8a62fa9-b3bd-4c7d-8a30-921f715bdb14` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-fa6443c8-0dfd-4849-8e6b-23f2fdadec4b` |
| 8 | `POST /v1/auth/token` | 401 | 35 | `qa-17d4da62-4dbc-40a0-8266-0ec8c14cee47` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-ecd9ce91-29f9-4cfa-9a61-d7cbe0252264` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-6ffeb3da-2627-4993-ad69-abddbbba6071` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-48874993-e7be-4883-82bd-7d9af2493de9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48874993-e7be-4883-82bd-7d9af2493de9
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b2ba0c1112","displayName":"QA e5b2ba0c1112","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-48874993-e7be-4883-82bd-7d9af2493de9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 9
Location: /v1/accounts/qa-e5b2ba0c1112
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd344596-88d0-42ce-86d3-970234d1d317","handle":"qa-e5b2ba0c1112","displayName":"QA e5b2ba0c1112","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.366922439Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4e243bda-726d-4599-b93a-4a7dc7246138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e243bda-726d-4599-b93a-4a7dc7246138
Content-Type: application/json

--- request body ---
{"handle":"qa-51ce5cb014ed","displayName":"QA 51ce5cb014ed","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e243bda-726d-4599-b93a-4a7dc7246138
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 9
Location: /v1/accounts/qa-51ce5cb014ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b0095ed-a439-4554-950d-b5fca5b93f49","handle":"qa-51ce5cb014ed","displayName":"QA 51ce5cb014ed","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.406588801Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1705f6f-7ea0-415b-9392-c083a305d2d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1705f6f-7ea0-415b-9392-c083a305d2d5
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b2ba0c1112","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1705f6f-7ea0-415b-9392-c083a305d2d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd344596-88d0-42ce-86d3-970234d1d317"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d63f80ed-40ee-4da7-b619-b97d2d1ec097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d63f80ed-40ee-4da7-b619-b97d2d1ec097
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-51ce5cb014ed","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d63f80ed-40ee-4da7-b619-b97d2d1ec097
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
Location: /v1/conversations/cnv_2e076232-5137-44ec-931d-d9f698107f04
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2e076232-5137-44ec-931d-d9f698107f04","subject":"Error contract","status":"open","region":"eu","participants":["qa-e5b2ba0c1112","qa-51ce5cb014ed"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.540588987Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-5c4ecfbe-3881-4e7d-9006-e79d9fd1096e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a12c100e-26c4-42e3-9bfa-51fc6da0c56d
X-Correlation-Id: qa-5c4ecfbe-3881-4e7d-9006-e79d9fd1096e
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c4ecfbe-3881-4e7d-9006-e79d9fd1096e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-5c4ecfbe-3881-4e7d-9006-e79d9fd1096e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c8a62fa9-b3bd-4c7d-8a30-921f715bdb14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a62fa9-b3bd-4c7d-8a30-921f715bdb14
Content-Type: application/json

--- request body ---
{"handle":"qa-51ce5cb014ed","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8a62fa9-b3bd-4c7d-8a30-921f715bdb14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b0095ed-a439-4554-950d-b5fca5b93f49"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa6443c8-0dfd-4849-8e6b-23f2fdadec4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6443c8-0dfd-4849-8e6b-23f2fdadec4b
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa6443c8-0dfd-4849-8e6b-23f2fdadec4b
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-17d4da62-4dbc-40a0-8266-0ec8c14cee47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d4da62-4dbc-40a0-8266-0ec8c14cee47
Content-Type: application/json

--- request body ---
{"handle":"qa-51ce5cb014ed","password":"****"}

--- response: 401 in 35 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17d4da62-4dbc-40a0-8266-0ec8c14cee47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17d4da62-4dbc-40a0-8266-0ec8c14cee47"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ecd9ce91-29f9-4cfa-9a61-d7cbe0252264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecd9ce91-29f9-4cfa-9a61-d7cbe0252264
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ecd9ce91-29f9-4cfa-9a61-d7cbe0252264
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6ffeb3da-2627-4993-ad69-abddbbba6071

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ffeb3da-2627-4993-ad69-abddbbba6071
Content-Type: application/json

--- request body ---
{"handle":"qa-e5b2ba0c1112","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ffeb3da-2627-4993-ad69-abddbbba6071
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ffeb3da-2627-4993-ad69-abddbbba6071"}
```
