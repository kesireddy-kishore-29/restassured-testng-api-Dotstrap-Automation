# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-fa6a324d-2351-438c-938f-1844b0aa0ec5` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-8618eac8-9e23-4b75-8ee6-cb27e76bfdb0` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-f35bc677-ab10-4d87-8553-6f386b06a1fd` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-51854572-7419-4d6e-b3de-7859b19665bd` |
| 5 | `GET /v1/credits/balance` | 503 | 8 | `qa-0cf20414-6196-4eb6-8b49-f80e1c4978cb` |
| 6 | `POST /v1/auth/token` | 200 | 55 | `qa-2978fb3b-3fc4-4e2e-89a0-6d4d6cf1b251` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-1fee861d-60ae-4850-a401-8da97bc43fd1` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-c0ae9e0a-144f-4387-b44d-33ea36627687` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c2c400bb-7803-4bbf-b6e6-af7634c1b3ee` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-11a13003-0b19-481d-95ad-b19ec607f3ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa6a324d-2351-438c-938f-1844b0aa0ec5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6a324d-2351-438c-938f-1844b0aa0ec5
Content-Type: application/json

--- request body ---
{"handle":"qa-a8959b646612","displayName":"QA a8959b646612","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa6a324d-2351-438c-938f-1844b0aa0ec5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 7
Location: /v1/accounts/qa-a8959b646612
X-Served-Region: eu
Content-Length: 181

{"id":"acc_15f78dcc-27fe-49e2-8552-21a5a76f957f","handle":"qa-a8959b646612","displayName":"QA a8959b646612","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.220741868Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8618eac8-9e23-4b75-8ee6-cb27e76bfdb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8618eac8-9e23-4b75-8ee6-cb27e76bfdb0
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9873d3fc5f","displayName":"QA 0a9873d3fc5f","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8618eac8-9e23-4b75-8ee6-cb27e76bfdb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Location: /v1/accounts/qa-0a9873d3fc5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b4d3f6cc-8c11-4a0c-a8dd-82fe27d232bd","handle":"qa-0a9873d3fc5f","displayName":"QA 0a9873d3fc5f","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.258933515Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f35bc677-ab10-4d87-8553-6f386b06a1fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f35bc677-ab10-4d87-8553-6f386b06a1fd
Content-Type: application/json

--- request body ---
{"handle":"qa-a8959b646612","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f35bc677-ab10-4d87-8553-6f386b06a1fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_15f78dcc-27fe-49e2-8552-21a5a76f957f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-51854572-7419-4d6e-b3de-7859b19665bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51854572-7419-4d6e-b3de-7859b19665bd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0a9873d3fc5f","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-51854572-7419-4d6e-b3de-7859b19665bd
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
Location: /v1/conversations/cnv_f75ba6d7-35b5-4b06-8d84-1a4c5ebf4c4c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f75ba6d7-35b5-4b06-8d84-1a4c5ebf4c4c","subject":"Error contract","status":"open","region":"eu","participants":["qa-a8959b646612","qa-0a9873d3fc5f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.308391735Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-0cf20414-6196-4eb6-8b49-f80e1c4978cb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2fc39b68-6487-4626-87ac-b2d26f375f44
X-Correlation-Id: qa-0cf20414-6196-4eb6-8b49-f80e1c4978cb
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cf20414-6196-4eb6-8b49-f80e1c4978cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-0cf20414-6196-4eb6-8b49-f80e1c4978cb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2978fb3b-3fc4-4e2e-89a0-6d4d6cf1b251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2978fb3b-3fc4-4e2e-89a0-6d4d6cf1b251
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9873d3fc5f","password":"****"}

--- response: 200 in 55 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2978fb3b-3fc4-4e2e-89a0-6d4d6cf1b251
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b4d3f6cc-8c11-4a0c-a8dd-82fe27d232bd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1fee861d-60ae-4850-a401-8da97bc43fd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fee861d-60ae-4850-a401-8da97bc43fd1
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1fee861d-60ae-4850-a401-8da97bc43fd1
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
correlation: qa-c0ae9e0a-144f-4387-b44d-33ea36627687

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ae9e0a-144f-4387-b44d-33ea36627687
Content-Type: application/json

--- request body ---
{"handle":"qa-0a9873d3fc5f","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0ae9e0a-144f-4387-b44d-33ea36627687
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0ae9e0a-144f-4387-b44d-33ea36627687"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2c400bb-7803-4bbf-b6e6-af7634c1b3ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2c400bb-7803-4bbf-b6e6-af7634c1b3ee
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2c400bb-7803-4bbf-b6e6-af7634c1b3ee
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
correlation: qa-11a13003-0b19-481d-95ad-b19ec607f3ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11a13003-0b19-481d-95ad-b19ec607f3ee
Content-Type: application/json

--- request body ---
{"handle":"qa-a8959b646612","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11a13003-0b19-481d-95ad-b19ec607f3ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-11a13003-0b19-481d-95ad-b19ec607f3ee"}
```
