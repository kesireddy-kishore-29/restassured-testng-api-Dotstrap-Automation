# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-8d1cf9e6-3023-4ea8-8cf4-6c353b1a215e` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-53fd1f68-0c90-4130-941e-727ce9742a37` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-7f060a04-fab0-4a7c-b4fe-ff80a626bdf4` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-94ff7546-4c9a-4c3d-8c9c-f372b30815ea` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 9 | `qa-3b010a93-61fe-4d54-bf75-d34afba2a1a2` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-c6d618bf-4889-4d14-8eea-52e8000c6cfc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-30620d36-8964-4a0a-bf96-189ad159fe80` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-ce52c179-40e7-4900-b546-e7494cc20387` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-ab97d674-272d-4f06-af73-df68983e4ae7` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-c90bc40d-3ad1-4b87-b9b3-313ed86621fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8d1cf9e6-3023-4ea8-8cf4-6c353b1a215e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d1cf9e6-3023-4ea8-8cf4-6c353b1a215e
Content-Type: application/json

--- request body ---
{"handle":"qa-daa4c901a4a6","displayName":"QA daa4c901a4a6","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d1cf9e6-3023-4ea8-8cf4-6c353b1a215e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-daa4c901a4a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f5df35bc-8a25-4e0a-9c60-e0088c20da1c","handle":"qa-daa4c901a4a6","displayName":"QA daa4c901a4a6","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.921535741Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-53fd1f68-0c90-4130-941e-727ce9742a37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53fd1f68-0c90-4130-941e-727ce9742a37
Content-Type: application/json

--- request body ---
{"handle":"qa-24f20768f49d","displayName":"QA 24f20768f49d","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-53fd1f68-0c90-4130-941e-727ce9742a37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Location: /v1/accounts/qa-24f20768f49d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8e8555f-0f36-40e2-a798-5b4b013d633f","handle":"qa-24f20768f49d","displayName":"QA 24f20768f49d","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.940995895Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7f060a04-fab0-4a7c-b4fe-ff80a626bdf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f060a04-fab0-4a7c-b4fe-ff80a626bdf4
Content-Type: application/json

--- request body ---
{"handle":"qa-daa4c901a4a6","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f060a04-fab0-4a7c-b4fe-ff80a626bdf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f5df35bc-8a25-4e0a-9c60-e0088c20da1c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-94ff7546-4c9a-4c3d-8c9c-f372b30815ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94ff7546-4c9a-4c3d-8c9c-f372b30815ea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-24f20768f49d","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-94ff7546-4c9a-4c3d-8c9c-f372b30815ea
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
Location: /v1/conversations/cnv_213131b5-6d04-4b88-8874-4287c2792c06
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_213131b5-6d04-4b88-8874-4287c2792c06","subject":"Error contract","status":"open","region":"eu","participants":["qa-daa4c901a4a6","qa-24f20768f49d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.982679029Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_213131b5-6d04-4b88-8874-4287c2792c06/messages
correlation: qa-3b010a93-61fe-4d54-bf75-d34afba2a1a2

--- request headers ---
Accept: application/json
X-Fault-Key: 2e5ff219-89a7-4d1a-825d-4bf68c80fcc5
X-Fault: unavailable-once
X-Correlation-Id: qa-3b010a93-61fe-4d54-bf75-d34afba2a1a2
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b010a93-61fe-4d54-bf75-d34afba2a1a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_213131b5-6d04-4b88-8874-4287c2792c06/messages","correlationId":"qa-3b010a93-61fe-4d54-bf75-d34afba2a1a2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c6d618bf-4889-4d14-8eea-52e8000c6cfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d618bf-4889-4d14-8eea-52e8000c6cfc
Content-Type: application/json

--- request body ---
{"handle":"qa-24f20768f49d","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6d618bf-4889-4d14-8eea-52e8000c6cfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8e8555f-0f36-40e2-a798-5b4b013d633f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30620d36-8964-4a0a-bf96-189ad159fe80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30620d36-8964-4a0a-bf96-189ad159fe80
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30620d36-8964-4a0a-bf96-189ad159fe80
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
correlation: qa-ce52c179-40e7-4900-b546-e7494cc20387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce52c179-40e7-4900-b546-e7494cc20387
Content-Type: application/json

--- request body ---
{"handle":"qa-24f20768f49d","password":"****"}

--- response: 401 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce52c179-40e7-4900-b546-e7494cc20387
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce52c179-40e7-4900-b546-e7494cc20387"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab97d674-272d-4f06-af73-df68983e4ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab97d674-272d-4f06-af73-df68983e4ae7
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab97d674-272d-4f06-af73-df68983e4ae7
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
correlation: qa-c90bc40d-3ad1-4b87-b9b3-313ed86621fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c90bc40d-3ad1-4b87-b9b3-313ed86621fe
Content-Type: application/json

--- request body ---
{"handle":"qa-daa4c901a4a6","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c90bc40d-3ad1-4b87-b9b3-313ed86621fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c90bc40d-3ad1-4b87-b9b3-313ed86621fe"}
```
